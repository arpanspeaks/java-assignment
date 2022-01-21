package week_1.assignment_1;

import java.util.Scanner;

//Write a program to list all even numbers less than or equal to the number n.

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int n;
			System.out.print("Enter an integer: ");
			n = sc.nextInt();
			System.out.printf("The even numbers less than or equal to %d are:\n", n);
			for(int i=2; i<=n; i++) {
				if(n % 2 == 0) {
					System.out.print(i + " ");
				}
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
