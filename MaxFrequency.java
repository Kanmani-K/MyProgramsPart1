import java.util.*;



class MaxFrequency
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		printMaxFre(a,n);
	}	
	static void printMaxFre(int a[],int n)
	{
		int occ=0,maxOcc=0,prevOcc=0,prevItem;
		for(int i=0;i<n;i++){
			int item=a[i];
			for(int j=0;j<n;j++){
				if(a[i]==a[j])
					occ+=1;
			}
			if(occ>maxOcc){
				maxOcc=occ;
				prevOcc=occ;
				prevItem=item;
				occ=0;
			}
			for(int k=0;k<maxOcc;k++)		
			{
				System.out.print(item +"");
			}
		}
	}


}