package ArrayStrings;

import java.lang.reflect.Method;
public class Democlass {
		
	private void sampleMethod() {
	      System.out.println("hello");
	   }
	
	
	public class SampleTest {
	   public static void main(String args[]) throws Exception {
	      Class c = Class.forName("DemoTest");
	      Object obj = c.newInstance();
	      Method method = c.getDeclaredMethod("sampleMethod", null);
	      method.setAccessible(true);
	      method.invoke(obj, null);
	   }
	}
}
