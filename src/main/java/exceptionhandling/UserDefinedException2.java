package exceptionhandling;

/*
 * In this example we are throwing an exception from a method. 
 * So we use "throws" clause in the method signature. */
class InvalidSelectionAlert extends Exception{
	private String s;
	public InvalidSelectionAlert(String s) {
		this.s=s;
	}
	
}

public class UserDefinedException2 {
	public static void checkSelection(int i) throws InvalidSelectionAlert {
		if(i==1||i==2) {
			System.out.println("Correct selection");
		}
		else {
			throw new InvalidSelectionAlert("Invalid Vote selection");
		}
	}
	public static void main(String[] args) {
		try {
			checkSelection(1);
			checkSelection(3);
		} catch (InvalidSelectionAlert e) {
			
			e.printStackTrace();
		}
		System.out.println("This line should be printed");
	}

}

/* Output:
Correct selection
exceptionhandling.InvalidSelectionAlert
	at exceptionhandling.UserDefinedException2.checkSelection(UserDefinedException2.java:20)
	at exceptionhandling.UserDefinedException2.main(UserDefinedException2.java:26)
This line should be printed
*/
