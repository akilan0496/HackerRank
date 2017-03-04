import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionFullCountingSort {
    public static void main(String[] args)throws Exception {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(in.readLine());
		int[] c=new int[100];
		String[][] dt=new String[100][10300];
		for(int i=0;i<n;i++) {
			String[] str=in.readLine().split(" ");
			int val=Integer.parseInt(str[0]);
			if(i<n/2) {
				dt[val][c[val]]="-";
			} else {
				dt[val][c[val]]=str[1];
			}
			c[val]++;
		}
		StringBuilder sb=new StringBuilder("");
		for(int i=0;i<100;i++)
		   if(i<n)
			for(int k=0;k<c[i];k++)
				if(dt[i][k]!=null)
				   sb.append(dt[i][k]+" ");
				else break;
		System.out.println(sb.toString());
	}
}