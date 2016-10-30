//import java.util.Date;

public class BookRental extends Transaction{

	/* Constructor */
	BookRental(Book book,/* Date requestDate, Date servingDate,*/int userid){
		super(book,/* requestDate, servingDate, */userid);
	}
	
	
	@Override
	public String toString(){
		return "Book Rental: " + super.getBook().toString();
	}
	
	
	
}

