import java.util.*;


class FindingDay
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Entr date from in the format(dd:mm:yy)");
		String date=s.nextLine();
		findDay(date);
	}	
	static void findDay(String s)
	{
		String date[]=s.split(":");
		int sum=0;
		//System.out.println(Integer.parseInt(date[2]));
		for(int i=1950;i<(Integer.parseInt(date[2]));i++)
		{
			if((i%4)==0) 
				sum=sum+366;
			else 
				sum=sum+365;
				
		}
		//System.out.println(sum);
		for(int i=1;i<Integer.parseInt(date[1]);i++)
		{
			if((i==1)||(i==3)||(i==5)||(i==7)||(i==8)||(i==10)||(i==12))
				sum=sum+31;
			else if(i==2)
			{
			if(Integer.parseInt(date[2])%4==0)
				sum=sum+29;
			else
				sum=sum+28;
			}
			else
				sum=sum+30;

		}
	
		sum=sum+Integer.parseInt(date[0]);
		int ch=sum%7;
		switch(ch)
		{
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;

			case 6:
				System.out.println("Friday");
				break;
			

			case 0:
				System.out.println("Saturday");
				break;

			
			case 1:		
				System.out.println("Sunday");
				break;

}
	}		
	
		
}