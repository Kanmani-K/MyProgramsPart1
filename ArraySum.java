import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArraySum {

    static void miniMaxSum(int[] arr) {
        // Complete this function
        long sum[]=new long[5];
	long max=0,min=4000000000;
        for(int i=0;i<5;i++)
        {
            sum[i]=0;
            for(int j=0;j<5;j++)
            {
                               
                if(!(j==i))
                    sum[i]+=arr[j];
		
            }
		System.out.println(sum[i]);
		if(sum[i]>max)
		{
			max=sum[i];
			
		}
		else if(sum[i]<min)
		{
		
			min=sum[i];
		}
        }
	System.out.println(max +"\t"+min);
            
       
   }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();               
    }
}