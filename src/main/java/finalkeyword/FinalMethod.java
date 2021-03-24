package finalkeyword;

/*
 * Topics covered: final method.
 * */

/*
 * When we declare any method as final, it cannot be override.
 * */

class A	{
	private final int number=999;
	public final void display() {
		System.out.println("Display from parent class "+number);
	}
}
public class FinalMethod extends A{
	private int num=888;
	/*
	 * Below method will give error stating that method cannot be overriden from class A
	 * 
		public void display() {
			System.out.println("Display from parent class "+ num);
		}
	*/
	public static void main(String[] args) {
		FinalMethod fm=new FinalMethod();
		
		// Below line of code will invoke display method of  the parent class A
		fm.display();
	}
	
}
/* Output:
Display from parent class 999
 * */
