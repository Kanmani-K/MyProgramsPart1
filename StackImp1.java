import java.util.*;



class StackImp1
{
	
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
		int a[]=new int[10];
		int n;
		n=s.nextInt();
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();

		System.out.println("Done...");
		for(int i=0;i<10;i++){
			int item=s.nextInt();
			push(a,item,n-1);n++;
	}}
	public static void push(int a[],int item,int top)
	{
		Scanner s=new Scanner(System.in);
		if(top==9)
			System.out.println("Stack is full.. ");
		else{
			top=top+1;
			a[top]=item;System.out.println("Inserted...");
		}	
	}

}