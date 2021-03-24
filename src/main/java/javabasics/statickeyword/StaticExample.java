package javabasics.statickeyword;

/*
 * Topics covered: static, final
 * */

/*
 * We can use static in calling static imports when we have same method names in different
 * packages we need to specify which is required to be called.
 * 
 * */
import static java.lang.Math.*;
/*
 * Static is used in following ways:
 * 1) static variables
 * 2) static methods
 * 3) static block
 * 4) static inner class
 * 5) interface static methods
 * */

/*
 * variables which are static are non instance variables. Non instance variables (static)
 * belong to the class and instance variables belong to the object created. static variables 
 * exist before the object is created.
 *  */
class School{
	/* 
	 * When creating final variables we need to make sure that it is assigned a value and
	 * value of variable cannot be changed. 
	 * Java constants use static final keywords and are capitals and donot change values once assigned.
	 * */
	public static final int CLASS_NUMBER =  7;
	public static final int START_ROLL = 700;
	protected String studentName; // instance variables
	protected static String teacherName; // class variables
	
	/*
	 * If we want to count the number of objects created, then it can be done by using class
	 * variable(static variable) being incremented inside constructor.
	 * */
	protected static int count=0;
	protected int rollNumber;
	protected School(){
		rollNumber= START_ROLL + count;
		count++;
	}
	
	public void greeting() {
		/*
		 * We can use instance variables and static variables in non static method. 
		 * 
		 * */
		System.out.println("Greeting from "+teacherName+" inside the school class method to "+studentName);
	}
	
	public void assignRollNo() {
		System.out.println("Assigned rollnumber to "+studentName+" is "+rollNumber);
	}
	
	public static void thankYou() {
		/*
		 * We cannot use non static variables in static method. 
		 * Below code will return errors.
		 * 
		 * System.out.println("Thank you from static void method "+studentName);
		 * 
		 * */
		System.out.println("Thank you from static void method "+teacherName);
		
	}
	
}

public class StaticExample {

	public static void main(String[] args) {
		School.teacherName="Ravi Sir";
		System.out.println("School.teacherName "+School.teacherName);
		System.out.println("Object count before initialization: "+School.count);
		/*
		 * we cannot call instance variables without creating object.
		 * Below code will return error.
		 * 
		 * School.studentName="Harishkumar";
		 * System.out.println("School.studentName "+School.studentName);
		 * 
		 * */
		
		School schoolObj1=new School();
		School schoolObj2=new School();
		
		schoolObj1.studentName="Harish";
		School.teacherName="Khaleel Sir";
		
		schoolObj2.studentName="Abhi";
		School.teacherName="Khaleel Sir";
		
		/*
		 * Also below code will have warnings as its a bad practice to use static variables
		 * 
		 * schoolObj1.teacherName="Khaleel Sir";
		 * System.out.println("Teacher Name: "+schoolObj1.teacherName);
		 * 
		 * */
		System.out.println("Teacher Name: "+School.teacherName);
		System.out.println("Student Name: "+schoolObj1.studentName);
		schoolObj1.greeting();
		
		System.out.println("Teacher Name: "+School.teacherName);
		System.out.println("Student Name: "+schoolObj2.studentName);
		schoolObj2.greeting();
		
		
		System.out.println("Standard of student and teacher is "+School.CLASS_NUMBER);
		
		
		schoolObj1.assignRollNo();
		schoolObj2.assignRollNo();
		
		System.out.println("Object count after initialization: "+School.count);
		System.out.println("static import of pi "+PI);
	}
	

}

/*	Output:
 * 
 	School.teacherName Ravi Sir
	Object count before initialization: 0
	Teacher Name: Khaleel Sir
	Student Name: Harish
	Greeting from Khaleel Sir inside the school class method to Harish
	Teacher Name: Khaleel Sir
	Student Name: Abhi
	Greeting from Khaleel Sir inside the school class method to Abhi
	Standard of student and teacher is 7
	Assigned rollnumber to Harish is 700
	Assigned rollnumber to Abhi is 701
	Object count after initialization: 2
	static import of pi 3.141592653589793
 * */
