package week_2.assignment_7;

/*
	Write a program that allows you to create an integer array of 18 elements with the following values: 
		int A[]={3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0}
	The program computes the sum of element 0 to 14 and stores it at element 15,
	computes the average and stores it at element 16 and identifies the smallest value from the array 
	and stores it at element 17.
*/

public class Main {

	public static void main(String[] args) {
		int[] A = { 3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0 };
		A[17] = Integer.MAX_VALUE;
		for(int i=0; i<15; i++) {
			A[15] += A[i];
			if(A[i] < A[17]) A[17] = A[i];
		}
		// Average rounded off to the nearest integer!
		A[16] = (int) Math.round(A[15] / 15.0);
		
		System.out.println(A[15]);
		System.out.println(A[16]);
		System.out.println(A[17]);
	}

}
