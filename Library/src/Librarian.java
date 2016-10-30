
public class Librarian {
	
	/* Fields */
	private Library library;
	
	/* Constructor */
	Librarian(Library library){
		this.library = library;
	}
	
	/* Setters and Getters */
	public void setLibrary(Library library){
		this.library = library;
	}
	public Library getLibrary(){
		return this.library;
	}
	
	/* Methods */
	
	public void findMeBooksFromAuthor(String input_name ){
		this.library.printBookFromAuthor(input_name);
	}
	
	public void findMeAvailableBooks(){
		this.library.printAvailableBooks();
	}
	
	public void print(){
	    library.print();
	}
	
	public void findMeBook(String input_name){
		this.library.printBookDetails(input_name);
	}
	
	public  void userRentABook(String title, int userid){
	    	this.library.rentBook(title, userid);
	}
	
	public  void userReturnABook(String title, int userid){
	    	this.library.returnBook(title, userid);
	}
	
	public void addNewBook(String title, Author author, String isbn,
		int physical_copies, int available_copies, int times_rented){
	    	this.library.addNewBook(title, author, isbn, physical_copies, available_copies, times_rented);
	}
	
	public void printLibrarysHistoryTransactions(){
	    this.library.printHistoryTransactions();
	}
	
	public void printLibrarysPendingTransactions() {
		this.library.printPendingTransactions();
	}
	
	public void executeLibrarysPendingTransactions(){
		this.library.executePendingTransactions();
	}
	
	
}
