package synchronizedkeyword;

/* The test case for execution of below code is written using JUnit and available at
 * PATH: /javabasics/src/test/java/javabasics/AppTest.java
*/

/*
 * Synchronization in java is the capability to control the access of 
 * multiple threads to any shared resource.
 * There are two types of synchronization
 * 1) Process Synchronization
 * 2) Thread Synchronization*/

/*
 * Java synchronized keyword marks a block or a method a critical section. 
 * A critical section is where only one thread is executing at a time, and the thread holds 
 * the lock for the synchronized section. 
 * This synchronized keyword helps in writing concurrent parts of any application. 
 * It also protects shared resources within the block.
*/

public class SynchronizedExample {
    private int sum = 0;
    
    // Calling this method will always give different and assertion will fail.
    public void calculate() {
        setSum(getSum() + 1);
    }
    
    // So calling this method will always give 1000 as there is synchronization among threads
	public synchronized void synchronisedCalculate() {
	    setSum(getSum() + 1);
	}
	
	public int getSum() {
		return sum;
	}
	public void setSum(int s) {
		this.sum=s;
	}
}
