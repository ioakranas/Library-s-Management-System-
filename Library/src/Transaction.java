import java.util.*;
public class Transaction {

	/* Fields */
	private Book book;
	private Date requestDate;
	private Date servingDate;
	private int userid;
	public static int count = 0;
	private final int counter;
	private Transaction next;
	
	
	/* Overloaded Constructor */
	Transaction(Book book,/* Date requestDate, Date servingDate, */int userid){
		this.book = book;
		//this.requestDate = requestDate;
		//this.servingDate = servingDate;
		this.requestDate = null;
		this.servingDate = null;
		this.userid = userid;
		count+= 1;
		counter = count;
		this.next = null;
	}
	
	/* Setters & Getters */
	public void setBook(Book book){this.book = book;}
	public Book getBook(){return this.book;}
	public void setRequestDate(Date date){this.requestDate = date;}
	public Date getRequestDate(){return this.requestDate;}
	public void setServingDate(Date date){this.servingDate = date;}
	public Date getServingDate(){return this.servingDate;}
	public void setUserid(int id){this.userid = id;}
	public int getUserid(){return this.userid;}
	public void setNext(Transaction t){this.next = t;}
	public Transaction getNext(){return this.next;}
	public int getCounter(){return this.counter;}
	
	
	/* Methods */
	
	@Override
	public String toString(){
		return "The Book " + this.book.getTitle() + " with request date " + this.requestDate +  
				" and serving date " + this.servingDate + " from user " + this.userid;
	}
}
