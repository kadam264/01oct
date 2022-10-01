package Int.Qusetion;

public class ReverseString {

	public static void main(String[] args) {
		 
		//String str="ABCDE";
		//String str="WETYE";
//		String str="newstop";
//		String rev="";
//		int len=str.length();
//		
//		for(int i=len-1;i>=0;i--)
//		{
//			rev=rev+str.charAt(i);
//		}
//		System.out.println("  reverse string is  "+rev);
//	
String str="abcd";
String rev=" ";

int len=str.length();

for(int i=len-1;i>=0;i--)
{
	rev=rev+str.charAt(i);
}
		System.out.println("reverse the string "+rev);
	}
}