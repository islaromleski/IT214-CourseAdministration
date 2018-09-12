/**
 * This is a program that manages the Student and Course objects.
 * @author Matthew Romleski
 */


public class MyProgram {
	
	public static void main(String[] args) {
		Student firstStudent = new Student();
		Student secondStudent = new Student();
		Student thirdStudent = new Student();
		
		firstStudent.id = 1;
		firstStudent.firstName = "Marc";
		
		secondStudent.id = 2;
		secondStudent.firstName = "Sophie";

		thirdStudent.id = 3;
		thirdStudent.firstName = "John";
		
		System.out.println("The student object referred to " +
		"by the variable secondStudent has the first " +
		"name: " + secondStudent.firstName);
		
		Book book1 = new Book();
		book1.title = "Beginning Java";
		book1.authors = new String[] {
			"Bart Baesens",
			"Aimee Backiel",
			"Seppe vanden Broucke"
		};
		
		Book book2 = new Book();
		book2.title = "Catcher in the Rye";
		book2.authors = new String[]{"J. D. Salinger"};
		
		Book book3 = new Book();
		System.out.println("The title of the book is " + book3.title);
		
		Book book = null;
		System.out.println("Now, book equals: " + book);
		book = new Book();
		System.out.println("And now, book equals: " + book);
		
		final Book superLargeBook = new Book();
		superLargeBook.title = "Super Large Boring Book";
		superLargeBook.nrOfPages = 1400;
		
		System.out.println("Check if your book has a valid number of pages!");
		System.out.println("- Minimum amount: " + Book.MIN_AMOUNT_OF_PAGES);
		System.out.println("- Maximum amount: " + Book.MAX_AMOUNT_OF_PAGES);
		System.out.println("- Your book: " + superLargeBook.nrOfPages);
		System.out.println("- Copies Sold: " + superLargeBook.copiesSold);
		
		superLargeBook.copiesSold += 1000;
		
		System.out.println("- Updated Copies Sold:" + superLargeBook.copiesSold);
	}
}
