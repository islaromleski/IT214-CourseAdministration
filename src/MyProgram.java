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
		"by the variable secondStudent has a first " +
		"name of " + secondStudent.firstName + ".\n");
		
		Course IT214 = new Course();
		
		IT214.setCourseID(214);
		IT214.setCourseName("Fundamentals of Software Programming");
		
		Book book1 = new Book("Beginning Java");
		book1.authors = new String[] {
			"Bart Baesens",
			"Aimee Backiel",
			"Seppe vanden Broucke"
		};
		
		Book book2 = new Book("Catcher in the Rye");
		book2.authors = new String[]{"J. D. Salinger"};
		
		Book book3 = new Book("N/A");
		System.out.println("The title of the book3 is " + book3.title + ".\n");
		
		Book book = null;
		System.out.println("First, book equals: " + book + ".");
		book = new Book("N/A");
		System.out.println("And now, book equals: " + book + ".\n");
		
		final Book superLargeBook = new Book("Super Large Boring Book", 1947, 1400, 0);
		
		System.out.println("Check if your book has a valid number of pages!");
		System.out.println("- Minimum amount: " + Book.MIN_AMOUNT_OF_PAGES + ".");
		System.out.println("- Maximum amount: " + Book.MAX_AMOUNT_OF_PAGES + ".");
		System.out.println("- Your book: " + superLargeBook.getNmbrOfPages() + ".");
		System.out.println("- Copies Sold: " + superLargeBook.getCopiesSold() + ".");
		
		superLargeBook.setCopiesSold(superLargeBook.getCopiesSold()+1000);
		
		System.out.println("- Updated Copies Sold: " + superLargeBook.getCopiesSold());
	}
}
