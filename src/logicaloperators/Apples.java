package logicaloperators;

public class Apples {

	public static void main(String[] args) {
		
		int boy, girl;
		boy = 18;
		girl = 50;
		
		if (boy > 10 && girl > 60) {
			System.out.println("Both the boy and the girl are allowed to enter.");
		}
			if (boy > 10 && girl > 60) {
			System.out.println("Only the boy can enter.");
			if (boy < 10 && girl < 60) {
				System.out.println("Only the girl is allowed to enter.");
			}
		}
		else
		{
			System.out.println("Both the boy and the girl are not allowed to enter.");
		}

	}

}
