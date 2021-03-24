package hometask.basics02;

import java.util.Scanner;

public class BasicHomeTask1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name");
		String s= sc.next();
		System.out.println("Hello, "+s);
		sc.close();
	}

}
/* Output: 
Please enter your name
Harish
Hello, Harish
*/