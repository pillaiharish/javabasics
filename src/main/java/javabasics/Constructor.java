package javabasics;



/*
 * Topics covered: constructor, static, final, 
 * */

/* Constructor runs every time we create an object of class. 
 * It should have same name as the class. Used for initialization of instance variable
 * We can invoke the constructor by new constructorName also.
 * We can have constructor overloading(multiple constructor declarations).
 * We can call one constructor inside other constructor but the only criteria is the call
 * need to be made in the first line.
 * Constructors can be given public, protected and private modifiers.
 * public construct:
 * private construct:
 * protected construct: classes in same package and subclass of different packages
 * */

class Vehicle{
	private String vehicleName;
	private int vehiclePrice;
	private String vehicleColor;
//	private String requestDataEntryChoice;
	
	private Vehicle() {
		System.out.println("You have entered the name and price of vehicle");
	}
	
	public Vehicle(String requestChoice) {
		System.out.println("You have chosen to enter name and color of vehicle");
	}
	
	public Vehicle(String name,int price) {
		this();
		this.vehicleName = name;
		this.vehiclePrice = price;
		System.out.println("Name: "+vehicleName);
		System.out.println("Price: "+vehiclePrice);
		
	}
	
	public Vehicle(String name,String color) {
		this(color);
		this.vehicleName = name;
		this.vehicleColor = color;
		System.out.println("Name: "+vehicleName);
		System.out.println("Color: "+vehicleColor);
	}
	
	
}


public class Constructor {
	public static void main(String[] args) {
		
		Vehicle vehicle1=new Vehicle("Tata Tigor", 2800000);
		Vehicle vehicle2=new Vehicle("Ford Figo","Red");
		
	}

}


/*
 * Output:
	You have entered the name and price of vehicle
	Name: Tata Tigor
	Price: 2800000
	You have chosen to enter name and color of vehicle
	Name: Ford Figo
	Color: Red
*/

 