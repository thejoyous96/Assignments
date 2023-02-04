package Assignment2;

public class CompareTwoValues {

	public static void main(String[] args) {
		int x = 45; 
		int y = 15; 
		
		//Initial Values (x = 25, y = 35)
		//Test for values (x = 45, y = 15) and (x = 75, y = 75)

		if (x > y)
			System.out.println("X is Bigger.");
		else if (x < y)
			System.out.println("Y is Bigger.");
		else if (x == y)
			System.out.println("Both are Same.");
		else 
			System.out.println("Error.");
		
	}

}
