import java.io.*;
import java.util.*;
class SpiralPrint
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n,m,no;
		m=s.nextInt();
		n=s.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++)
				a[i][j]=s.nextInt();
		}
		int rowStart=0;
		int colStart=0;
		int z,i,j;
		
		//Finding no of iterations
		
		if((n%2)==0)
			no=n/2;
		else
			no=n/2+1;

				
		for(z=0;z<no;z++,m--,n--,rowStart++,colStart++)
		{
			for(j=colStart;j<n;j++)
				System.out.print(a[rowStart][j] +"\t");
			j=j-1;
			for(i=rowStart+1;i<m;i++)
				System.out.print(a[i][j] +"\t");
			i=i-1;
			for(j=j-1;j>=colStart;j--)
				System.out.print(a[i][j] +"\t");
  			j=j+1;
			for(i=i-1;i>rowStart;i--)
				System.out.print(a[i][j] +"\t");
		}
	}

}