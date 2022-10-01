package MostAskQuestionjava.copy;

import java.util.Scanner;

public class ReverseNumer {
 public static void main(String[] args) {
	
	 
/*	 int num=1567,rev=0;//int num=4562,rev=0;
	 
	 while(num!=0)     //while(num!=0)
	 {
		 int rem=num%10;  //int rem=num%10;
		 rev=rev*10+rem;  //rev=rev*10+rem;
		 num=num/10;      //num=num/10;
	 }
	 
	 System.out.println(rev);*/   //System.out.println(rev);
	 

// 
// 
// 
// int num=78945,rev=0;
// 
// for(;num!=0;num=num/10)
// {
//	 int rem=num%10;
//	 rev=rev*10+rem;
// }
//System.out.println(rev);
// }
//}
	 
/*	// String str ="sanjay kadam";
	 String str="salenium";
	 String rev="";
	 
	 int len=str.length();
	 
	 for(int i=len-1;i>=0;i--)
	 {
		rev=rev+str.charAt(i); 
	 }
	 
	 System.out.println(rev);*/
	 
	 
	/* Scanner sc=new Scanner(System.in);
	 System.out.println("enter any number");
	 int num=sc.nextInt();
	 
	 int rev=0;
	 
	 while(num!=0) 
	 {
		  rev=rev*10+num%10;
		  num=num/10;
		  
		  
	 }
	 System.out.println(rev);*/
	 
	 
	 Scanner sk=new Scanner (System.in);
	 System.out.println("enter any number");
	 int num=sk.nextInt();
	 
	 
	 int rev=0;
	 
	 while(num!=0) 
	 {
	rev=rev*10+num%10;
	num=num/10;
	 }
	 System.out.println(rev);
 }
}
	 
	 
	 
	 
	 
	 
	 
	 



