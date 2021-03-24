package exceptionhandling;

/*	Topics covered: exception handling, try-catch block, nested exception
 * */

/* In below program we need to grab exception in the immediate catch block.
 * If not then the later exceptions in the program may not be captured(same level try block)
 * */

public class NestedException2 {
	public static void main(String[] args) {
		try {
			try {
				int[] arr= new int[2];
				arr[0]=5;
				arr[3]=19;
			}
			catch(ArithmeticException e) {
				System.out.println("Arithmetic Exception "+ e);
			}
			try {
				int a=9;
				int b=0;
				int ans=a/b;
				System.out.println("This line will not be visible "+ans);
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Array index out of bounds exception "+e);
			}
			
		}
		catch(NullPointerException e) {
			System.out.println("Outer try Null pointer exception "+e);
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Outer try ArrayIndex out of bound  exception "+e);
		}
		catch(ArithmeticException e) {
			System.out.println("Outer try Arithmetic Exception "+e);
		}
	}

}

/* Output:
 * Outer try ArrayIndex out of bound  exception java.lang.ArrayIndexOutOfBoundsException: 3
 * */
