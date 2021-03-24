package hometask.codingbat03;
/*
 * https://codingbat.com/prob/p179479
 * */
/*
 * Given a string, return the length of the largest "block" in the string. A block is a run of 
 * adjacent chars that are the same.
 * */

public class MaxBlock_09 {
	public static int maxBlock(String str) {
		  int count=1;
		  int maxCount=0;
		  for(int i=0;i<str.length()-1;i++){
		    
		    if(str.charAt(i)==str.charAt(i+1)){
		      count++;
		    }else{		      
		      count=1;
		    }
		    maxCount=Math.max(maxCount,count);
		  }
		  return maxCount;
		}
	public static void main(String[] args) {
		System.out.println(maxBlock("hoopla") );
		System.out.println(maxBlock("abbCCCddBBBxx"));
		System.out.println(maxBlock(""));
		System.out.println(maxBlock("xyzz"));
		System.out.println(maxBlock("XXBBBbbxxXXXX"));
	}
}
