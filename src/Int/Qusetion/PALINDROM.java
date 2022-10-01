package Int.Qusetion;

import java.util.Scanner;

public class PALINDROM {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter a number");
//          int num=sc.nextInt();
//          
//          int org_num=num;
//          
//          int rev=0;
//          
//          while(num!=0);
//          {
//        	  rev=rev*10+num%10;
//        	  num=num/10;
//          }
//          if(org_num==rev) 
//          {
//        	  
//        	  System.out.println(org_num + "palindrome number");
//          }
//          else
//          {
//        	  System.out.println(org_num + "not palindrome number");
//          }
		
		Scanner sk=new Scanner(System.in);
		System.out.println("enter a number ");
		int num=sk.nextInt();
		
		int org_num=num;

		int rev=0;
		
		while(num!=0) 
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(org_num==rev) {
			System.out.println("It a palindrome number");
		}
		else 
		{
		System.out.println("it is not palindrome number");	
		}
	}

}
