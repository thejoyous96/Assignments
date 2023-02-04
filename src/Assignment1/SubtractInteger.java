package Assignment1;

public class SubtractInteger {

	public static void main(String[] args) {
		
		int x;
		int y; 
		int result; 
		
		x = 35; 
		y = 75; 
		
		//result = x - y;
		
		if (x > y)
			result = x - y;
		else
			result = y - x;
		
		System.out.println("The result when subtracting the two number is: " + result);
		
	}

}
