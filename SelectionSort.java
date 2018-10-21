import java.util.*;

class SelectionSort
{
	public static void main(String args[])
	{
		int a[]=new int[50];
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		selectionSort(a,n);
	}
	public static void selectionSort(int a[],int n)
	{
		int min,index=0;
		for(int j=0;j<n;j++){
			min=a[j];
			for(int i=j;i<n;i++)
			{
				if(a[i]<min){
					min=a[i];
					index=i;
				}					
			}
			int temp;
			temp=a[j];
			a[j]=min;
			a[index]=temp;
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i] +" ");
		}	
	}
}