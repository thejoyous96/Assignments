package Assignment2;

public class SwapValues {

	public static void main(String[] args) {

		int x = 25; 
		int y = 35; 
		
		//Initial Values (x = 25) and (y = 35)
		
		System.out.println("Before Swap: x = " + x + " and y = " + y);
		
		int temp = x; 
		
		x = y; 
		y = temp; 
		
		System.out.println("After Swap: x = " + x + " and y = " + y);

	}

}
