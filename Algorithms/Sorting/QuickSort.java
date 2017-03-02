import java.util.*;
public class QuickSort {
       
          static void partition(int[] ar, int left, int right) {
              int n = ar.length;
              int pivot = ar[left + (right - left) / 2];
              int i = left;
              int j = right;
              while (i <= j) {
                  while (ar[i] < pivot) {
                      i++;
                  }
                  while (ar[j] > pivot) {
                      j--;
                  }
                  if (i <= j) {
                      int temp = ar[i];
                      ar[i] = ar[j];
                      ar[j] = temp;
                      i++;
                      j--;
                  }
              }
              if(left < j)
                  partition(ar,left,j);
              if(i < right)
                  partition(ar,i,right);
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
           partition(ar, 0, ar.length-1);
       }    
   }
