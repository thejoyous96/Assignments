package Assignment3;

public class FindFactorials {

	public static void main(String[] args) {

		//Initial value is 5
		//Test for values 5, 9, 10, 26
		
		double i; 
		double first = 1; //starting from 1 
		double factor = 10; //the number to find the factorial 
		
		for (i = 1; i <= factor; i++) {
			first = first * i;
		}
		System.out.println("The Factorial of " + factor + ": " + first);
		
	}

}
