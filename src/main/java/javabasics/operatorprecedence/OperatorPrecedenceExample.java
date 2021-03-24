package javabasics.operatorprecedence;

/*
 * Operator precedence determines the order in which the operators in an expression are evaluated.
 * */

public class OperatorPrecedenceExample {
	public static void main(String[] args) {
	    	
	    	int a = 10, b = 5, c = 1, result;
	    	result = a-++c-++b;
	    	System.out.println("Output for a-++c-++b is");
	    	System.out.println(result);
	    }
}

/* Output:
Output for a-++c-++b is
2
*/
 