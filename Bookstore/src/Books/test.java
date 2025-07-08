package Books;

import java.time.LocalDate;
import java.util.ArrayList;

public class test{

	public static void main(String[] args) {
	 inventory inventory = new inventory();
	 Book book1 = new paperBook("Effective Java", "978-0134686097", 45.00, LocalDate.of(2018, 1, 6), 10,4,1.5);
	 Book book2 = new EBook("Clean Code", "978-0132350884", 40.00, LocalDate.of(2008, 8, 1), 10, "PDF");
	 Book book3 = new Demobook("Java Concurrency in Practice", "978-0321349606", 50.00, LocalDate.of(2006, 12, 1), 10);
	 Book book4 = new paperBook("Design Patterns", "978-0201633610", 55.00, LocalDate.of(1994, 2, 15), 10, 5,1.0);
	 inventory.addBook(book1);
	 inventory.addBook(book2);
	 inventory.addBook(book3);
	 inventory.addBook(book4);
		// Print the books in the inventory
		for (Book book : inventory.books) {
			System.out.println("Title: " + book.getTitle() + ", ISBN: " + book.getISBN() + ", Price: " + book.getPrice());
		}
		//test buying books
		System.out.println("inventory before buying books "+ inventory.inventorySize);
		double b=inventory.buyBook("978-0201633610", 2, "Cairo", "me.com");
		System.out.println("Total price for buying book4: " + b);
		System.out.println("stock remaining for book4 "+((paperBook) book4).getStock());
		double b2=inventory.buyBook("978-0132350884", 2, "Cairo", "me.com");
		System.out.println("Total price for buying book2: " + b2);
		System.out.println("inventory remaining size: " + inventory.inventorySize);
		
		//test removing old books
		ArrayList<Book> removedBooks = inventory.removeBook();
		for(Book removedBook : removedBooks) {
			System.out.println("Removed old book: " + removedBook.getTitle() + ", ISBN: " + removedBook.getISBN());
		}
		
	}
}



