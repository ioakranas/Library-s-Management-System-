import java.util.ArrayList;

public class UserList {
	
	/* Fields */
	private ArrayList<User> usersList;
	
	
	/* Constructor */
	UserList(User[] usersArray){
		this.usersList = new ArrayList<>();
		for (User u: usersArray){
			this.usersList.add(u);
		}
	}
	
	/* Getters & Seters */
	public ArrayList<User> getUsersList(){return this.usersList;}
	
	/* Methods */
	public void addUser(User user){this.usersList.add(user);}
	
	public void removeUser(int id){
		int temp = 0;
		int temp1 =0;
		for (int i=0;i<this.usersList.size();i++){
			if (id == this.usersList.get(i).getId()){
				this.usersList.remove(i);
				temp = 1;
				temp1 = i;
			}
		}
		if (temp == 1){
			System.out.println("The user " + this.usersList.get(temp1).getName() + "with id: " + id + " removed.");
		}
		else{
			System.out.println("The user " + this.usersList.get(temp1).getName() + "with id: " + id + " does not exists.");		
			}
	}
	
	public User getUser(int id){
		for (User u:this.usersList){
			if (id == u.getId()){
				return u;
			}
		}
		System.out.println("User with id " + id + "not found");
		return null;
	}
	
	public int getLenght(){
		return usersList.size();
	}
	
	public void print(){
		for (int i=0;i<this.usersList.size();i++){
		System.out.println(this.usersList.get(i).toString());
		}
	}
	
	public boolean userExists(int input){
	    //return true;
	    for (int i=0;i<usersList.size();i++){
		if (usersList.get(i).getId() == input){
		    return true;
		}
	    }
	    return false;
	}

}
