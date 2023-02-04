package Assignment3;

public class SwapValues {

	public static void main(String[] args) {
		
		int x = 90;
        int y = 60;
        
        System.out.println("Before Swapping: x = " + x + " and y = " + y);
        System.out.println("");
        
        x = x + y; //x now becomes 150 (90 + 60)
        
        y = x - y; //y now becomes 90 (150 - 60)
        
        x = x - y; //x now becomes 60 (150 - 90)
        
        System.out.println("After Swapping: x = " + x + " and y = " + y);
        
	}

}
