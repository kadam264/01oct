package MostAskQuestionjava.copy;

public class ReversetheString {

	
	public static void main(String[] args) {
		
		
		String str="dfgs";
		String rev=" ";
		
	/*int len=str.length();
		
	for(int i=len-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
		
	}
		System.out.println("Reverse String is ="+rev);*/
		
	/*	char a[]=str.toCharArray();
		int len=a.length;
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println("Reverse the string ="+rev);*/
		
		
		StringBuffer k=new StringBuffer(str);
		System.out.println(k.reverse());
		
		
	}
}
