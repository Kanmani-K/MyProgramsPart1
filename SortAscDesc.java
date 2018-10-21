import java.util.*;

class SortAscDesc
{
	public static void main(String a[])
	{

		System.out.println("Enter the number of items: ");
		int n,odd=0,even=0;;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			if(arr[i]%2==0)
				even+=1;
			else
				odd+=1;
		}
		sortAscDesc(arr,n);
	}
	static void sortAscDesc(int a[],int n)
	{
	
	}
}