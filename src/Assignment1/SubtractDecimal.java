package Assignment1;

public class SubtractDecimal {

	public static void main(String[] args) {

		double x;
		double y; 
		double result; 
		
		x = 35.75; 
		y = 75.45; 
		
		//result = x - y;
		
		if (x > y)
			result = x - y;
		else
			result = y - x;
		
		System.out.println("When you subtract the two numbers, the result is: " + result);
		
	}

}
