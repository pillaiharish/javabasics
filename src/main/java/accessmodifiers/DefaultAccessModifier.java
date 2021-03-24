package accessmodifiers;
/*	Topics covered: Default, Private, Protected, Default
 * */

/* Default:
 * Any class inside same package can use the class method.
 * But any class outside the package even if inherit will not be able to access the method.
 * */

public class DefaultAccessModifier {
	
	 /* Default:
	  * Since we didn't mention any access modifier below method addTwoNumbers would
	  * be considered as default.
	  */
	
	int addTwoNumbers(int a, int b){
		return a+b;
	}
	
	/* Protected
	 * Protected data member and method are only accessible by the classes of the same package 
	 * and the subclasses present in any package. 
	 * Classes cannot be declared protected. 
	 * This access modifier is generally used in a parent child relationship.
	 * */
	protected int subtractTwoNumbers(int a,int b) {
		return a-b;
	}
}

/* Protected classes:
 * Classes cannot be declared protected. 
 * Below line of code will throw errors.
 * protected class NewClass{}
 * 
 * */



/*
 * 
------------+-------+---------+--------------+--------------+--------
            | Class | Package | Subclass     | Subclass     |Outside|
            |       |         |(same package)|(diff package)|Class  |
————————————+———————+—————————+——————————----+—————————----—+————————
public      | Yes   |  Yes    |    Yes       |    Yes       |   Yes |    
————————————+———————+—————————+—————————----—+—————————----—+————————
protected   | Yes   |  Yes    |    Yes       |    Yes       |   No  |    
————————————+———————+—————————+————————----——+————————----——+————————
default     | Yes   |  Yes    |    Yes       |    No        |   No  |
————————————+———————+—————————+————————----——+————————----——+————————
private     | Yes   |  No     |    No        |    No        |   No  |
------------+-------+---------+--------------+--------------+--------
 */

/*
 * Meaning of subclass is child class(inheritance using extends keyword)
 * Meaning of Outside class is we need to create an object of the class in the outside
 * class like the below mentioned line.
 * MethodClass m=new MethodClass();
 * */
