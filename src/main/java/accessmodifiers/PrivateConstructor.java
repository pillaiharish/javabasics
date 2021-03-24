package accessmodifiers;

/*	Topics covered: Default, Private, Protected, Default
 * */

/* 
 * If constructor is private we can create object within the same class
 * 
 * */

public class PrivateConstructor {
	private int n=99;
	private PrivateConstructor() {
		System.out.println();
	}
	
	/*
	 * Below line of code does not give us any error and its legal
	 * */
	
	public void display() {
		System.out.println(n);
		new PrivateConstructor();
	}
	
}

