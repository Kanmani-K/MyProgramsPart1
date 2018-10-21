import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class WinningTicket?{

    static int winningLotteryTicket(int[] t) {
        // Complete this function
	int sum;
	int s1,s2,s3,s4,s5,s6,s7,s8,s9,s0;
	s1=s2=s3=s4=s5=s6=s7=s8=s9=s0=0;
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t.length;j++){
			if(!(i==j))
			{
				int n=t[i],n2=t[j];
				while(n>0)
				{
					int r=n%10;
					if((r==1)&&(s1==0))
						s1=1;
					if((r==2)&&(s2==0))
						s2=1;
					if((r==3)&&(s3==0))
						s3=1;
					if((r==4)&&(s4==0))
						s4=1;
					if((r==5)&&(s5==0))
						s5=1;
					if((r==6)&&(s6==0))
						s6=1;
					if((r==7)&&(s7==0))
						s7=1;
					if((r==8)&&(s8==0))
						s8=1;
					if((r==9)&&(s9==0))
						s9=1;
					if((r==0)&&(s0==0))
						s0=1;
					n=n/10;
				}
				while(n2>0)
				{
					int r=n2%10;
					if((r==1)&&(s1==0))
						s1=1;
					if((r==2)&&(s2==0))
						s2=1;
					if((r==3)&&(s3==0))
						s3=1;
					if((r==4)&&(s4==0))
						s4=1;
					if((r==5)&&(s5==0))
						s5=1;
					if((r==6)&&(s6==0))
						s6=1;
					if((r==7)&&(s7==0))
						s7=1;
					if((r==8)&&(s8==0))
						s8=1;
					if((r==9)&&(s9==0))
						s9=1;
					if((r==0)&&(s0==0))
						s0=1;
					n2=n2/10;
				}
			}
		}
		if((s1==1)&&(s2==1)&&(s3==1)&&(s4==1)&&(s5==1)&&(s6==1)&&(s7==1)&&(s8==1)&&(s9==1)&&(s0==1))
			sum+=1;
	}
	return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] t = new long[n];
        for(int t_i = 0; t_i < n; t_i++){
            t[t_i] = in.nextInt();
        }
        int result = winningLotteryTicket(t);
        System.out.println(result);
        in.close();
    }
}
