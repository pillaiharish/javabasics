package hometask.loopsarray04;

import java.util.Scanner;

	/*
	 * 1. Generate Pyramid For a Given Number Example.
	 * 
	 * */

public class Pyramid {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int x=sc.nextInt();
		sc.close();
		int num=0;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("\t"+num);
				num=num+x;
			}
			System.out.println();
		}
		

	}

}

	/** Output:
	 *	5
		2
		0
		2	4
		6	8	10
		12	14	16	18
		20	22	24	26	28
	*/
