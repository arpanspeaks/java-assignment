package week_2.assignment_1;

import java.util.ArrayList;

/*
	Create an abstract class Instrument which is having the abstract function play.
	Create three more sub classes from Instrument which is Piano, Flute, Guitar.
	Override the play method inside all three classes printing a message
	
	“Piano is playing  tan tan tan tan  ”  for Piano class
	“Flute is playing  toot toot toot toot”  for Flute class
	“Guitar is playing  tin  tin  tin ”  for Guitar class
	
	You must not allow the user to declare an object of Instrument class.
	
	Create an array of 10 Instruments.
	
	Assign different type of instrument to Instrument reference.
	
	Check for the polymorphic behavior of  play method.
	
	Use the instanceof operator to print that which object stored at which index of instrument array.
*/


public class Main {

	public static void main(String[] args) {
		
		ArrayList<Instrument> instruments = getInstruments(10);
		for(Instrument i : instruments) {
			i.play();
		}

		System.out.println();
		for(int i=0; i<instruments.size(); i++) {
			System.out.print(String.format("Object at index %d is an instance of class: ", i));	
			if(instruments.get(i) instanceof Piano) {
				System.out.println("Piano");
			} else if(instruments.get(i) instanceof Flute) {
				System.out.println("Flute");
			} else if(instruments.get(i) instanceof Guitar) {
				System.out.println("Guitar");
			}
			
//			Alternative: One liner
			
//			System.out.println(instruments.get(i).getClass().getSimpleName());
		}
		
	}
	
	static ArrayList<Instrument> getInstruments(int noOfInstruments) {
		ArrayList<Instrument> instruments = new ArrayList<>();
		for(int i=1; i<=noOfInstruments; i++) {
			if(i % 3 == 1) instruments.add(new Piano());
			else if(i % 3 == 2) instruments.add(new Flute());
			else if(i % 3 == 0) instruments.add(new Guitar());
		}
		return instruments;
	}

}
