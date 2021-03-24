package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException3 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("/Users/harish/epam/a/testing_project/javabasics/src/main/java/resources/data.txt");
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		int k;
		
		try {
			while(( k = fis.read() ) != -1) 
			  { 
			   System.out.print((char)k); 
			  }
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		// try-finally block to close the file
		finally {
			try {
				fis.close();
			} catch (IOException e) {
					e.printStackTrace();
			}
			
		}
	      
	}
}
