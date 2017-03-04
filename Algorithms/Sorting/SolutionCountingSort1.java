import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionCountingSort1 {

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
        
        
        for(int i =0; i < hm.size(); i++){
            int resultValue =0;
            if(hm.containsKey(i)){
                resultValue = resultValue + hm.get(i);
                System.out.print(resultValue + " ");
            }else{
                System.out.print(resultValue + " ");
            }
        }
    }
}