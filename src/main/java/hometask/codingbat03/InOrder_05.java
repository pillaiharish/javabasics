package hometask.codingbat03;
/*
 * https://codingbat.com/prob/p154188
 * */

/*
 * Given three ints, a b c, return true if b is greater than a, and c is greater than b. 
 * However, with the exception that if "bOk" is true, b does not need to be greater than a.
*/

public class InOrder_05 {
	public boolean inOrder(int a, int b, int c, boolean bOk) {
		  if(bOk==true){
		    if(c>b){
		    return true;
		    }
		  }
		  else if(b>a&&c>b){
		    return true;
		  }
		  return false;
		}

}
