package getinput;
import java.util.Scanner;

public class Apples {
	public static void main (String [] argvs) {
		
	String firstName;
	String lastName;
	Scanner input = new Scanner (System.in);
	System.out.print("Please enter your first name: ");
	firstName = input.nextLine ();
	System.out.print("Please enter your last name: ");
	lastName = input.nextLine();
	System.out.println("\nYour first name is "+firstName +" " +"and your last name is "+lastName +".");
	

}

	}
	
