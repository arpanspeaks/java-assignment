//package week_2.assignment_4;

/*
	Write a program that takes a String through Command Line argument and display the length of the string. 
	Also display the string into uppercase and check whether it is a palindrome or not.
*/

public class Main {

	public static void main(String[] args) {
		try {
			String arg1 = args[0];
			System.out.println("Length of the passed argument: " + arg1.length());
			System.out.println("Argument in uppercase: " + arg1.toUpperCase());
			if(checkIfPalindrome(arg1)) System.out.println("Argument is a palindrome");
			else System.out.println("Argument is not a palindrome");
		} catch(Exception e) {
			System.out.println("No argument passed!");
		}
	}
	
	static boolean checkIfPalindrome(String str) {
		int l = 0, r = str.length() - 1;
		while(l < r) {
			if(str.charAt(l) != str.charAt(r)) return false;
			l++; r--;
		}
		return true;
	}

}
