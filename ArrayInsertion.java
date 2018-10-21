import java.util.*;


class ArrayInsertion
{
	public static void insert(int item,int l,int arr[],int n)
	{
		int n1=n;
		while((l-1)<n1)
		{
			arr[n1]=arr[n1-1];
			//System.out.println(n1);
			--n1;
		}	
		arr[l-1]=item;	
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);	
	}
	public static void main(String args[])	
	{
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the number of values: ");
		n=s.nextInt();
		int a[]=new int[100];
		System.out.println("Enter the values: ");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
			System.out.println(a[i]);	
		}
		n=n+1;
		System.out.println("Enter the element and the position : ");
		int item,k;
		item=s.nextInt();
		k=s.nextInt();
		insert(item,k,a,n);
	}


}