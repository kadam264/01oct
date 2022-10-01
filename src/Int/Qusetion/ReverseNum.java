package Int.Qusetion;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		
//System.out.println("-------reverse the number using while loop------");
//		int num=1245,rev=0;
//		while(num!=0) {
//			int rem=num%10;
//			rev=rev*10+rem;
//			num=num/10;
//			
//		}
//		System.out.println("the reverse number is "+rev);
//	}
//
//}
//System.out.println("-----reverse the number using loop-------");
//		int num =1346458, rev=0;
//		
//		for(;num!=0;num=num/10) {
//			int rem=num%10;
//			rev=rev*10+rem;
//			
//		}
//		System.out.println("The reverse number is "+rev);
//		
//		
//
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter a number");
		int num =sc.nextInt();
	
		int rev=0;
		
		while(num!=0) 
		{
		rev =rev*10+num%10;
		num=num/10;
		}
		System.out.println("reverse the num "+rev);
}
}