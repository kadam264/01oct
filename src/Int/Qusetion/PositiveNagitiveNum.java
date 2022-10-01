package Int.Qusetion;

import java.util.Scanner;

public class PositiveNagitiveNum {

	
	public static void main(String[] args) {
		
		int num;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter any number");
		num=sc.nextInt();
		
		if(num>0) {
			System.out.println("It is a positive number");
		}
		else if(num<0) {
			System.out.println("It is a Negative number");
		}
		else
		{
			System.out.println("the number is zero");
		}
		
	}
}
