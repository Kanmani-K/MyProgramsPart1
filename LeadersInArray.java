import java.util.*;



class LeadersInArray
{
	public static void main(String args[])
	{
		byte n;
		Scanner s=new Scanner(System.in);
		byte a[]=new byte[(n=s.nextByte())];
		for(int i=0;i<n;i++)
			a[i]=s.nextByte();
		printLeaders(a,n);
	}
	static void printLeaders(byte a[],byte n)
	{
		int sum=0,j=0;
		while(j<n){
		for(int i=j+1;i<n;i++)
		{
			sum=sum+a[i];		
		}
		if(a[j]>sum)
			System.out.println(a[j]);
		sum=0;
		j++; 
		}
		//System.out.println(a[n-1]);	
		
	}


}