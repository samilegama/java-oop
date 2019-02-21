import java.util.Scanner;

public class Animals2 {

	public static final double NUMBER = 1.6544;
	
	private String name;
	private int weight;
	private boolean hasOwner = false;
	private byte age;
	private long uniqueId;
	private char speed;
	private float height;
	
	protected static int numberOfAnimals = 0;
	
	static Scanner userInput = new Scanner (System.in);

	public Animals2() {
		numberOfAnimals++;
		
		int sumOfNumbers = 5 + 1;
		System.out.println("5 + 1 = " + sumOfNumbers);
		
		int diffOfNumbers = 5 - 1;
		System.out.println("5 - 1 = " + diffOfNumbers);
		
		int prodOfNumbers = 5 * 1;
		System.out.println("5 * 1 = " + prodOfNumbers);
		
		int divOfNumbers = 5 / 1;
		System.out.println("5 / 1 = " + divOfNumbers);
		
		int modOfNumbers = 5 % 1;
		System.out.println("5 % 1 = " + modOfNumbers);
	
		System.out.println("Enter the name");
	if (userInput.hasNextLine()) {
		this.setName(userInput.nextLine());
	}
	this.setFavoriteColor();
	this.setUniqueID();
	}
	public String getName () {
		return name;
		
	}
	public void setName(String string) {
		this.name = name;
	}
	public static void main(String[] args) {
		Animals2 animal = new Animals2 ();
		
	}
	
}
