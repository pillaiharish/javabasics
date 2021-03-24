package hometask.basics02;

import java.util.Scanner;
class Calculator{
	private int firstNumber;
	private int secondNumber;
	private String operator;
	private static final String AND=" and ";
	private static final String IS=" is ";
	private final String combineStatement=getFirstNumber()+AND+getSecondNumber()+IS;
	
	public Calculator(int a, int b, String s) {
		this.firstNumber=a;
		this.secondNumber=b;
		this.operator=s;
	}
	
	public int getFirstNumber() {
		return firstNumber;
	}
	public int getSecondNumber() {
		return secondNumber;
	}
	public String getOperator() {
		return operator;
	}
	
	public void operations() {
		switch (getOperator()) {
		case "+":
			System.out.println("Selected operation is Addition");
			System.out.println("The addition of "+combineStatement+(getFirstNumber()+getSecondNumber()));
			break;
			
		case "-":
			System.out.println("Selected operation is Subtraction");
			System.out.println("The Subtraction of "+combineStatement+(getFirstNumber()-getSecondNumber()));
			break;
			
		case "*":
			System.out.println("Selected operation is Multiplication");
			System.out.println("The Multiplication of "+combineStatement+(getFirstNumber()*getSecondNumber()));
			break;
			
		case "/":
			System.out.println("Selected operation is Division");
			System.out.println("The Division of "+combineStatement);
			try {
				float division=((float)getFirstNumber()/getSecondNumber());
				System.out.format("%5.6f", division);
			} catch (Exception e) {
				e.printStackTrace();
			}		
			break;
		
		case "%":
			System.out.println("Selected operation is Percentage");
			System.out.println("The Percentage of "+combineStatement);
			try {
				int percentage=(int)((float)getFirstNumber()/getSecondNumber())*100;
				System.out.print(percentage);
			} catch (Exception e) {
				e.printStackTrace();
			}					
			break;
			
		case "mod":
			System.out.println("Selected operation is Modulo ");
			System.out.println("The remainder of "+combineStatement+(getFirstNumber()%getSecondNumber()));
			break;
		
		
		default:
			System.out.println ("ILLEGAL Arthemetic Operation " + getOperator());
		    throw new IllegalArgumentException("ILLEGAL Arthemetic Operation " + getOperator());
		}
	}
}

public class BasicCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number");
		int firstNumber=sc.nextInt();
		System.out.println("Please enter second number");
		int secondNumber=sc.nextInt();
		System.out.println("Enter one of symbols (+,-,*,/,mod,%)  to apply operation");
		String operation =  sc.next();
		Calculator calObj = new Calculator(firstNumber, secondNumber, operation);
		calObj.operations();
		sc.close();
	}
	

}
