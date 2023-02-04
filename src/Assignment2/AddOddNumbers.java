package Assignment2;

public class AddOddNumbers {

	public static void main(String[] args) {
	
		//Sum of Odd Numbers between 50 to 70

		int sum = 0;
							
		for (int i = 50; i <= 70; i = i + 1) {
								
			//or use i++
								
			if (i % 2 != 0) {
			sum += i; 
					
			System.out.print(i + " ");

			}			
		}
		
	System.out.println("");
	System.out.println("Sum of the Odd Numbers from 50 to 70: " + sum);	

	}
}