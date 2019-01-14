package switchstatement;

public class Apples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		age = 7;
		switch (age) {
		case 1:
			System.out.println("It is a chicken.");
			break;
		case 2:
			System.out.println("It is a rat.");
			break;
		case 3: 
			System.out.println("It is a cat.");
			break;
			default:
				System.out.println("It is dog.");
				break;
		}
	}

}
