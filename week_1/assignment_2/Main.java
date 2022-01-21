package week_1.assignment_2;

/*
	Define a class Rectangle with its length and breadth.
	Provide appropriate constructor(s), which gives facility of constructing rectangle object 
	with default values of length pf breadth as 0 or passing value of length and breadth externally 
	to constructor.Provide appropriate accessor & mutator methods to Rectangle class. 
	Provide methods to calculate area & to display all information of Rectangle. 
	Design different class TestRectangle class in separate source file, which will contain main function. 
	From this main function, create 5 Rectangle objects.
*/

public class Main {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(10, 5);
		Rectangle r3 = new Rectangle(2.5, 7.0);
		Rectangle r4 = new Rectangle(7, 3.1);
		Rectangle r5 = new Rectangle(5, 83);
		
		r5.getInfoOfRectangle();

	}

}