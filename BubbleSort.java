import java.util.*;


class BubbleSort
{
	static void bubbleSort(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
			System.out.println(a[i] +" ");		
	}
	public static void main(String rgs[])
	{
		int a[]=new int[50];
		int n;
		BubbleSort bs=new BubbleSort();
		System.out.println("Enter the number of items: ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int	i=0;i<n;i++){
				a[i]=s.nextInt();	
		//	System.out.print(a[i]+" ");
		}	
		bubbleSort(a,n);
	}
}