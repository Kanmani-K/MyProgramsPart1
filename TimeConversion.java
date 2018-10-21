import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    static void timeConversion(String s) {
        // Complete this function
	boolean flag=false;
	String letter[]=s.split(":");
	System.out.println(letter[1]);
	int part1=Integer.parseInt(letter[0]);
	//int part2=Integer.parseInt(letter[1]);
	//System.out.println(part2);
	char a[]=letter[2].toCharArray();
	if((a[2]=='a')||(a[2]=='A'))
	{
		flag=true;
	}
	if(flag)
	{
		System.out.println(part1+":"+letter[1]+":"+a[0]+a[1]);
	}
	else
	{
		part1+=12;
		if(part1==24)
			System.out.println("00:"+letter[1]+":"+a[0]+a[1]);
		else
			System.out.println(part1+":"+letter[1]+":"+a[0]+a[1]);			
	}
		
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        timeConversion(s);
        //System.out.println(result);
    }
}
