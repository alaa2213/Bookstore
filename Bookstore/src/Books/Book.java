package Books;

import java.time.LocalDate;

public class Book {
String title;
String ISBN;
double price;
int yearstobecomeOld =0; // Assuming a book is considered old after 10 years
LocalDate publicationDate;
public Book(String title, String ISBN, double price, LocalDate publicationDate,int yearstobecomeOld) {
	this.title = title;
	this.ISBN = ISBN;
	this.price = price;
	this.publicationDate = publicationDate;
	this.yearstobecomeOld = yearstobecomeOld;
}
public String getTitle() {
	return title;
}
public int getYearsToBecomeOld() {
	return yearstobecomeOld;
}
public void setTitle(String title) {
	this.title = title;
}
public String getISBN() {
	return ISBN;
}
public void setISBN(String iSBN) {
	ISBN = iSBN;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public LocalDate getPublicationDate() {
	return publicationDate;
}}