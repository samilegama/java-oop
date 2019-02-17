import java.util.Scanner;

public class BasicCalculation {

	public static void main(String[] args) {
		int num1;
		int num2;
		int sum;
		int product;
		float division;
		float modular;
		
		Scanner scan;
	
		
	Scanner input = new Scanner (System.in);
	System.out.println("Enter the first number: ");
	num1 = input.nextInt (); 
	System.out.println("Enter the second number: ");
	num2 = input.nextInt ();
	
	System.out.println();
	
		sum = num1 + num2;
	System.out.println("The sum is " +sum);

product = num1*num2;
System.out.println("The product is " +product);

division = num1/num2;
System.out.println("The divion is " +division);

modular = (num1%num2);
System.out.println("The modulation is " +modular);
	}

}
