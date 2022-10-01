package Int.Qusetion;

import java.util.Scanner;

public class PalindromsQue {

	public static void main(String[] args) {
		
		System.out.println("-----------it is palindrom--------------");
//		
//		int r,sum=0,temp;
//		int n=4546;
//		temp=n;
//		while(n>0) {
//			r=n%10;
//			sum=(sum*10)+r;
//			n=n/10;
//		}
//		if(temp==sum)
//			System.out.println("palindrome number ");
//		else
//			System.out.println("not a palindrome number");

//	int  rev, sum=0,temp;
//	int n=55655;
//	temp=n;
//	while(n>0) {
//		rev=n%10;
//		sum=(sum*10)+rev;
//		n=n/10;
//	}
//	if(temp==sum)
//		System.out.println(" IT IS A PALINDROME NUMBER ");
//	else
//		System.out.println("IT IS  NOT PALINDROME NUMBER");
//	}
//	
//	}

		
//		
//		String original,rev="";
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter a string ");
//		original=sc.nextLine();
//		int length=original.length();
//		for(int i=length-1;i>=0;i--)
//			rev=rev+original.charAt(i);
//		
//		if(original.equals(rev))
//		System.out.println(" entered string is a palindrom");
//		else
//			System.out.println("enterd string is not palindrom");
//		
		Scanner sk=new Scanner(System.in);
		System.out.println("enter a string ");
		String str=sk.next();
		
		String str_org=str;
		
		String rev=" ";
		
		int len=str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str_org.equals(rev))
		{
			System.out.println("It is palindrome string ");
		}
		else
		{
			System.out.println("It is not palindrome number ");
		}
		
		
	}
}
		
