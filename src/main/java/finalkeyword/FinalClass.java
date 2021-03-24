package finalkeyword;

/*
 * When a class is declared as a final, it cannot be extended.
 * Inheritance cannot be allowed.
 * It cannot contain abstract method.
 * Final method cannot be overridden.
 * But we can create object of the final class
*/


final class Person	{
	public void walk() {
		System.out.println("The person is walking");
	}
}

/*	Below inheritance of class from final class will give error.
 * public class FinalClass extends Person{
 * 	}
 * */

public class FinalClass  {
	public static void main(String[] args) {
		/*
		 * However we can still create object of final class.
		 * If we want to restrict the object creation of class 
		 * then we need to declare that class as private
		 * */
		Person p=new Person();
		p.walk();
		
	}

}
