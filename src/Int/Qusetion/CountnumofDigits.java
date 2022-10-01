package Int.Qusetion;

public class CountnumofDigits {

	public static void main(String[] args) {
		
		int num=145964599;
		
		int count=0;
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(" Number of digits "+count);
	}
}
