import java.util.*;


class QueueImp
{
	static int front,rear,n=10;	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a[]=new int[10];
		front=rear=1;int choice;
		do{
		System.out.println("1.push   2.pull 3.exit");
		choice=s.nextInt();
		if(choice==1)
		{
			int item;
			item=s.nextInt();
			new QueueImp().enqueue(a,item);
		}
		else if(choice==2){
			new QueueImp().dequeue(a);}


		}while(choice!=3);
	}
	public  void enqueue(int a[],int item)
	{
		if(rear==10)
			System.out.println("queue is full");
		else
		{
			a[rear]=item;
			rear++;
		}
		
	}
	void dequeue(int a[])	
	{
		if(front==rear)
			System.out.println("Queue is empty..");
		else
		{
			System.out.println("The removed element is " +a[front]);
			front++;
		}
	}
}