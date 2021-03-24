package hometask.loopsarray04;

	/*
	 * What are private constructors and where are they used give an example.
	 * 
	 * Private constructors are used in following 2 cases:
	 * 1) Internal Constructor chaining
	 * 2) Singleton class design pattern
	*/

class Singleton 
{ 
    static Singleton instance = null; 
    public int x = 10; 
    
    // private constructor can't be accessed outside the class 
    private Singleton() {  } 
   
    // Factory method to provide the users with instances 
    static public Singleton getInstance() 
    { 
        if (instance == null)         
             instance = new Singleton(); 
   
        return instance; 
    }  
} 
public class PrivateConstructorExample {
	public static void main(String args[])     
	   { 
	       Singleton a = Singleton.getInstance(); 
	       Singleton b = Singleton.getInstance(); 
	       a.x = a.x + 10; 
	       System.out.println("Value of a.x = " + a.x); 
	       System.out.println("Value of b.x = " + b.x); 
	   }   
}

/* 
 * Output:
 * Value of a.x = 20
 * Value of b.x = 20
 * 
 * */
