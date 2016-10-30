import java.util.ArrayList;

public class AuthorList {

	/* Fields */
	private ArrayList<Author> authorsList;
	
	
	/* Constructor */
	AuthorList(Author[] authorsArray){
		this.authorsList = new ArrayList<>();
		for (Author a: authorsArray){
			this.authorsList.add(a);
		}
	}
	
	
	/* Setters & Getters */
	public ArrayList<Author> getAuthorList(){return this.authorsList;}
	
	/* Methods */
	public void addAuthor(Author author){this.authorsList.add(author);}
	//public void removeAuthor(Author author){this.authorsList.remove(author);}
	
	
	public void removeAuthor(String name){
		for (int i=0;i<this.authorsList.size();i++){
			if (this.authorsList.get(i).getName().equals(name)){
				this.authorsList.remove(i);
			}	
		}
	}
	
	/* This method return object Author fron Author's name */
	public Author getAuthor(String name){
		for (Author a:this.authorsList){
			if (name.equals(a.getName())){
				return a;
			}
		}
		System.out.println("Author"+name+"not found");
		return null;
	}
	
	public int getNumbersOfAuthors(){
		return this.authorsList.size();
	}

}
