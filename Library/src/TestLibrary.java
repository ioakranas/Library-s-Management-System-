/**
 * 
 * @author Ioannis Kranas
 *
 */

import java.util.*;


public class TestLibrary {
	
	private static Scanner scan1;
	private static Scanner scan2;
	private static Scanner scan3;
	
	public static void main(String args[]){
		
		User giannis = new User("Giannis", "Kranas", 31);
		User marielena = new User("Marielena", "Rossetou", 27);
		User pavlos = new User("Pavlos", "Kranas", 33);
		User apostolis = new User("Apostolis", "Xatzignatiou", 32);
		User alexis = new User("Alexis", "Lambrinakos", 30);
		User petros = new User("Petros", "Petrou", 22);
		User ritsa = new User("Ritsa", "Staikou", 28);
		User alexia = new User("Alexia", "Psyllaki", 28);
		User dimitris = new User("Dimitris", "Kranas", 61);
		User maria = new User("Maria", "Ioannou", 60);
		
		/** Create Random authors */	
		Author ruth = new Author("Ruth");
		Author diane = new Author("Diane");
		Author jacqueline = new Author("Jacqueline");
		Author rachel = new Author("Rachel");
		Author joan = new Author("Joan");
		Author theresa = new Author("Theresa");
		Author angela = new Author("Angela");
		Author helen = new Author("Helen");
		Author lisa = new Author("Lisa");
	
		
		/** Create Random books from the above authors */
		Book book1 = new Book("Book1",ruth,"368777540-2",10,10,20);
		Book book2 = new Book("Book2",diane,"963099898-2",10,1,22);
		Book book3 = new Book("Book3",jacqueline,"005382097-2",10,0,23);
		Book book4 = new Book("Book4",rachel,"538310208-2",10,3,24);
		Book book5 = new Book("Book5",joan,"562448132-2",10,4,26);
		Book book6 = new Book("Book6",theresa,"670364563-2",10,2,21);
		Book book7 = new Book("Book7",angela,"466916869-2",10,5,17);
		Book book8 = new Book("Book8",helen,"764674973-2",10,0,15);
		Book book9 = new Book("Book9",lisa,"052469721-2",10,6,17);
		Book book10 = new Book("Book10",ruth,"609291817-2",10,3,13);
		Book book11 = new Book("Book11",diane,"451378028-2",10,8,12);
		Book book12 = new Book("Book12",jacqueline,"142352773-2",10,6,20);
		Book book13 = new Book("Book13",rachel,"115135166-2",10,0,20);
		Book book14 = new Book("Book14",joan,"631942468-2",10,3,20);
		Book book15 = new Book("Book15",theresa,"323662444-2",10,0,23);
		Book book16 = new Book("Book16",angela,"121360492-2",10,0,12);
		Book book17 = new Book("Book17",helen,"391199302-2",10,0,20);
		Book book18 = new Book("Book18",ruth,"549307784-2",10,1,20);
		Book book19 = new Book("Book19",ruth,"368777230-2",10,23,20);
		Book book20 = new Book("Book20",ruth,"793027213-2",10,0,20);
		
		
		BookReturn trans1 = new BookReturn(book1, 1);
		BookReturn trans2 = new BookReturn(book19, 2);
		BookRental trans3 = new BookRental(book19, 3);
		BookRental trans4 = new BookRental(book12, 1);
		BookRental trans5 = new BookRental(book12, 7);
		BookRental trans6 = new BookRental(book12, 6);
		BookRental trans7 = new BookRental(book18, 2);
		BookRental trans8 = new BookRental(book20, 2);
		BookRental trans9 = new BookRental(book8, 1);
		BookRental trans10 = new BookRental(book19, 9);
		
		
		Author[] authors = {ruth, diane, jacqueline, rachel, joan, theresa, angela, helen, helen};
		
		User[] users = {giannis, marielena, pavlos, apostolis, alexis, petros, ritsa, alexia, dimitris, maria};
		
		Book[] books = {book1,book2,book3,book4,book5,book6,book7,
				book8,book9,book10,book11,book12,book13,book14,book15,
				book16,book17,book18,book19,book20};
		
		Transaction[] historyTransactions = {/*trans1, trans2*/};
		Transaction[] pendingTransactions = {trans3, trans4, /*trans5, trans6, trans7, trans8, trans9, trans10*/};
		
		TransactionHistory history = new TransactionHistory(historyTransactions);
		TransactionQueue pending = new TransactionQueue(pendingTransactions);
		AuthorList authorsList = new AuthorList(authors);
		UserList usersList = new UserList(users);
		BookList bookList = new BookList(books);
		Library library = new Library(authorsList, bookList, usersList, history, pending);
		Librarian dcavajo = new Librarian(library);
		
//		dcavajo.printLibrarysHistoryTransactions();
//		dcavajo.printLibrarysPendingTransactions();
//		dcavajo.executeLibrarysPendingTransactions();
//		dcavajo.printLibrarysHistoryTransactions();
//		dcavajo.printLibrarysPendingTransactions();
//		dcavajo.executeLibrarysPendingTransactions();
//		dcavajo.printLibrarysHistoryTransactions();
//		dcavajo.printLibrarysPendingTransactions();
//		dcavajo.executeLibrarysPendingTransactions();
//		dcavajo.printLibrarysHistoryTransactions();
//		dcavajo.printLibrarysPendingTransactions();
		
		int input = 0;
		int tempUserid = 0;
		int tempPhysical = 0;
		int tempAvailable = 0;
		String tempName;
		String tempName2;
		String tempName3;
		
		scan1 = new Scanner (System.in);
		scan2 = new Scanner (System.in);
		scan3 = new Scanner (System.in);
		
		do{
		    System.out.println("**********************************");
		    System.out.println("*Welcome to the Bootcamp library.*");
		    System.out.println("**********************************");
		    System.out.println("* Please enter Userid / Adminid  *\n* press '0' if you want to exit. *");
		    System.out.println("**********************************");
		    tempUserid = scan1.nextInt();
		
		    while ((usersList.userExists(tempUserid) == false) && (tempUserid != 1234) && (tempUserid != 0)){
			System.out.println("Wrong user id. \nPlease try again.");
			tempUserid = scan1.nextInt();
		    }
		
		    if (tempUserid == 1234){
			while (tempUserid == 1234){
			    System.out.println("****************************************");
			    System.out.println("*          WELCOME ADMIN               *");
			    System.out.println("****************************************");
			    System.out.println("* 1. Add new Book.                     *");
			    System.out.println("* 2. Print all Books.                  *");
			    System.out.println("* 3. Print all History Transactions.   *");
			    System.out.println("* 4. Print all Pending Transactions.   *");
			    System.out.println("* 5. Execute all Pending Transactions. *");
			    System.out.println("* 6. Exit                              *");
			    System.out.println("****************************************");
			    input = scan2.nextInt();
			    if ( input == 1) {
				System.out.println("Give the title of the book.");
				tempName = scan3.nextLine();
				System.out.println("Give the name of the author of the book.");
				tempName2 = scan1.nextLine();
				Author tempAuthor = new Author(tempName2);
				System.out.println("Give the number of the isbn of the book.");
				tempName3 = scan3.nextLine();
				System.out.println("Give the number of the physical copies of the book.");
				tempPhysical = scan2.nextInt();
				System.out.println("Give the number of the available copies of the book.");
				tempAvailable = scan3.nextInt();
				dcavajo.addNewBook(tempName, tempAuthor, tempName3, tempPhysical, tempAvailable, 0);
			    } else if (input == 2) {
				dcavajo.print();
			    } else if (input == 3) {
				dcavajo.printLibrarysHistoryTransactions();
			    } else if (input == 4) {
				dcavajo.printLibrarysPendingTransactions();
			    } else if (input == 5) {
				dcavajo.executeLibrarysPendingTransactions();
			    } else if (input == 6) {
				break;
			    }  else {
				System.out.println("Wrong input.\nPlease try again");
			    }
			}
		    } else if (usersList.userExists(tempUserid) == true){
				do{
				    System.out.println("*******************************************");
				    System.out.println("*            WELCOME USER " + tempUserid +  "               *");
				    System.out.println("*******************************************");
				    System.out.println("* 1. Show all books                       *");
				    System.out.println("* 2. Show all available books             *");       
				    System.out.println("* 3. Search for book (by book title)      *");
				    System.out.println("* 4. Display books from a specific author *");
				    System.out.println("* 5. Rent a book                          *");
				    System.out.println("* 6. Return a book                        *");
				    System.out.println("* 7. Quit                                 *"); 
				    System.out.println("*******************************************");
				    input = scan2.nextInt();
				    if (input == 1){
					library.print();
				    } else if (input == 2){
					library.printAvailableBooks();
				    } else if (input == 3){
					tempName = scan3.nextLine();
					library.printBookDetails(tempName);
				    } else if (input == 4){
					tempName = scan3.nextLine();
					library.printBookFromAuthor(tempName);
				    } else if (input == 5){
					System.out.println("Type the title of the book");
					tempName = scan3.nextLine();
					library.rentBook(tempName, tempUserid);
				    } else if (input ==6){
					System.out.println("Type the title of the book");
					tempName = scan3.nextLine();
					library.returnBook(tempName, tempUserid);
				    } else if (input == 7){
					break;
				    } else {
					System.out.println("Wrong input please try again.\n");
				    }
				} while (input != 7);
		    } else {
			break;
		    }
		} while (input != 999);	
		
	}
	

}