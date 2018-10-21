import java.util.*;


class StudentsAndLockers
{
	public static void main(String args[])
	{
		int lockers,students;
		Scanner s=new Scanner(System.in);
		lockers=s.nextInt();
		students=s.nextInt();
		int a[]=new int[lockers];
		//--------------Student 1----------------------
		for(int i=0;i<lockers;i++)
		{
			a[i]=0;	
		}
		//Student 2----------------n--------------------
		int door;
		//int student=2;
		for(int i=2;i<=students;i++)
		{
			door=i;
			while((door<=lockers))
			{
				if((door%i)==0){
					if(a[door-1]==0)
						a[door-1]=1;
					else
						a[door-1]=0;
				}
				door++;
			}
		}
		for(int i=0;i<lockers;i++)
		{
			if(a[i]==0 )
				System.out.print(i+1 + " ");
		}
	}


}