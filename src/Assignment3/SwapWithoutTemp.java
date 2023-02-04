package Assignment3;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		
		//Similar to Question 2 on Assignment 3
		
		int x = 10;
        int y = 15;
        
        System.out.println("Before Swapping:");
        System.out.println("");
        System.out.println("x = " + x + " and y = " + y);
        System.out.println("");
        
        x = x + y; //x now becomes 150 (90 + 60)
        
        y = x - y; //y now becomes 90 (150 - 60)
        
        x = x - y; //x now becomes 60 (150 - 90)
        
        System.out.println("After Swapping:");
        System.out.println("");
        System.out.println("x = " + x + " and y = " + y);
        
	}

}
