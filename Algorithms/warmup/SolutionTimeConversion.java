import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionTimeConversion {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
        Date date = parseFormat.parse(time);
        System.out.println(displayFormat.format(date));
    }
}