import java.util.*;

class ArrayRotation
{
	public static void main(String a[])
	{

		System.out.println("Enter the number of items: ");
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int d=s.nextInt();
		rotate(arr,n,d);
		
	}
	static void rotate(int a[],int n,int d)
	{
		for(int i=0;i<d;i++)
		{
			int temp=a[0];
			for(int j=0;j<n-1;j++)
			{
				a[j]=a[j+1];
			}
			a[n-1]=temp;
		}	
		for(int i=0;i<n;i++)
			System.out.print(a[i] +" ");
	}



}