package insertionSort;

import java.util.Scanner;

public class SolutionInsertionSortPart1 {
    
    public static void insertIntoSorted(int[] ar) {
        // Fill up this function  
        int valueToBeCompared = ar[ar.length -1];
        for(int i=ar.length-2;i>=0;i--) {
            if(valueToBeCompared <= ar[i]){
                ar[i+1] = ar[i];
                printArray(ar);
                if(i == 0) {
                	ar[i] = valueToBeCompared;
                	printArray(ar);
                }
            } else {
                ar[i+1]= valueToBeCompared;
                printArray(ar);
                break;
            }
            
        }
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
