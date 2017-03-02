import java.util.*;
public class SolutionQuicksort1 {
       
          static void partition(int[] ar) {
              int pivot = ar[0];
              int pindex = ar.length -1;
              
              for(int i=ar.length -1;i>0;i--) {
              
                  if(ar[i] > pivot) {
                      int tmp = ar[i];
                      ar[i] = ar[pindex];
                      ar[pindex] = tmp;
                  
                      pindex--;
                  }
              }
              int tmp = ar[0];
              ar[0] = ar[pindex];
              ar[pindex] = tmp;
              
              printArray(ar);
       }   
 
 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           partition(ar);
       }    
   }
