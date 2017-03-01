import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int dig1 = 0;
        int dig2 = 0;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
                
            }
        }
        
        for(int i=0;i<n;i++) {
            dig1 += a[i][i];
            for(int j=n-i-1;j>=0;j--) {
                dig2 += a[i][j];
                break;
            }
        }
        int res = dig1-dig2;
        
        System.out.print(res > 0 ? res : -1 * res);
    }
}