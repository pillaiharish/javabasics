package hometask.loopsarray04;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]){  
		  int r,sum=0,temp;    
		  Scanner scanner = new Scanner(System.in);
		  int n=scanner.nextInt();
		  scanner.close();
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  

}
/*
 * Output:
 * 11
 * palindrome number 
 * 
 * 404
 * palindrome number 
 * 
 * 12
 * not palindrome
 * */