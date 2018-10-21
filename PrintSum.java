import java.util.*;

class PrintSum
{
	public static void main(String rgs[])
	{
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		printCorrectSum(a,n);
	}
	static void printCorrectSum(int a[],int n)
	{
		int leftsum=0,rightsum=0;boolean flag=false;
		for(int j=0;j<n;j++)
		{
			//System.out.println("loop "+j);
			if(j==0)
				leftsum=0;
			else{
			for(int i=j-1;i>=0;i--)
				leftsum=leftsum+a[i];
				//System.out.println(leftsum);
			}
			if(j==n)
				rightsum=0;
			else{
			for(int i=j+1;i<n;i++)
				rightsum=rightsum+a[i];
			//System.out.println(rightsum);
			}
			
			if(leftsum==rightsum)
				flag=true;
			leftsum=0;
			rightsum=0;
			
		}
		System.out.println(flag);
	}
}