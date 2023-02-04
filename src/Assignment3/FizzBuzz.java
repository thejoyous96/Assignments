package Assignment3;

public class FizzBuzz {

	public static void main(String[] args) {
		int x = 9; 
		
		//Initial Value is 9 
		//Test for values 11, 15, 19, 203 and 55
		
		if (((x % 3) == 0) && ((x % 5) == 0))
			System.out.println("FizzBuzz");
		
		else if (x % 3 == 0)
			System.out.println("Fizz");
		
		else if (x % 5 == 0)
			System.out.println("Buzz");
		
		else 
			System.out.println("The Number " + x + " is not divisble by 3 and 5.");

	}

}
