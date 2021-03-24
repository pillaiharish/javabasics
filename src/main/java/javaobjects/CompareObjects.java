package javaobjects;

/*
 * equals() versus ==
 * */

class Person{
	private String name;
	private int age;
	
	public Person(String n,int a) {
		this.name=n;
		this.age=a;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		else if(o == null || getClass()!=o.getClass()) {
			return false;
		} 
		// upcasting
		Person person = (Person) o;
		
		return name == person.name && age == person.age;
	}
	
}

public class CompareObjects {
	public static void main(String[] args) {
		System.out.println((new Person("Harish", 26)).equals(new Person("Harish", 26))); //true
		System.out.println((new Person("Harish", 23)).equals(new Person("Harish", 26))); //false
		System.out.println((new Person("Jhon", 21).equals(new Object()))); //false
	}
}

/* Output:
true
false
false
*/
