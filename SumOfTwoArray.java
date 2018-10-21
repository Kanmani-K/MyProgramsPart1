//Sum of two array of diff size....
import java.util.*;

class SumOfTwoArray
{
	public static void main(String args[])
	{
		int m,n;
		Scanner s=new Scanner(System.in);
		m=s.nextInt();
		n=s.nextInt();
		int a[]=new int[m];
		int b[]=new int[n];
		for(int i=0;i<m;i++)
			a[i]=s.nextInt();
		for(int j=0;j<n;j++)
			b[j]=s.nextInt();
		sumArray(a,b,m,n);
		
	}
	static void sumArray(int a[],int b[],int m,int n)
	{
		int size,small,k;
		if(m==n || m>n){
			size=m+1;
			small=n;
		}
		else{ 
			size=n+1;	
			small=m;
		}
		int sum=0,rem=0;
		int c[]=new int[size];
		int i,j;
		for(i=n-1,j=m-1,k=size-1;k>0;i--,k--,j--,small--)
		{
			//System.out.println("loop");
			if(small>0){//System.out.println("loop" +a[j] +" " +b[i]);
				sum=a[j]+b[i]+rem;}
			else if(m>n)
				sum=a[j]+rem;
			else
				sum=b[i]+rem;


			if (sum>10){
				rem=sum%10;
				c[k]=sum-10;
			}
			else if(sum==10){
				rem=1;
				c[k]=0;
			}
			else
				c[k]=sum;
			sum=0;
		//	System.out.println(c[k]);
			
		}
		c[0]=rem;
 	
		for(i=0;i<size;i++){
			//System.out.println(size);
			if(i==size-1)
			{
				if(c[i]!=0)
				System.out.print(c[i]+ " ");	
			}
			else 
				System.out.print(c[i] +" ");

		}
		
		
	}
}















		/*if(m==n)
			c[size]=rem;
		else{
		for(int l=size;l>0;l--)
		{
			if(m>n)
			{
			sum=a[size]+rem;
			if (sum>10){
				rem=sum-10;
				c[size]=sum%10;
				}
			else if(sum==10){
				rem=1;
				c[size]=0;
				}
			else
				c[size]=sum
			sum=0;
			}
			else
			{
			sum=b[size]+rem;
			if (sum>10){
				rem=sum-10;
				c[size]=sum%10;
				}
			else if(sum==10){
				rem=1;
				c[size]=0;
				}
			else
				c[size]=sum;
			sum=0;
			}
			c[size]=rem;						 

		}
		}*/			
