package hometask.variables01;

public class Input {
	private double doubleCount1;
	private double doubleCount2;
	
	public Input(int count1,int count2) {
		this.doubleCount1=count1;
		this.doubleCount2=count2;
	}
	
	public Input(double count1,double count2) {
		this.doubleCount1=count1;
		this.doubleCount2=count2;
	}
	
	public double getCount1() {
		return doubleCount1;
	}
	public double getCount2() {
		return doubleCount2;
	}
	public double addTwoDouble() {
		return getCount1()+getCount2();
	}

	public String toString() {
		return "Togather they have "+(int)addTwoDouble()+" apples.";
	}

}
