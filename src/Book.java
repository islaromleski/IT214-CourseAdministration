/**
 * @author Matthew Romleski
 */

public class Book {
	final static int MAX_AMOUNT_OF_PAGES = 500;
	final static int MIN_AMOUNT_OF_PAGES = 50;	
	final static int DEFAULT_YEAR = 2014;
	final String title;
	final int releaseYear;
	private int copiesSold;
	private int nmbrOfPages;
	String[] authors;

	Book(String inputTitle) {
		// Calls other constructor:
		this(inputTitle, DEFAULT_YEAR, -999999, 0);
	}

	Book(String inputTitle, int rYear) {
		// Calls other constructor:
		this(inputTitle, rYear, -999999, 0);
	}

	Book(String inputTitle, int rYear, int newPages) {
		// Calls other constructor:
		this(inputTitle, rYear, newPages, 0);
	}

	Book(String inputTitle, int rYear, int newPages, int currentSold) {
		this.title = inputTitle;
		this.releaseYear = rYear;
		this.setNmbrOfPages(newPages);
		this.copiesSold = currentSold;
	}
	
	int getCopiesSold() {
		return this.copiesSold;
	}
	
	void setCopiesSold(int newCopiesSold) {
		this.copiesSold = newCopiesSold;
	}
	
	int getNmbrOfPages() {
		return this.nmbrOfPages;
	}
	
	void setNmbrOfPages(int newNmbrOfPages) {
		this.nmbrOfPages = newNmbrOfPages;
	}
	
}