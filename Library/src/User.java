
public class User {
	
	/* Fields */
	
	private String name;
	private String surname;
	private int age;
	final int id;
	static int cid =0;
	
	
	/* Constructor */
	User(String name, String surname, int age){
		this.name = name;
		this.surname = surname;
		this.age = age;
		cid++;
		id = cid;
	}
	
	
	/* Setters & Getters */
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getSurname() {return surname;}
	public void setSurname(String surname) {this.surname = surname;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	public int getId(){return this.id;}
	
	
	/* Methods */
	
	//@Override
	public String toString(){
		return "Userid: " + this.id + "\nName: " + this.name + "\nSurname: " + this.surname + "\nAge: " + this.age + "\n";
	}
	
	
	
	
	
	
	
	
}
