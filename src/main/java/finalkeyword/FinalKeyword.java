package finalkeyword;

/*
 * Topics covered: final variable.
 * */

/* final:
 * 1) final is a keyword.
 * 2) It is used to apply restriction on class, method and variables.
 * 3) final class cannot be inherited, final method cannot be overridden and final variable cannot be changed.
 * */

/*
 * Final variable is a constant. We cannot change the value of final variable after initialization.
 */

public class FinalKeyword {
	
	final  int number = 100;
	
	public void display() {
		/*
		 * Below line of code will throw error
		 * number=90;
		 * */
		
		System.out.println("display method returns number "+number);
	}
	
	public static void main(String[] args) {
		
		FinalKeyword fk=new FinalKeyword();
		System.out.println("Final variable value: "+fk.number);
		fk.display();
	}
}

/* Output:
Final variable value: 100
display method returns number 100
 * */
