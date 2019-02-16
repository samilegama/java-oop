package getinput;
import java.util.Scanner;

public class Apples {

	public static void main(String[] args) {
		String firstName ;
		String lastName ;
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter first name: ");
		firstName=input.nextLine();
		System.out.println("Please enter last name: ");
		lastName=input.nextLine();
		
		System.out.println("My name is: " +firstName +" "+lastName +".");
	}

}
