package Int.Qusetion;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		/*int a=450,b=72,c=2100;
		
		if(a>=b && a>=c) 
		{
			System.out.println(a + " is the largest number");
		}
		else if(b>=a && b>=c)
		{
			System.out.println(b + " is the largest number");
		}
		else
			System.out.println( c +" it is largest number");*/
	
	int a,b,c,largest,temp;
	
	Scanner sc=new Scanner (System.in);
	
	System.out.println("enter frist number");
	a=sc.nextInt();
	System.out.println("enter second number");
	b=sc.nextInt();
	System.out.println("enter three number");
	c=sc.nextInt();
	
	
	temp=a>b?a:b;
	
	largest=c>temp?c:temp;
	
	System.out.println("The largest number "+largest);
	
	
	
	
	
	}
	
	
	
	
	
	
}
