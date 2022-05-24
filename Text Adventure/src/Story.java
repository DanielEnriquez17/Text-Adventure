import java.util.Scanner;

public class Story extends User{
	
	Story(){
		
	}
public static void main(String[] args) throws InterruptedException {
	Game game = new Game();
	System.out.print("Hello! - err - uh - ");
	Thread.sleep(2000);
	System.out.println("I may have forgotten your name.");
	Thread.sleep(1000);
	System.out.println("Tell me your name.");
	Scanner input = new Scanner(System.in);
	String name = input.nextLine(); // Getting values for a new User object
	
    
	Thread.sleep(1000);
	System.out.println();
    System.out.println("Hello " + name + "!");
    System.out.println("Now tell me...");
    Thread.sleep(2000);
    System.out.println("What will be your protection spell..?");
    System.out.println("hint: enter your password: ");
    String pass = input.nextLine();
    System.out.println("Your protection spell is: " + pass);
    Thread.sleep(1000);
    System.out.println("Remember to write that down!");
    System.out.println("You dont look familiar... what is you weapon of choice?");
    Thread.sleep(1000);
    System.out.println("");
    
	}
	
}
