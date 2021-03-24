package hometask.arraystrings05;

import java.util.Scanner;

/*
 * 1. Write a program to find the missing number in integer array of 1 to 100
 * 
 * */

public class MissingNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] arr=new int[100];
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		scanner.close();

//		int arr[]= {1, 2, 4, 6, 3, 7, 8};
		
		int size=arr.length+1;
		int sum=(size*(size+1))/2;
		int num=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum-arr[i];
		}
		num=sum;
		System.out.println("The missing integer is "+num);
	}
}
