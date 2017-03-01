import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionCompareTriplets {
    
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aliceScore = 0;
        int bobScore = 0;
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        aliceScore = calc(a0,b0) == 1 ? aliceScore+1 : aliceScore;
        bobScore = calc(a0,b0) == 0 ? bobScore+1 : bobScore;
        aliceScore = calc(a1,b1) == 1 ? aliceScore+1 : aliceScore;
        bobScore = calc(a1,b1) == 0 ? bobScore+1 : bobScore;
        aliceScore = calc(a2,b2) == 1 ? aliceScore+1 : aliceScore;
        bobScore = calc(a2,b2) == 0 ? bobScore+1 : bobScore;
        
        System.out.print(aliceScore +" "+bobScore);
    }
    
    static int calc(int a, int b) {
        return a > b ? 1 : ((a == b) ? -1 : 0);
        
    }
}	