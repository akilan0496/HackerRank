import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionCountingSort2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0; i < n; i++){
            int numberInput = in.nextInt();
            if(hm.containsKey(numberInput)){
                hm.put(numberInput, hm.get(numberInput) + 1);
            }else{
                hm.put(numberInput, 1);
            }
            //in.next();
        }
        
        
        for(int i =0; i < n; i++){
            
            if(hm.containsKey(i)){
                for(int j=0;j<hm.get(i);j++) {
                   System.out.print(i + " "); 
                }
            }
        }
    }
}