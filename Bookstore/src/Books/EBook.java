package Books;

import java.time.LocalDate;

public class EBook extends Book implements sendViaEmail,isPurchasable {
private String fileType;
public EBook(String title, String ISBN, double price,LocalDate publishDate,int yearstobecomeold, String fileType) {
	super(title, ISBN, price,publishDate,yearstobecomeold);
	this.fileType = fileType;
}
public String getFileType() {
	return fileType;
}
public void sendbyEmail(String emailAddress) {
	System.out.println("Sending " + getTitle() + " to " + emailAddress + " in " + fileType + " format.");
}
public boolean isPurchasable() {
	return true;
}}