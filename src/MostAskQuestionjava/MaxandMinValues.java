package MostAskQuestionjava;

public class MaxandMinValues {

	public static void main(String[] args) {
		
	/*	int a[]= {30,40,50,60,20};
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++) 
		{
			if(a[i]>max) 
			{
				max=a[i];
			}
		}
	System.out.println("Maximum number in array ="+max);

	}

}*/

/*int a[]= {30,40,50,60,20};
		
		int min=a[0];
		
		for(int i=1;i<a.length;i++) 
		{
			if(a[i]<min) 
			{
				min=a[i];
			}
		}
	System.out.println("Minimum number in array ="+min);*/

		
	int a[]= {10,15,5,25,60};
	
	int min=a[0];
	
	for(int i=1;i<a.length;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
	}
		System.out.println("Minimum number is ="+min);
	}
}
	