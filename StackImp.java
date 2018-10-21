import java.util.*;

class StackImp
{
public static void main(String arg[])
{
	Stack s=new Stack();
	s.push(10);
	s.push(20);
	System.out.println(s.peek());
	System.out.println(s);
	System.out.println(s.pop());
	System.out.println(s);
	if(s.search(20)==1)
		System.out.println("Element is there...");
	System.out.println("Element is not there...");
}


}