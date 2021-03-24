package hometask.codingbat03;
/*
 * https://codingbat.com/prob/p118077
 * */

/*
 * Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of 
 * digits as a. If the sum has more digits than a, just return a without b. (Note: one way to compute 
 * the number of digits of a non-negative int n is to convert it to a string with String.valueOf(n) and 
 * then check the length of the string.)
 * */

public class SumLimit_07 {
	public static int sumLimit(int a, int b) {
		  String s = String.valueOf(a+b);
		  if(s.length()==String.valueOf(a).length()){
		    return a+b;
		  }
		  
		  return a;
		}
	public static void main(String[] args) {
		System.out.println(sumLimit(2, 3)); //5
		System.out.println(sumLimit(8, 3)); //8
		System.out.println(sumLimit(8, 1)); //9
	}
}
