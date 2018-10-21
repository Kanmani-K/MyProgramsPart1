import java.util.Scanner;

public class BirthdayCake{
static int max=0,sum=0;
    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        
        for(int i=0;i<n;i++)
        {
            if(ar[i]>max)
                max=ar[i];
		System.out.println(max);
        }
        for(int i=0;i<n;i++)
        {
           
            if(ar[i]==max)
                sum+=1;
            
        }
        
          return sum;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
