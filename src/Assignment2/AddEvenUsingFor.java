package Assignment2;

public class AddEvenUsingFor {

	public static void main(String[] args) {
		
		//Sum of Even Numbers between 1 to 20

		int sum = 0;
					
		for (int i = 1; i <= 20; i = i + 1) {
						
			//or use i++
						
			if (i % 2 == 0) {
			sum += i;
			
			System.out.print(i + " ");

			}			
		}
		
	System.out.println("");
	System.out.println("Sum of the Even Numbers from 1 to 20: " + sum);	

	}
}
