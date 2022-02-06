//package week_2.assignment_5;

/*	
	Write a program that accepts two numbers from the Command Line and prints them out. 
	Then use a for loop to print the next 13 numbers in the sequence where each number is the sum of the previous two. 
		For example:
		input> java programName 1 3
		output> 1 3 4 7 11 18 29 47 76 123 199 322 521 843 1364
*/


public class Main {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]), b = Integer.parseInt(args[1]);
			System.out.print(String.format("%d %d ", a, b));
			for(int i=0; i<13; i++) {
				int temp = a + b;
				System.out.print(String.format("%d ", temp));
				a = temp - a;
				b = temp;
			}
		} catch(Exception e) {
			System.out.println("Incorrect argument(s) passed!");
		}
	}

}
