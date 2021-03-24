package exceptionhandling;

/*
 * Unchecked exceptions are not checked at compile time.
 * 
 * It means if your program is throwing an unchecked exception and even if you didn’t 
 * handle/declare that exception, the program won’t give a compilation error. 
 * 
 * Unchecked exception (mostly) occurs due to the bad data provided by user during runt-time.
 * 
 * All Unchecked exceptions are direct sub classes of RuntimeException class
 * 
 * */


/*
 * Its responsibility of the developer to check and handle runtime exception(unchecked).
 * Below are examples of unchecked exceptions.
 * 1) NullPointerException
 * 2) ArrayIndexOutOfBoundsException
 * 3) ArithmeticException
 * 4) IllegalArgumentException
 * 5) NumberFormatException
 * 
 * */

public class UncheckedException1 {
	public static void arryIndexOutOfBoundExcepiton() {
		try{
			int arr[] ={1,2,3,4,5};
		
			/* The array has only 5 elements but we are trying to 
			 * display the value of 8th element. It should throw
			 * ArrayIndexOutOfBoundsException
			 * */
				
			System.out.println(arr[7]);
		
	   }
		
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
	}
	public static void divideByZero()    {
		
		try{
			
			int num1=10;
			int num2=0;
			
			/* Dividing an integer with 0
			 * should throw ArithmeticException
			 * */
			
			int res=num1/num2;
			System.out.println(res);
			}
			catch (ArithmeticException e) {
				e.printStackTrace();
			}
	   }
	public static void main(String[] args) {
		arryIndexOutOfBoundExcepiton();
		divideByZero();
		System.out.println("When exception is caught this line of code also executes");
	}

}
