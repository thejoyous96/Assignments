package Assignment2;

public class DisplayMonths {

	public static void main(String[] args) {
		
		//Display January for 1, February for 2, March for 3, April for 4, May for 5, and Summer for any other numbers
		
		int month = 1;
	
		switch (month) {
		case 1: 
			System.out.println("January");
			break;
		case 2: 
			System.out.println("February");
			break;
		case 3: 
			System.out.println("March");
			break;
		case 4: 
			System.out.println("April");
			break;
		case 5: 
			System.out.println("May");
			break;
		default:
			System.out.println("Summer");	
			
		}
	}

}


