
public class Book {
	
	/* Fields */
	private String title;
	private Author author;
	private String isbn;
	private int physical_copies;
	private int available_copies;
	private int times_rent;
	private Book next;
	
	
	
	/* Constructor */
	Book(String title, Author author, String isbn, int physical_copies, int available_copies, int times_rent){
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.physical_copies = physical_copies;
		this.available_copies = available_copies;
		this.times_rent = times_rent;
		this.next = null;
	}
	
	
	/* Setters and Getters */
	public void setNext(Book b){this.next=b;}
	public Book getNext(){return this.next;}
	public String getTitle(){return this.title;}
	public void setTitle(String title){this.title = title;}
	public Author getAuthor(){return this.author;}
	public void setAuthor(Author author){this.author = author;}
	public String getIsbn(){return this.isbn;}
	public void setIsbn(String isbn){this.isbn = isbn;}
	public int getPsysical_copies(){return this.physical_copies;}
	public void setPsysical_copies(int psysical_copies){this.physical_copies = psysical_copies;}
	public int getAvailable_copies(){return this.available_copies;}
	public void setAvailable_copies(int available_copies){this.available_copies = available_copies;}
	public int getTimes_rent(){return this.times_rent;}
	public void setTimes_rent(int times_rent){this.times_rent = times_rent;}
	
	
	/* Methods */
	
	@Override
	public String toString(){
	return "Title of book: " + this.title + "\nAuthor's name: " + author.getName()
		+ " \nIsbn: " + this.isbn + "\nPsysical copies: " + this.physical_copies + 
		"\nAvailable copies: " + this.available_copies + "\nTimes Rend: " + this.times_rent + "\n";
	}
	
	public void rentPhysicalCopy(){
		if (this.available_copies > 0){
			System.out.println("There is an available copy to rent.");
			this.times_rent++;
			this.available_copies--;
		}
	}
	
	public boolean isAvailable(){
		if (this.available_copies > 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean hasAuthor(String input_name){
		if (input_name.equals(author.getName())){
		return true;
		}
		else{
			return false;
		}
	}
}
