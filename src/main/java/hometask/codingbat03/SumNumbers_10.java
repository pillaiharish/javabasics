package hometask.codingbat03;
/*
 * https://codingbat.com/prob/p121193
 * */

/*
 * Given a string, return the sum of the numbers appearing in the string, ignoring all other 
 * characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) 
 * tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string 
 * to an int.)
 * */
public class SumNumbers_10 {
	public static int sumNumbers(String str) {
		  int add=0;
		  String tempString="0";
		  
		  for(int i=0;i<str.length();i++){
		    char ch=str.charAt(i);
		    if(Character.isDigit(ch)){
		      tempString+=ch;
		    }else {
		    	add+=Integer.parseInt(tempString);
		    	tempString="0";
		    }
		  }
		  return add+Integer.parseInt(tempString);
		}
	public static void main(String[] args) {
		System.out.println(sumNumbers("abc123xyz")+" "+sumNumbers("aa11b33")+" "+sumNumbers("7 11") );
	}
}
