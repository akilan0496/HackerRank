import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionQuicksortInPlace {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = in.nextInt();
        }
        quickSort(a, 0, n-1);
        
    }
    
    static void quickSort(int[] a, int low, int high) {
       if(low  < high) {
           int pi = partition(a, low, high);           
            printArray(a);
           quickSort(a, low, pi-1);
           quickSort(a, pi+1, high);
           
       }
        
    }
    
    static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int iterator = low;
        
        for(int i=low;i<high;i++) {
            if(a[i] < pivot) {
                int tmp = a[i];
                a[i] = a[iterator];
                a[iterator] = tmp;
                iterator++;
            }
        }
        int tmp = a[high];
        a[high] = a[iterator];
        a[iterator] = tmp;
        
        return iterator;
        
    }
   
    
    static void printArray(int[] a) {
        for(int val: a) {
            System.out.print(val+ " ");
        }
        System.out.println("");
    }
}