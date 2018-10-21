import java.util.*;

class FindPrincess
{
	public static void main(String gridrgs[])
	{
		
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		String g[]=new String[n];
		for(int i=0;i<n;i++)
			g[i]=s.next();
		char grid[][]=new char[n][n];
		for(int i=0;i<n;i++)
		{
			char s1[]=g[i].toCharArray();
			for(int j=0;j<n;j++)
				grid[i][j]=s1[j];
			
		}
		findHer(grid,n);
	}
	static void findHer(char grid[][],int n)
	{
		/*for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.println(grid[i][j]);
		}}*/
		
		int m1,m2,p1,p2;
		m1=m2=n/2;
		p1=p2=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(grid[i][j]=='p')
				{
					p1=i;
					p2=j;
				}
		}}
		System.out.println(p1 +" " +p2);
		if(m1<p1)
		{
			int c;
			c=p1-m1;
			for(int i=0;i<c;i++)
				System.out.println("DOWN");
		}
		if(m1>p1)
		{
			int c;
			c=m1-p1;
			for(int i=0;i<c;i++)
				System.out.println("UP");
		}
		if(m2<p2)
		{
			int c;
			c=p2-m2;
			for(int i=0;i<c;i++)
				System.out.println("RIGHT");
		}
		if(m2>p2)
		{
			int c;
			c=m2-p2;
			for(int i=0;i<c;i++)
				System.out.println("LEFT");
		}
	}
}