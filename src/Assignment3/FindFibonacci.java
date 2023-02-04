package Assignment3;

public class FindFibonacci {

	public static void main(String[] args) {

		int end = 5; //The given last number of the Series
		int firstvalue = 0;
		int secondvalue = 1; //The second value 1 is added to first value 
							 //which is 1 as the first number in the series
		
		System.out.println("The First 10 Numbers of the Fibonacci Series: "); 
		
		for (int i = 1; i <= end; i++) {
			System.out.print(firstvalue + " ");
			
			int nextTerm = firstvalue + secondvalue; 
			firstvalue = secondvalue; 
			secondvalue = nextTerm; 
			
			//Need Help
			
		}
	}

}
