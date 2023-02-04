package Assignment2;

public class DisplayEvenNumbers {

	public static void main(String[] args) {
			
		//Even Numbers between 100 to 125
			
		int value = 125; 
			
		System.out.print("List of Even numbers from 1 to " + value + ": ");
		for (int i = 100; i < value; i = i + 1) {
				
			//or use i++
				
			if (i % 2 == 0) {
			System.out.print(i + " ");
			
			}
		}
	}
}
