package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * Handle Checked exception using try-catch blocks.
 * */

public class CheckedException2 {
	public static void main(String[] args) {
		FileInputStream fis=null;
		try {
			fis = new FileInputStream("/Users/harish/epam/a/testing_project/javabasics/src/main/java/resources/data.txt");
			int k;
			try {
				while ((k=fis.read())!=-1) {
					System.out.print((char)k);
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException | NullPointerException e) {
			
			e.printStackTrace();
		}
		
		finally {
			try {
				fis.close();
			} catch (NullPointerException | IOException  e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
