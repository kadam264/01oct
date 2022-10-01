package ArrayStrings;

public class Strings {

	
	public static void main(String[] args) {
		
		
		//String:String is a collectiomn of charc.
		
		String s=" welcome ";
		String s1="to java";
		
		System.out.println(s.length());
		System.out.println(s.concat(s1));
		
		String s2="      welcome     ";
		System.out.println(s2);
		System.out.println(s2.trim());
		String s3="Welcome";
		System.out.println(s3.charAt(2));
		String s4=" Welcome ";
		System.out.println(s4.contains("Wel"));
		System.out.println(s4.contains("WEL"));
	}
}
