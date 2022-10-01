package MostAskQuestionjava;

public class CountevenandOdd {

	public static void main(String[] args) {
		
		int num=123456731;
		int even_num=0;
	int odd_num=0;
		while(num>0) 
		{
			int rem=num%10;
			if(rem%2==0)
			{
				even_num ++;
			}
			else
				odd_num ++;
			num=num/10;
		}
		System.out.println("number of even number: "+even_num);
		System.out.println("number of odd number: "+odd_num);
	}

}
