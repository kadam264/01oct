package MostAskQuestionjava.copy;

public class ThirdHIGHSTaRRAY {

	public static void main(String[] args) {
		
	/*	int a[]={10,20,25,63,96,57,59};
		int temp,size;//g1=0,g2=0;
		size=a.length;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) 
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			
			}
		}
		}
		//System.out.println(g1);
		System.out.println("third largest number "+a[size-4]);
	
		*/
		int[]a={1,2,3,4,5,6,7,8,9};
        int g1;//temp,size
        for(int i=0;i<a.length;i++){
        	for(int j=i+1;j<a.length;j++) {
            if(a[i]>a[j]){
                g1=a[i];
                a[i]=a[j];
                a[j]=g1;
            }
        }
        }
       System.out.println("fifth largest number is ="+a[a.length-5]);
	}
}

