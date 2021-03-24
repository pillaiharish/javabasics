package exceptionhandling;

/*	Topics covered: finally keyword, exception handling,finally override try block, return in finally.
 * */

/* finally:
 * 1) finally is a block followed by try or catch block.
 * 2) finally block is executed whether exceptions are handled or not.
 * 3) We put clean up code in finally block.
 * */

/*
 * Below code is an example when exception occurs in try block and handled properly in catch block.
 * */

public class FinallyKeyword {
	public static void exception() {
		try {
			int a=6,b=0;
			int ans=a/b;
			System.out.println("Line after the exception");
		} catch (ArithmeticException e) {
			System.out.println("Catch the divide by zero exception");
		}
		finally {
			System.out.println("Finally block got executed");
		}
	}
	
	/*
	 * Java finally block when return statement is encountered
	 * */
	
	public static int exceptionReturn() {
		try {
			int a=6,b=0;
			int ans=a/b;
			System.out.println("Line after the exception");
			return 555;
		} catch (ArithmeticException e) {
			System.out.println("Catch the divide by zero exception");
			return 420;
		}
		finally {
			System.out.println("Finally block got executed");
		}
	}
	
	public static int myMethod()
	   {
	       try {
	            //try block
	            return 999;
	       }
	       finally {
	            //finally
	            System.out.println("Inside Finally block");
	       }
	  }
	
	/*
	 * Below method shows that Finally block overrides the value returned by try and catch blocks
	 * */
	@SuppressWarnings("finally")
	public static int  finallyOverride() {
		try {
			int a=6,b=1;
			int ans=a/b;
			return 222;
		} finally {
			System.out.println("Inside finallyOverride() method finally block");
			return 111;
		}
		
		
	}
	
	public static void main(String[] args) {
		exception();
		System.out.println("sysout of exceptionReturn(): "+ exceptionReturn());
		System.out.println("sysout of myMethod(): "+myMethod());
		System.out.println("sysout of finallyOverride():"+finallyOverride());
	}
}

/* Output:
Catch the divide by zero exception
Finally block got executed
Catch the divide by zero exception
Finally block got executed
sysout of exceptionReturn(): 420
Inside Finally block
sysout of myMethod(): 999
Inside finallyOverride() method finally block
sysout of finallyOverride():111
 * */
 