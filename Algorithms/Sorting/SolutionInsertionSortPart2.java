package insertionSort;

import java.util.Scanner;


public class SolutionInsertionSortPart2 {

    public static void insertionSortPart2(int[] ar)
    {       
           // Fill up the code for the required logic here
           // Manipulate the array as required
           // The code for Input/Output is already provided
    	
    	for(int j=1;j<ar.length;j++) {
    		
    		int key = ar[j];
    		int keyPos = j;
    		
    		for(int i=keyPos-1;i>=0;i--){
    			if(key < ar[i]) {
    				ar[i+1] = ar[i];
    				ar[i] = key;
    			} else {
    				break;
    			}
    		}
    		
    		printArray(ar);
    	}
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
