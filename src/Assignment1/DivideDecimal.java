package Assignment1;

public class DivideDecimal {

	public static void main(String[] args) {

		double x;
		double y; 
		double result;
		
		x = 100.90;
		y = 25.10;
		
		//result = x / y
		
		if (x > y)
			result = x / y;
		else
			result = y / x;
		
		System.out.println("After dividing the two numbers, the result is: " + result);		
	}

}
