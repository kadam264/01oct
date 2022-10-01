package MostAskQuestionjava;

import java.util.Scanner;

public class StringPlaindrome {

	public static void main(String[] args) {
	
		Scanner sk=new Scanner (System.in);
     System.out.println("enter any String ");
     String str=sk.next();
     
    /* String org_str=str;
     String rev="";
     int len=str.length();
     
     
     for(int i=len-1;i>=0;i--)
     {
    	 rev=rev+str.charAt(i);
    	 
     }
    if(org_str.equals(rev))
    {
    	System.out.println("string is palindrome "+org_str);
    }
    else
		System.out.println("not a palindrome string "+org_str);*/
     
     
     String org_str=str;
     String rev="";
     
     int len=str.length();
		
     for(int i=len-1;i>=0;i++) 
     {
      rev=rev+str.charAt(i);

     }
     if(org_str.equals(rev))
     {
    	 System.out.println("string is oalindrome "+org_str);
     }
     else
    	 System.out.println("string is not palindrome "+org_str);
	}

}
