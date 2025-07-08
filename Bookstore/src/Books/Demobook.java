package Books;

import java.time.LocalDate;

public class Demobook extends Book implements  isPurchasable  {
	
	public Demobook(String title, String ISBN, double price, LocalDate publicationDate,int yearstobecomeold) {
		super(title, ISBN, price, publicationDate,yearstobecomeold);
		
	}

	
	
	@Override
	public boolean isPurchasable() {
		return false; // Assuming all demo books arenot purchasable
	}

	

	}


