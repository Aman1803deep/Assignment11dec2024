package ternaryOperator;

public class TernaryExample5 {
	

	public static void main(String[] args) {
		

      // decide if a number is positive, negative, or zero
        
        int number = 0;
        String message = (number > 0) ? "Positive Number" :
                         (number < 0) ? "Negative Number" : "Zero";
        System.out.println("The number is: " + message);
        
        	}

}
