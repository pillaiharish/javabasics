package javabasics.enumexample;

/*
 * Enumerations serve the purpose of representing a group of named constants in a programming 
 * language. 
 * */


public class EnumExample {
	/*
	 * enum is used to declare constants. In older versions of java constants were declared using
	 * 'public static final'. Later enum got introduced.*/
	public static final int CONSTANT=0;
	public enum WeekDay{
		MONDAY,
		TUESDAY,
		WEDNUSDAY,
		THURSDAY,
		FRIDAY
	}
	
	public static void main(String[] args) {
		WeekEnd day1=WeekEnd.SATURDAY;
		System.out.println("Print one enum value "+day1);
		WeekDay[] day= WeekDay.values();
		
		//iterating through enum values in an array
		int count=1;
		for(WeekDay e : day) {
			System.out.println("WeekDay "+count+" "+e);
			count++;
		}
		
	}

}

/* Output: 
Print one enum value SATURDAY
WeekDay 1 MONDAY
WeekDay 2 TUESDAY
WeekDay 3 WEDNUSDAY
WeekDay 4 THURSDAY
WeekDay 5 FRIDAY
*/
