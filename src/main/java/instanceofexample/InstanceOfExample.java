package instanceofexample;

class Example{
	public void display() {
		System.out.println("Simple display function");
	}
	
}

public class InstanceOfExample {

	public static void main(String[] args) {
		Example obj1=new Example();
		Boolean boolean1=obj1 instanceof Example;
		System.out.println(obj1 instanceof Example);
		System.out.println("obj1 instanceof Example "+boolean1);

	}

}
