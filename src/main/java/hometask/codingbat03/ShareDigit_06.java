package hometask.codingbat03;

/*
 * http://codingbat.com/prob/p153748
 * */
/*
 * Given two ints, each in the range 10..99, return true if there is a digit that appears in both 
 * numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the 
 * % "mod" n%10 gives the right digit.)
 * */

public class ShareDigit_06 {
	public boolean shareDigit(int a, int b) {
	    int a11=a/10;
	    int a22=a%10;
	    int b11=b/10;
	    int b22=b%10;
	    if(a11==b11||a11==b22||a22==b11||a22==b22){
	      return true;
	    }
	    return false;
	}


}
