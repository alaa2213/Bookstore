package Books;

import java.time.LocalDate;

public class paperBook  extends Book implements Shippable, isPurchasable {
 private int stock;	
private double weight;
 

	public paperBook(String title, String ISBN, double price,LocalDate publicationDate,int yearstobecomeold, int stock,double weight) {
		super(title, ISBN, price,publicationDate,yearstobecomeold);
		
		this.stock = stock;
		this.weight = weight;
	}
public void shipItem(String address) {
		System.out.println("Shipping " + getTitle() + " to " + address + ". Weight: " + weight + " kg.");
	}
	public int getStock() {
		
		return stock;
	}
	public boolean isPurchasable() {
		return true;
	}

	
public double getWeight() {
		return weight;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

	
}
