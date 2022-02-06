package week_2.assignment_2;

import java.util.ArrayList;

/*
	Create an abstract class Compartment to represent a rail coach. 
	Provide a abstract function notice in this class. 
	Derive FirstClass, Ladies, General, Luggage classes from the compartment class. 
	Override the notice function in each of them to print notice suitable to the type of the compartment.
	Create a class TestCompartment . Write main function to do the following:
	Declare an array of Compartment pointers of size 10.
	Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
	Check the polymorphic behavior of the notice method.
*/

abstract class Compartment {
	abstract void notice();
}

class FirstClass extends Compartment {
	@Override
	void notice() {
		System.out.println("First Class Compartment");
	}
}

class Ladies extends Compartment {
	@Override
	void notice() {
		System.out.println("Ladies Compartment");
	}
}

class General extends Compartment {
	@Override
	void notice() {
		System.out.println("General Compartment");
	}
}

class Luggage extends Compartment {
	@Override
	void notice() {
		System.out.println("Luggage Compartment");
	}
}

class Randomizer {
	public static int generate(int min, int max) {
		return min + (int) (Math.random() * ((max - min) + 1));
	}
}

public class TestCompartment {

	public static void main(String[] args) {
		ArrayList<Compartment> comps = getCompartments(10);
		comps.stream().forEach(Compartment::notice);
	}

	static ArrayList<Compartment> getCompartments(int noOfCompartments) {
		ArrayList<Compartment> compartment = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			int ch = Randomizer.generate(1, 4);
			if (ch == 1)
				compartment.add(new FirstClass());
			else if (ch == 2)
				compartment.add(new Ladies());
			else if (ch == 3)
				compartment.add(new General());
			else if (ch == 4)
				compartment.add(new Luggage());
		}
		return compartment;
	}

}
