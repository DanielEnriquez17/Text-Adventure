import java.util.ArrayList;

public class Game {
// Instance Data
	//ArrayList of User Objects
	private ArrayList<User> People = new ArrayList<User>();

public Game() {
	
	}


public void deleteUser(String Name, String pass) {
	
	for(int i = 0; i < People.size(); i++) {
		if(People.get(i).getName().equals(Name) && People.get(i).getPass().equals(pass)) {
		People.remove(i);
			}
		}
	}
public void printUsers() {
	for(User str:People) {
		System.out.println("Name: " + str.getName() + "\nClass: " + str.getType() + "\n");
		}
	}
public void addUser(User usr) {
	People.add(usr);
	}
public ArrayList<User> getUsers() {
	return People;
	}

}
