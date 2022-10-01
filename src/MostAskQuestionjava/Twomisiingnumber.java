package MostAskQuestionjava;

public class Twomisiingnumber {

	public static void main(String[] args) {
		int []num1= {1,2,4,5,7,9,10};
		int[]str=new int[num1.length];
		for(int value:num1) {
			str[value]=1;
		}
		System.out.println("missing no are ::");
		for(int i=0;i<=8;i++) {
			if(str[i]==0) {
				System.out.println(i);
			}
		}

	}

}
