package hometask.variables01;



public class TotalApples1 {

	public static void main(String[] args) {
		int countApplesDaniel=3;
		int countAppleAmber=2;
		System.out.println("Daniel has "+countApplesDaniel+" apples.");
		System.out.println("Amber has "+countAppleAmber+" apples.");
		Input obj1= new Input(countApplesDaniel, countAppleAmber);
		System.out.println(obj1.toString());
	}

}

/* Output:
Daniel has 3 apples.
Amber has 2 apples.
Togather they have 5 apples.
*/



















/* When to use constructors vs getter() and setter() methods
 * https://stackoverflow.com/questions/19359548/setter-methods-or-constructors
 * getter() also called accessors
 * setter() also called mutators
 */