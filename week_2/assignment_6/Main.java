//package week_2.assignment_6;

/*
	Write a program that accepts two numbers in the range from 1 to 40 from the Command Line. 
	It then compares these numbers against a single dimension array of five integer elements ranging in value from 1 to 40. 
	The program displays the message BINGO if the two input values are found in the array element. 
	For example:
		input>java programName 3 29
		output>Your first number was 3
		Your second number was 29
		Bingo! // this message if 3 and 29 is found in the array
		Not Found! // this message if 3 and 29 is not found in the array
		The array was 7 25 5 19 30
*/


public class Main {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]), b = Integer.parseInt(args[1]);
			int[] arr = {7, 25, 5, 19, 30};
			boolean aFound = false, bFound = false;
			for(int ele : arr) {
				if(!aFound && ele == a) { aFound = true; continue; }
				if(!bFound && ele == b) { bFound = true; continue; }
				if(aFound && bFound) break;
			}
			if(aFound && bFound) System.out.println("Bingo!");
			else System.out.println("Not Found!");
		} catch(Exception e) {
			System.out.println("Incorrect argument(s) passed!");
		}
	}

}
