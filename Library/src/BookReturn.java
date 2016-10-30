//import java.util.Date;

public class BookReturn extends Transaction{
	
	/* Constructor */
	BookReturn(Book book,/* Date requestDate, Date servingDate,*/ int userid){
		super(book,/* requestDate, servingDate, */userid);
	}

	
	@Override
		public String toString(){
			return "Book Return: " + super.getBook().toString();
		}

}
