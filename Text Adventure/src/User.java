
public class User extends Game{
private String name;
private String password;
private String Type;
private int hp = 5;
private int level = 1;

public User(String Name, String Password, String type) {
	name = Name;
	password = Password;
	Type = type;
	}
public String getName() {
	return name;
	}
public String getPass() {
	return password;
	}
public String getType() {
	return Type;
	}
public int getHp() {
	return hp;
	}
public String fetchData() {
	String str ="";
	return str;
	}
}
