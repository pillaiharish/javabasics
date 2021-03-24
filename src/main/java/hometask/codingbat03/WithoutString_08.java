package hometask.codingbat03;
/*
 * https://codingbat.com/prob/p192570
 * */

/* 
 * Given two strings, base and remove, return a version of the base string where all instances of 
 * the remove string have been removed (not case sensitive). You may assume that the remove string 
 * is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves 
 * "x".
 * */

public class WithoutString_08 {
	public static String withoutString(String base, String remove) {
		int i=0;
		int count=0;
		String tempString="";
		while(i<=base.length()-remove.length()) {
			
			if(base.substring(i,i+remove.length()).equalsIgnoreCase(remove)) {
				
				i+=remove.length();
			}
			else {
				
				tempString+=base.charAt(i);
				count++;
				i++;
			}
		}
		
		
		
		 while(i < base.length()) {
		        tempString+=base.charAt(i);
		        count++;
		        i++;
		  }
		  return tempString;
	}
	public static void main(String[] args) {
		System.out.println(withoutString("Hello there", "llo"));
		System.out.println(withoutString("Hello there", "e"));
	}

}
