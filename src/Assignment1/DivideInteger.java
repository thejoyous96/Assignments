package Assignment1;

public class DivideInteger {

	public static void main(String[] args) {

		int x;
		int y; 
		int result; 
		
		x = 25; 
		y = 100; 
		
		//result = x / y;
		
		if (x > y)
			result = x / y;
		else
			result = y / x;
		
		System.out.println("After dividing the two numbers, the result is: " + result);
		
	}

}
