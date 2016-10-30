
public class Library {
	
	/* Fields */
	private AuthorList authorList;
	private BookList bookList;
	private TransactionHistory history;
	private TransactionQueue queue;
	private UserList usersList;

	/* Constructor */
	Library(AuthorList authorList, BookList bookList, UserList usersList, TransactionHistory history, TransactionQueue queue){
		this.authorList = authorList;
		this.bookList = bookList;
		this.usersList = usersList;
		this.history = history;
		this.queue = queue;
	}
	
	
	/* Getters and Setters */
	public void setAuthorList(AuthorList authorList){this.authorList = authorList;}
	public AuthorList getAuthorList(){return this.authorList;}
	public void setBookList(BookList bookList){this.bookList = bookList;}
	public BookList getBookList(){return this.bookList;}
	public void setUserList(UserList usersList){this.usersList = usersList;}
	public UserList getUserList(){return this.usersList;}
	public void setHistory(TransactionHistory history){this.history = history;}
	public TransactionHistory getHistory(){return this.history;}
	public void setQueue(TransactionQueue queue){this.queue = queue;}
	public TransactionQueue getQueue(){return this.queue;}
	
	
	/* Methods */	
	public void print(){
		bookList.print();
	}
	
	public void printAvailableBooks(){
		bookList.printAvailableBooks();
	}
	
	public void printBookDetails(String input){
		bookList.printBookDetails(input);
	}
	
	public void printBookFromAuthor(String input){
		bookList.printBookFromAuthor(input);
	}
	
	public Author getAuthor(String author_name) {
		return authorList.getAuthor(author_name);
	}
	
	public void addNewBook(String title, Author author, String isbn,
		int physical_copies, int available_copies, int times_rented) {
		Book b = new Book(title, author, isbn, physical_copies, available_copies, times_rented);
		bookList.add(b);
	}
	
	public void rentBook(String title, int userid) {
	    	if (bookList.bookExists(title) == true){
	    	    if (bookList.isBookAvailable(title) == true){
	    		Transaction t  = new Transaction(bookList.findBookBody(title), userid);
	    		this.history.add(t);
	    		bookList.rentBook(title);
	    		System.out.println("Successfull rent of book " + title + " from user with id " + userid + "\n");
	    	    } else {
	    		Transaction t  = new Transaction(bookList.findBookBody(title), userid);
	    		this.queue.enqueue(t);
	    		System.out.println("Pending transaction.\nNo availability of book " + title + "\n");
	    	    }
	    	} else {
	    	    System.out.println("The book " + title + " does not exist.\n");
	    	}
	}	
	
	public void returnBook(String title, int userid) {
	    	if ((bookList.bookExists(title) == true) && (bookList.comparePhysicalAndAvailableCopies(title) == true)){
	    	    Transaction t  = new Transaction(bookList.findBookBody(title), userid);
	    	    this.history.add(t);
	    	    bookList.returnBook(title);
	    	    System.out.println("The book " + title + " returned successfully.\n");
	    	} else if (bookList.comparePhysicalAndAvailableCopies(title) == false){
	    	    System.out.println("The book " + title + " has already returned.\n");
	    	} else {
	    	    System.out.println("The book " + title + " does not exists.\n");
	    	}
		
	}
	
	public void printHistoryTransactions() {
		this.history.print();	
		}
	
	public void printPendingTransactions() {
	    	this.queue.print();
	}
	
	
	public void executePendingTransactions(){
	    Transaction t = this.queue.execute();
	    if (t != null){
		this.history.add(t);
		System.out.println("Transaction completed.\nPending transaction moves to Transactions history");
	    } else {
		System.out.println("Pending transaction not completed");
	    }
	}
	
	public void printQueueSize(){
	    System.out.println(this.queue.getQueueSize());
	}
}
