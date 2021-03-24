package exceptionhandling;

public class NestedException1 {
	public static void main(String[] args) {
		try {
			//try1
			try {
				//try2
				try {
					// try3
					int a=5,b=0;
					int ans=a/b;
					System.out.println("This statement will not be executed due to exception above"+ans);
				}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("ArrayIndexOutOfBoundsException");
					System.out.println("Inside try-catch 3 "+e);
				}
			}
			catch(NullPointerException e) {
				System.out.println("NullPointerException");
				System.out.println("Inside try-catch 2 "+e);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("Inside try-catch 3 block1 "+e);
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
			System.out.println("Inside try-catch 3 block2 "+e);
		}
		System.out.println("Outside of all try catch blocks");
	}

}
/* Output:
ArithmeticException
Inside try-catch 3 block2 java.lang.ArithmeticException: / by zero
Outside of all try catch blocks
*/
