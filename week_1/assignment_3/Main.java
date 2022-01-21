package week_1.assignment_3;

import java.util.ArrayList;
import java.util.List;

/*
 * 
	Create a class Book which describes its Book_title and Book_price. 
	Use getter and setter methods to get & set the Books description.
	Implement createBooks and showBooks methods to create objects of Display the books along with its description as follows:-
	
		  Book Title			Price
		  Java Programming	    Rs.350.50
		  Let Us C			    Rs.200.00
		
	Note: createBooks & showBooks should not be member functions of Book class.

*/


public class Main {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		books = createBooks();
		showBooks(books);
	}
	
	private static List<Book> createBooks() {
		List<Book> books = new ArrayList<>();
		
		Book b1 = new Book();
		b1.setBook_name("Java Programming");
		b1.setBook_price(350.50);
		books.add(b1);
		
		Book b2 = new Book();
		b2.setBook_name("Let Us C");
		b2.setBook_price(200.00);
		books.add(b2);
		
		return books;
	}
	
	private static void showBooks(List<Book> books) {
		System.out.println("Book Title\t\tPrice");
		books.forEach(book -> System.out.println(book.getBook_name() + "\t" + book.getBook_price()));
		// todo: formatting
	}

}
