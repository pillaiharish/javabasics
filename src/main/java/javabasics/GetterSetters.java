package javabasics;

import java.util.Scanner;

/*
 * Topics covered: getter(), setter()
 * */

/*
 * getter() also called accessors: are methods that provide access to an object's instance variables.
 * setter() also called mutators: are methods that provide the caller with an opportunity to update the value 
 * of a particular instance variable.
 * */

class Person{
	private String name;
	private int age;
	
	protected final void greet() {
		System.out.println("Greetings from the bot to "+name+" What can I do for you?");
	}
	// getter method with return type
	protected final int yearsOfRetirement() {
		if(age<65) {
			return 65-age;
		}
		return age;
	}
	// getter method with return type for age
	
	public final int getAge() {
		return age; // here we dont need keyword this
	}
	// getter method with return type for name
	public final String getName() {
		return name;
	}
	
	
	/* setters: passing values to methods is setters.
	 * this keyword is used to differentiate between 
	 * class instance variable and local variables.
	 * 
	 */
	
	
	public final void setAge(int a) {
		this.age = a;
	}
	
	
	/* setters are used to grab values instead of local variables
	 * and dont have return type. Local variables should have access
	 * modifiers as private
	 * 
	 */
	
	
	public final void setName(String n) {
		this.name = n;
	}
	
	public void dataManipulation() {
		
		System.out.println("Data manipulation calling the getters:");
		
		System.out.println("Age: "+getAge());
		System.out.println("Name:  "+getName());
	}
	
}


public class GetterSetters {
	public static void main(String[] args) {
		System.out.println("Please enter your name and age:");
		Scanner sc=new Scanner(System.in);
		String userName=sc.next();
		int userAge=sc.nextInt();
		
		Person personObj1=new Person();
		// from the perspective of main method, I want to set value to the object
		// instance that can be used inside the class Person. (similar to constructor)
		personObj1.setAge(userAge);
		personObj1.setName(userName);
		personObj1.greet();
		
		// getter method means i will get the value here below
		int retirementAge=personObj1.yearsOfRetirement();
		System.out.println("Your years till retirement are: "+ retirementAge);
		
		// from the perspective of main method, I want to get value from the class
		// Person using its object instances
		//calling getter function
		int age=personObj1.getAge();
		String name=personObj1.getName();
		System.out.println("Age: "+age);
		System.out.println("Name:  "+name);
		
		
		sc.close();
	}

}

