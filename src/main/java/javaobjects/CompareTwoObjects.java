package javaobjects;

/*
 * Java Object class is the super class of all the Java classes. 
 * Java object class provides 2 methods to compare objects:
 * 
 * 1) equals() Method : It compare the equality of two objects.The two objects will be equal 
 * if they share the same memory address.
 * 
 * 2) hashCode() Method : It is 32-bit signed integer value, unique id provided by JVM to Java object.
 * Each Java object is associated with the hash code. The hash code is managed by a hash-based data structure, 
 * such as HashTable, HashSet,
 * */

/*
 * When we override the equals() method, it is necessary to override the hashCode() method, also.
 * */
class Example{
	public int a=10;
	public String s="Hola";
	public int b;
	Example(int b){
		this.b=b;
	}

	public String name() {
		System.out.println("Printing...");
		return "";
	}
}

public class CompareTwoObjects {
	public static void main(String[] args) {
		Example obj1 = new Example(5);
		Example obj2 = new Example(5); 
		System.out.println("(obj1.name()).equals(obj2.name()) "+(obj1.name()).equals(obj2.name()));
		System.out.println("obj1.equals(obj2) "+obj1.equals(obj2));
		System.out.println("obj1==obj2 "+(obj1==obj2));
		System.out.println("obj1.s==obj2.s "+obj1.s==obj2.s);
		System.out.println(("obj1.s).equals(obj2.s) "+obj1.s).equals(obj2.s));
		String  str1="Harish";
		String str2=new String("Kumar");
		System.out.println("str1.equals(str2) "+str1.equals(str2));
		System.out.println("str1==str2 "+(str1==str2));
		String str3 = new String("Harish");
		System.out.println("str1.equals(str3) "+str1.equals(str3));
		System.out.println("str1==str3 "+(str1==str3));
	}
}

/* Output:
Printing...
Printing...
(obj1.name()).equals(obj2.name()) true
obj1.equals(obj2) false
obj1==obj2 false
false
false
str1.equals(str2) false
str1==str2 false
str1.equals(str3) true
str1==str3 false
*/
