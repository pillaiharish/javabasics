package exceptionhandling;


/*
 * 1. User-defined exception must extend Exception class.
 * 2. The exception is thrown using throw keyword.
*/

/*
 * Below code shows use of custom exception by declaring a separate class which extends Exception class
 * and throw custom exception when required.
 * */
class MyException extends Exception{
	private String s;
	public MyException(String str) {
		this.s=str;
	}
	@Override
	public String toString() {
		return("User exception has occurred " +s);
	}
}
public class UserDefinedException {
	public static void main(String[] args) {
		try {
			System.out.println("The program enters try block of main method");
			
			// An exception is thrown in the console
			throw new MyException("UserDefinedException");
			
		} catch (MyException e) {
			System.out.println("Inside catch block of main method");
			e.printStackTrace();
		}
	}
}

/* Output:
The program enters try block of main method
Inside catch block of main method
User exception has occurred UserDefinedException
	at exceptionhandling.UserDefinedException.main(UserDefinedException.java:29)
*/
