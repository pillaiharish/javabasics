package exceptionhandling;

import java.io.IOException;

/*
 * Below the method myMethod() is throwing two checked exceptions so we have declared
 * these exceptions in the method signature using throws Keyword.
 * */
class ThrowsExample{
	public void myMethod(int i) throws IOException, ClassNotFoundException{
		if(i==1) {
			throw new IOException("IOException Occurred");
		}
		else {
			throw new ClassNotFoundException("ClassNotFoundException occurred");
		}
	}
}

public class ThrowsKeyword {
	public static void main(String[] args) {
		try {
			ThrowsExample tr =new ThrowsExample();
			tr.myMethod(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

/* Output:
java.io.IOException: IOException Occurred
	at exceptionhandling.ThrowsExample.myMethod(ThrowsKeyword.java:12)
	at exceptionhandling.ThrowsKeyword.main(ThrowsKeyword.java:24)
*/