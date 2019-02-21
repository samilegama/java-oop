package arrayList;

public class MyArray {

	public static void main(String[] args) {
		int [] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		
		int index = 0;
		for (index = 0; index < 5; index++) {
			System.out.println("Index "+index +" "+"is " +myArray [index]);
		}
		for (index = 9; index >=5; index--){
		System.out.println("Index "+index +" "+"is " +myArray [index]);
		
		}
	}

}
