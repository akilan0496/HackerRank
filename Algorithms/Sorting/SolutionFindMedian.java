import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionFindMedian {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){            
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        int median;
        if (a.length % 2 == 0)
            median = (a[a.length/2] + a[a.length/2 - 1])/2;
        else
            median = a[a.length/2];
        System.out.println(median);
    }
}