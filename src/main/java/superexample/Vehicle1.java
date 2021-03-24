package superexample;

public class Vehicle1 {
	private String vehicleName;
	private int vehiclePrice;
	protected String vehicleColor;
	
	protected Vehicle1() {
		System.out.println("You have entered the name and price of vehicle");
	}
	
	public Vehicle1(String requestChoice) {
		System.out.println("You have chosen to enter name and color of vehicle");
	}
	
	public Vehicle1(String name,int price) {
		this();
		this.vehicleName = name;
		this.vehiclePrice = price;
		System.out.println("Name: "+vehicleName);
		System.out.println("Price: "+vehiclePrice);
		
	}
	
	public Vehicle1(String name,String color) {
		this(color);
		this.vehicleName = name;
		this.vehicleColor = color;
		System.out.println("Name: "+vehicleName);
		System.out.println("Color: "+vehicleColor);
	}

}
