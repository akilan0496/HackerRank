import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionStaircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++) {
            for(int j=1;j<=n;j++) {
               System.out.print(j<n-i ? " ": "#");
            }
            System.out.println("");
        }
    }
}