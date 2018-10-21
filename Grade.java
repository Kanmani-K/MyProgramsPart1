import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Grade {

    static int[] solve(int[] a){
        // Complete this function
        for(int i=0;i<a.length;i++)
        {
           if(a[i]>=38)
           {
            int r=a[i]/5;
           int r1=(r+1)*5;
	System.out.println(r1);
            if(r1-a[i]<3)
                a[i]=r1;
           }
        }
        return a;
      }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
