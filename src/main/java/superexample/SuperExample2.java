package superexample;
/*
 * Topics covered: super data member and overriden method
 * */

/*
 * The super keyword refers to the objects of immediate parent class. 
 * The use of super keyword
 * 1) To access the data members of parent class when both parent and child class have member with same name
 * 2) To explicitly call the no-arguments and parameterized constructor of parent class
 * 3) To access the method of parent class when child class has overridden that method.

*/


/*
 * What if the child class is not overriding any method: No need of super
 * 
 * */

class DataClass{
	protected int num=500;
	protected void printNumber() {
		System.out.println("This output from parent class method: "+num);
	}
	
}
public class SuperExample2 extends  DataClass{
	
	/* Case2:
	 * Here below example is to access the data members of parent class when both parent and child
	 * class have member with same name i.e. num is data member
	 * 
	 * */
	
	protected int num = 900;
	
	/* Case3:
	 * Also below implements to access the method of parent class when child class 
	 * has overridden that method
	 * 
	 * */
	
	@Override
	protected void printNumber() {
		System.out.println("This output from child class method without super.num: "+num);
	}
	// we can use super.variableName to use the variable(data member) from the parent class
	protected void display() {
		
		super.printNumber();
		printNumber();
		
		System.out.println("This output from child class method using super.num: "+super.num);
	}
	
	public static void main(String[] args) {
		SuperExample2 su=new SuperExample2();
		
		/* super in static:
		 * super keyword cannot be called inside static context
		 * */
		
		su.display();
		
	}

}

/* Output:
This output from parent class method: 500
This output from child class method without super.num: 900
This output from child class method using super.num: 500


*/
