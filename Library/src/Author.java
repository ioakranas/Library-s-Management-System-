
public class Author {
	
	/* Fields */
	private String name;
	
	
	/* Constructor */
	Author(String name){
		this.name = name;
	}
	
	/* Getters and Setters */
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	/* Methods */
	@Override
	public String toString(){
		return "The name of the author is "+this.name+"\n";
	}
	
}

