package string;

/*
 * Topics covered: toString, stringbuilder
 * */

class Dog{
	protected String dogName;
	protected int id;
	
	Dog(int id,String name){
		this.id = id;
		this.dogName = name;
	}
	// toString method is used like getter method for strings
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(" : ").append(dogName);
		return sb.toString();
	}
	public String toString(String format) {
		
		return String.format("%-4d : %s", id,dogName) ;
	}
}

public class ToStringExample {

	public static void main(String[] args) {
		Dog dg1 = new Dog(8,"Tommy");
		Dog dg2 = new Dog(9,"Jimmy");
		
		System.out.println(dg1.toString());
		System.out.println(dg2.toString());

		System.out.println(dg1.toString("format"));
		System.out.println(dg2.toString("format"));
	}

}
/* Output:
8 : Tommy
9 : Jimmy
8    : Tommy
9    : Jimmy
 * */
 