import java.util.*;

class GetSmallMatrix
{
	public static void main(String args[])
	{
		int a[][]=new int[10][10];
		int row,col;
		Scanner s=new Scanner(System.in);
		row=s.nextInt();
		col=s.nextInt();
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
				a[i][j]=s.nextInt();
		for(int i=1;i<=row-2;i++){
			for(int j=1;j<=col-2;j++){
				System.out.print(a[i][j] +"\t");
			}
		System.out.println();
		}
		
	}



}