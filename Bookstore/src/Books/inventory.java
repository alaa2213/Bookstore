package Books;

import java.time.Year;
import java.util.ArrayList;
import java.util.Iterator;

public class inventory {
ArrayList<Book> books;
static int inventorySize = 0;
public inventory() {
	books = new ArrayList<>();
}
public void addBook(Book book) {
	if(book instanceof isPurchasable) {
		if(!((isPurchasable) book).isPurchasable()) {
			System.out.println("Book " + book.getTitle() + " is not purchasable.");
			return;
		}
		else {
			this.books.add(book);
		if(book instanceof paperBook) {
			inventorySize += ((paperBook) book).getStock();
			}
		else {
			inventorySize++;
		}
		}
		
		
	}
}
	

public ArrayList<Book> removeBook() {
	ArrayList<Book> removedBooks = new ArrayList<>();
	
	    Iterator<Book> iterator = books.iterator();

	    while (iterator.hasNext()) {
	        Book b = iterator.next();
	        if (Year.now().getValue() - b.getPublicationDate().getYear() >= b.getYearsToBecomeOld()) {
	            iterator.remove();             
	            removedBooks.add(b);   
	          
	        }
	    }
	
	return removedBooks;
}
public double buyBook(String ISBN,int quantity,String address,String email) throws IllegalArgumentException {
	for(Book book : books) {
		if(book.getISBN().equals(ISBN)) {
		
		if(book instanceof paperBook) {
			paperBook pb = (paperBook) book;
			if(pb.getStock() > 0 && quantity <= pb.getStock()) {
				pb.setStock(pb.getStock() - quantity);
				pb.shipItem(address);
				inventorySize -= quantity;
				return book.getPrice();
			} else {
				throw new IllegalArgumentException("Paper book is out of stock.");
			}
		}
		else {
			EBook eb = (EBook) book;
			eb.sendbyEmail(email);
			return book.getPrice();
		}
		
	} 
	
		
		
}
	throw new IllegalArgumentException("Book with ISBN " + ISBN + " not found in inventory.");
	
}
}

