//Finding the maximum sequence of one's in binary equivalent of the number

import java.util.*;
class MaximumOne
{
	public static void main(String args[])
	{
		int n,count1=0,count2=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int r;
		boolean seq=true;
		while(n!=0)
		{
			r=n%2;
			n=n/2;
			System.out.println(r);
			if(r==1 && seq==true)
				count1++; 
			if(r==0 && seq==true)
			{
				seq=false;count2=count1;count1=0;
			}
		}
		if(count1>count2)
		System.out.println(count1);
		else
		System.out.println(count2);
	}
}