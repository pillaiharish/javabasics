package exceptionhandling;

/*
 * Checked exceptions are checked at compile-time. It means if a method is throwing a checked 
 * exception then it should handle the exception using try-catch block or it should declare 
 * the exception using throws keyword, otherwise the program will give a compilation error.
*/

/*
 * Declare the exception using throws keyword.
 * */

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedException {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		fis = new FileInputStream("/Users/harish/epam/a/testing_project/javabasics/src/main/java/resources/data.txt"); 
		int k;
		while(( k = fis.read() ) != -1) 
	      { 
		   System.out.print((char)k); 
	      } 
	      fis.close();
	}

}

/* Output:
Hi this is a data file.
The format of the file is .txt.
Thank you!!!
Have a nice day.....
 */
