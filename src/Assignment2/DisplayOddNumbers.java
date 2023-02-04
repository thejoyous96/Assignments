package Assignment2;

public class DisplayOddNumbers {

	public static void main(String[] args) {
		
		//Odd Numbers between 1 to 20
		
		int value = 20; 
		
		System.out.print("List of Odd numbers from 1 to " + value + ": ");
		for (int i = 1; i < value; i = i + 1) {
			
			//or use i++
			
			if (i % 2 != 0) {
				System.out.print(i + " ");	
				
			}
		}
	}
}
