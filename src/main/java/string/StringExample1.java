package string;

public class StringExample1 {
	public static void main(String args[]){  
		String s1="java";//creating string by java string literal  
		char ch[]={'s','t','r','i','n','g','s'};  
		String s2=new String(ch);//converting char array to string  
		String s3=new String("example");//creating java string by new keyword  
		System.out.println(s1);  
		System.out.println(s2);  
		System.out.println(s3);  
		String s4="Sachin"+" Tendulkar";  
		System.out.println(s4);//Sachin Tendulkar  
		String s5=50+30+"Sachin"+40+40;  
		System.out.println(s5);//80Sachin4040  
		
		String s6="Sachin ";  
		String s7="Tendulkar";  
		String s8=s6.concat(s7);  
		System.out.println(s8);//Sachin Tendulkar  
		
	}

}
