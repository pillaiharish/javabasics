package hometask.arraystrings05;

	/*
	 * 2. Write a program to find biggest and smallest number in a array.
	 * */

public class BiggestAndSmallestInArray {

	public static void main(String[] args) {
		int n=5;
		int[] arr=new int[]{20, 10, 20, 4, 100};
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}else {
				max=arr[i];
			}
		}
		System.out.println(min+" "+max);

	}
}
