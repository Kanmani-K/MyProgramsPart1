import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SumOfDiagnol {

    static int diagonalDifference(int[][] a) {
        // Complete this function
        int n=a.length,i=0,j=0,sumD1=0,sumD2=0;
       //sum of Primary Diagnol
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
			//System.out.print(a[i][j]);
                    sumD1+=a[i][j];
              }
            
        }
	System.out.println(sumD1);
        //sum of Secondary diagnol
        for(i=0;i<n;i++)
        {
           for(j=0;j<n;j++)
           {
                int s=i+j;
                    if(s==n-1)
			{
			//System.out.print(a[i][j]);
                        sumD2+=a[i][j];
			}
             }
        }
	System.out.println(sumD2);
        return(Math.abs(sumD1-sumD2));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}
