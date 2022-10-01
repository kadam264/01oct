package Int.Qusetion;

import java.util.Scanner;

public class Questions {

	
	public static void main(String[] args) {
		 Scanner sv=new Scanner(System.in);
		 System.out.println("enter any number");
		  
		
		 int num=sv.nextInt();
//		 
//		 int rev=0;
//		 while(num!=0) {
//			 rev=rev*10+num%10;
//			 num=num/10;
//		 }
//		StringBuffer sb=new StringBuffer(String.valueOf(num));
//		StringBuffer rev=sb.reverse();
//		 
		 
		 StringBuilder sbl=new StringBuilder();
		 sbl.append(num);
		 StringBuilder rev=sbl.reverse();
		System.out.println("reverse num is "+rev);
		
	}
}
