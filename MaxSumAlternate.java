import java.util.*;

class MaxSumAlternate
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int sum1=0,sum=0;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			if(i%2==0)
				sum=sum+a[i];
			else
				sum1=sum1+a[i];	
		}
		if(sum1>sum)
			System.out.println(sum1);
		else
			System.out.println(sum);
	}

}