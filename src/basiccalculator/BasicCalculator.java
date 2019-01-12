package basiccalculator;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		Scanner bucky = new Scanner (System.in);
		double fnum, snum, answer;
		System.out.println ("Enter first num: ");
		fnum = bucky.nextDouble ();
		
		System.out.println ("Enter second num: ");
		snum = bucky.nextDouble ();
		
		System.out.println ("Enter the opration(+ - * /): ");
		char op = bucky.next ().toCharArray()[0];
		switch(op) {
		case '+':
			System.out.println("Answer: " +(fnum+snum));
			break;
		case '-':
			System.out.println("Answer: " +(fnum-snum));
			break;
		case '*':
			System.out.println("Answer: " +(fnum*snum));
			break;
		case '/':
			System.out.println("Answer: " +(fnum/snum));
			break;
		}
		
	}

}
