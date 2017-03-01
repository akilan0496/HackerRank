import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionPlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int positiveNosCount = 0;
        int negativeNosCount = 0;
        int zeroCount = 0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            positiveNosCount = arr[arr_i] > 0 ? positiveNosCount+1 : positiveNosCount;
            negativeNosCount = arr[arr_i] < 0 ? negativeNosCount+1 : negativeNosCount;
            zeroCount = arr[arr_i] == 0 ? zeroCount+1 : zeroCount;
        }

        System.out.println((float)positiveNosCount/n);
        System.out.println((float)negativeNosCount/n);
        System.out.println((float)zeroCount/n);

    }
}
