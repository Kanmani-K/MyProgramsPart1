import java.util.*;

class ArrayRotateAndDelete
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();}
		int no=n,j;
		for(int i=1;i<=n-1;i++)
		{
			no=no-1;
			int temp=a[0],k=2;
			for(j=0;j<=no-2;j++,k++)
				a[j]=a[k];
			a[j]=temp;	
		}
		System.out.println(a[0]);
	}

}