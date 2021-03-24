package exceptionhandling;

public class ThrowUncheckedException {
	public static void selectVote(int a) {
		System.out.println("Select 1 for voting to abc party, Select 2 for voting xyz party");
		if(a==1||a==2) {
			System.out.println("Vote accepted");
		}
		else {
			throw new ArithmeticException("Your selection is invalid");
		}
	}
	public static void main(String[] args) {
		// valid call
		selectVote(1);
		// invalid call
		selectVote(3);
	}

}
