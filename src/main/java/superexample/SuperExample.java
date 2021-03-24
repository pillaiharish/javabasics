package superexample;
/*
 * Topics covered: super constructors
 * */

/*
 * Here SuperExample is child class and Vehicle1 is parent class
 * We are not using super() keyword yet the compiler puts the parent constructor 
 * before the child class constructor implicitly.
 * This can also be achieved by using super() keyword, can be seen in SuperExample2.java
 * */

/*
 * This example is focused to explicitly call the no-arg constructor and also constructors
 * with parameters of parent class
 * 
 * */

public class SuperExample extends Vehicle1 {
	private int num;
	public SuperExample() {
		System.out.println("Inside super constructor");
	}
	
	/* super() must be added to the first statement of constructor 
	* otherwise we will get a compilation error. 
	* Another important point to note is that when we explicitly use super in 
	* child constructor the compiler doesn't invoke the parent constructor automatically.
	*/
	
	public SuperExample(int num,String vehicleName,String vehicleColor) {
		super(vehicleName,vehicleColor); // explicit call to parent constructor with parameters
		this.num=num;
		System.out.println("Inside parameterized child constructor");
	}
	
	public void display() {
		System.out.println("Value of number "+num);
	}
	
	public static void main(String[] args) {
		/*
		 * Whenever a child class constructor gets invoked it implicitly invokes the 
		 * constructor of parent class. You can also say that the compiler inserts a 
		 * super(); statement at the beginning of child class constructor.
		 * */
		
		SuperExample su = new SuperExample();
		su.display(); // By default variable is initialized to zero
		
		// can also be called as below
		new SuperExample();
		
		/* Even when we use parameterized constructor compiler will by default call parent 
		 * class constructor(no parameters).
		 * In order to call parameterized constructors from parent class we use super(args) 
		 * inside the child class constructor
		 */
		
		SuperExample suObj = new SuperExample(101,"Bolero","Black");
		suObj.display();
	}

}

/* Output:
You have entered the name and price of vehicle
Inside super constructor
Value of number 0
You have entered the name and price of vehicle
Inside super constructor
You have chosen to enter name and color of vehicle
Name: Bolero
Color: Black
Inside parameterized child constructor
Value of number 101

 * */
