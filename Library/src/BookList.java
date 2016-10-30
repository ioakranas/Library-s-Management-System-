//import java.util.ArrayList;

public class BookList {

    /* Fields */
    private Book first;

    /* Constructor */
    BookList(Book[] bookarray) {
	this.first = null;
	for (Book b : bookarray)
	    this.add(b);
    }

    /* Methods */
    public void add(Book b) {
	if (this.first == null) {
	    //System.out.println("Adding first book " + b.getTitle());
	    this.first = b;
	} else {
	    Book currentBook = first;
	    while (currentBook.getNext() != null) {
		currentBook = currentBook.getNext();
	    }
	    currentBook.setNext(b);
	   // System.out.println("Adding book " + b.getTitle());
	}
    }

    public void remove(Book b) {
	Book currentBook = first;
	if (this.first == null) {
	    System.out.println("Empty BookList");
	    return;
	} else if (currentBook.getNext() == null) {
	    first = null;
	    System.out.println("Removing book. " + b.getTitle());
	} else {
	    if (currentBook.equals(b)) {
		first = first.getNext();
		System.out.println("Removing book. " + b.getTitle());
		return;
	    }
	    while (!currentBook.getNext().equals(b)) {
		currentBook = currentBook.getNext();
		if (currentBook == null) {
		    System.out.println("Book:" + b.getTitle() + " not found.");
		}
	    }
	    currentBook.setNext(b.getNext());
	    System.out.println("Removing book. " + b.getTitle());
	}
    }

    public void print() {
	if (this.first == null) {
	    System.out.println("Empty BookList");
	    return;
	}
	Book b = this.first;
	do {
	    System.out.println(b.toString());
	    b = b.getNext();
	} while (b != null);
    }

    public void printAvailableBooks() {
	int counter = 0;
	if (this.first == null) {
	    System.out.println("Empty BookList.");
	    return;
	}
	Book b = this.first;
	while (b != null) {
	    if (b.isAvailable() == true) {
		System.out.println(b.toString());
		counter++;
	    }
	    b = b.getNext();
	}
	System.out.println("The Library has " + counter + " available books.");

    }

    public void printBookDetails(String input) {
	int temp = 0;
	if (this.first == null) {
	    System.out.println("Empty BookList.");
	    return;
	}
	Book b = this.first;
	while (b != null) {
	    if (b.getTitle().equals(input)) {
		System.out.println(b.toString());
		temp = 1;
	    }
	    b = b.getNext();
	}
	if (temp == 0) {
	    System.out.println("No Book found with title name, " + input + ".");
	}
    }

    public void printBookFromAuthor(String input) {
	int temp = 0;
	if (this.first == null) {
	    System.out.println("Empty BookList.");
	    return;
	}
	Book b = this.first;
	while (b != null) {
	    if (b.getAuthor().getName().equals(input)) {
		System.out.println(b.toString());
		temp = 1;
	    }
	    b = b.getNext();
	}
	if (temp == 0) {
	    System.out.println("No Book found with author name, " + input + ".");
	}

    }
    
    
    
    /* Method for bringing back Object Book from String "BookTitle" */
    
    public Book findBookBody(String name) {
	Book b = this.first;
	if (this.first == null) {
	    System.out.println("Empty BookList.");
	    return null;
	}
	while (b != null) {
	    if (b.getTitle().equals(name)) {
		return b;
	    }
	    b = b.getNext();
	}
	return null;
    }
    
    
    

    public String findBookName(String name) {
	Book b = this.first;
	if (this.first == null) {
	    System.out.println("Empty BookList.");
	    return null;
	}
	while (b != null) {
	    if (b.getTitle().equals(name)) {
		return b.getTitle();
	    }
	    b = b.getNext();
	}
	return null;
    }
    
    public boolean isBookAvailable(String input){
	Book b = this.first;
	if (this.first == null) {
	    return false;
	}
	while (b != null) {
	    if (b.getTitle().equals(input)) {
		if (b.getAvailable_copies() > 0) {
		    return true;
		} 
	    }
	    b = b.getNext();
	}
	return false;
    
    }
    
    
    /* Method that manage Times Rent - Available copies */

    public void rentBook(String input) {
	Book b = this.first;
	if (this.first == null) {
	    return;
	}
	while (b != null) {
	    if (b.getTitle().equals(input)) {
		if (b.getAvailable_copies() > 0) {
		    b.setTimes_rent(b.getTimes_rent() + 1);
		    b.setAvailable_copies(b.getAvailable_copies() - 1);
		} 
	    }
	    b = b.getNext();
	}
    }

    public void returnBook(String input) {
	Book b = this.first;
	if (this.first == null) {
	    System.out.println("Empty BookList.");
	    return;
	}
	while (b != null) {
	    if (b.getTitle().equals(input)) {
		b.setAvailable_copies(b.getAvailable_copies() + 1);
	    }
	    b = b.getNext();
	}
    }
    
    /* Method for checking if Physical == Available */
    public boolean comparePhysicalAndAvailableCopies(String input){
	Book b = this.first;
	if (this.first == null) {
	    return false;
	}
	while (b != null) {
	    if (b.getTitle().equals(input)) {
		if (b.getAvailable_copies() == b.getPsysical_copies()){
		    return false;
		} else {
		    return true;
		}
	    }
	    b = b.getNext();
	}
	return false;
    }
    
    
    public boolean bookExists(String input){
	Book b = this.first;
	if (this.first == null) {
	    return false;
	}
	while (b != null) {
	    if (b.getTitle().equals(input)) {
		return true;
	    }
	    b = b.getNext();
	}
	    return false;
    }

}


