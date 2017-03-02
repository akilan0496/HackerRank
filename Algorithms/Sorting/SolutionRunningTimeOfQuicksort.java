import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionRunningTimeOfQuicksort {
    
    int quickSortSwap = 0;
    int insertionSortShift = 0;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named SolutionRunningTimeOfQuicksort. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] qSort = new int[n];
        int[] iSort = new int[n];
        for(int i=0;i<n;i++) {
            qSort[i] = in.nextInt();
            iSort[i] = qSort[i];
        }
        SolutionRunningTimeOfQuicksort sol = new SolutionRunningTimeOfQuicksort();
        quickSort(qSort, 0, n-1, sol);
        insertionSortPart2(iSort, sol);
        System.out.println(sol.insertionSortShift - sol.quickSortSwap);
        
    }
    
    static void insertionSortPart2(int[] ar, SolutionRunningTimeOfQuicksort sol) {       
           // Fill up the code for the required logic here
           // Manipulate the array as required
           // The code for Input/Output is already provided
    	
	for(int j=1;j<ar.length;j++) {
            
    		int key = ar[j];
    		int keyComparePos = j -1;
    		
    		for(int i=keyComparePos;i>=0 && key < ar[i];i--){
    			ar[i+1] = ar[i];
    			ar[i] = key;
			sol.insertionSortShift += 1;
    		}
    	}
    }
    
    static void quickSort(int[] a, int low, int high, SolutionRunningTimeOfQuicksort sol) {
       if(low  < high) {
           int pi = partition(a, low, high, sol);           
           quickSort(a, low, pi-1, sol);
           quickSort(a, pi+1, high, sol);
           
       }
        
    }
    
    static int partition(int[] a, int low, int high, SolutionRunningTimeOfQuicksort sol) {
        int pivot = a[high];
        int iterator = low;
        
        
        
        for(int i=low;i<high;i++) {
            if(a[i] < pivot) {
                int tmp = a[i];
                a[i] = a[iterator];
                a[iterator] = tmp;
                iterator++;
                sol.quickSortSwap += 1;
            }
        }
        int tmp = a[high];
        a[high] = a[iterator];
        a[iterator] = tmp;
        sol.quickSortSwap += 1;
        
        return iterator;
        
    }
   
    
    static void printArray(int[] a) {
        for(int val: a) {
            System.out.print(val+ " ");
        }
        System.out.println("");
    }
}