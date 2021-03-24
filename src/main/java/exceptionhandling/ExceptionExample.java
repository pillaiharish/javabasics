package exceptionhandling;


/*
 * Java has two types of exceptions.
 * 1. Checked exception
 * 2. Unchecked exception
 * */

// An examples to uses try and catch block in java

public class ExceptionExample {
	
	public static void main(String[] args) {
		int ans=0;
		int a=9,b=0;
		int[] arr=new int[5];
		
		/*
		 * If an exception occurs in try block then the control of 
		 * execution is passed to the corresponding catch block.
		 * A single try block can have any number of catch blocks.
		 * */
		
		try {
			ans=a/b;
			System.out.println("This line of code will not be executed as the "
					+ "control is transfered to catch block"+ans);
		}
		
		/*
		 * If no exception occurs in try block then the catch blocks are completely ignored.
		 * Corresponding catch blocks execute for that specific type of exception.
		 * */
		
		catch(ArithmeticException e) {
			
			/*
			 * Catch block will only execute if exception occurs
			 */
			
			System.out.println("Zero exception "+e);
		}
		
		/*
		 * Generic exception will display the same message for all the exceptions and user 
		 * may not be able to understand which exception occurred. 
		 * So we need specific catch block to catch specific exceptions with proper message.
		 * */
		
		catch (Exception e) {
			
	         /* This is a generic Exception handler which means it can handle
	          * all the exceptions. This will execute if the exception is not
	          * handled by previous catch blocks.
	          * A generic catch block can handle all the exceptions. 
	          */
			
	         System.out.println("Exception occurred");
	    }
	    System.out.println("I'm out of first try-catch block.");
		
		/*
		 * Multiple catch blocks to catch exception in single try block. 
		 * But it will catch only the first exception as the program fails in next line(I guess)
		 * */
		
		try {
			
			for(int i=0;i<6;i++) {
				arr[i]=i;
			}
			ans=a/b;
			
		}
		catch(ArithmeticException e) {
			System.out.println("Zero exception second time "+e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("exception e: "+e);
			System.out.println("e.getMessage(): "+e.getMessage());
			System.out.println("e.getLocalizedMessage(): "+e.getLocalizedMessage());
			System.out.println("e.fillInStackTrace(): "+e.fillInStackTrace());
			System.out.println("e.getCause(): "+e.getCause());
			System.out.println("e.getClass(): "+e.getClass());
			System.out.println("e.printStackTrace() as shown below prints stack trace to console");
			e.printStackTrace();
			
		}
	}
	

}

/*Output:
Zero exception java.lang.ArithmeticException: / by zero
I'm out of first try-catch block.
exception e: java.lang.ArrayIndexOutOfBoundsException: 5
e.getMessage(): 5
e.getLocalizedMessage(): 5
e.fillInStackTrace(): java.lang.ArrayIndexOutOfBoundsException: 5
e.getCause(): null
e.getClass(): class java.lang.ArrayIndexOutOfBoundsException
e.printStackTrace() as shown below prints stack trace to console
java.lang.ArrayIndexOutOfBoundsException: 5
	at exceptionhandling.ExceptionExample.main(ExceptionExample.java:70)
	
	*/