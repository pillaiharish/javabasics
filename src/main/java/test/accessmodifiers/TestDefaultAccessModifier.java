package test.accessmodifiers;

/*	Topics covered: Default, Private, Protected, Default
 * */

import accessmodifiers.*;

/* Public:
 * The members, methods and classes that are declared public can be accessed from anywhere. 
 * This modifier doesn’t put any restriction on the access. 
 * */

public class TestDefaultAccessModifier extends DefaultAccessModifier {
	
	/* Private:
	 * The scope of private modifier is limited to the class only.
	 * 1) Private Data members and methods are only accessible within the class
	 * 2) Class and Interface cannot be declared as private
	 * 3) If a class has private constructor then we cannot create the object of 
	 * that class from outside of the class.
	 */
	
	private int a; // data member
	private int b;
	
	public TestDefaultAccessModifier(int a,int b) {
		this.a = a;
		this.b = b;
	}
	public void subtract() {
		System.out.println("Subtraction of 9 from 4: "+subtractTwoNumbers(a,b));
	}
	
	
	public static void main(String[] args) {
		
		/* Default:
		 * Below line will give Error as the method is not visible
		 * addTwoNumbers(3,4);
		 * */
		
		TestDefaultAccessModifier obj1=new TestDefaultAccessModifier(4, 9);
		obj1.subtract();
		
		/* Private constructor:
		 * We cannot create object of the class wich has private constructor. Below
		 * line will give error of not visible scope.
		 * PrivateConstructor pc=new PrivateConstructor(); 
		 * */
		
		
	}
}
