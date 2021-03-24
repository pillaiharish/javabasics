package hometask.variables01;

public class TotalApples2 {
	
	public static void main(String[] args) {
		double countApplesDaniel=3.5;
		double countAppleAmber=2.5;
		System.out.println("Daniel has "+countApplesDaniel+" apples.");
		System.out.println("Amber has "+countAppleAmber+" apples.");
		Input obj1= new Input(countApplesDaniel, countAppleAmber);
		System.out.println(obj1.toString());
	}
}
/* Output:
Daniel has 3.5 apples.
Amber has 2.5 apples.
Togather they have 6 apples.

*/

 