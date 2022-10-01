package MostAskQuestionjava;

import java.util.Scanner;

public class PALINDROMEnumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("enter any number "); 
		int num=sc.nextInt();
		
		/*int org_num=num;
		
		int rev=0;
		
		while(num!=0) 
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(org_num==rev)
		{
			System.out.println("Palindrome number "+org_num);
		}
		else

			System.out.println("not palindrome number "+org_num);*/
		
		int org_num=num;
		int rev=0;
		
		while(num!=0)
		{
		rev=rev*10+num%10;
		num=num/10;
		}
		if(org_num==rev) 
		{
			System.out.println("palindrome number ="+org_num);
		}
		else
			System.out.println("not palindrome number ="+org_num);
	}

}
