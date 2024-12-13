package ternaryOperator;

public class ternaryExample2 {

	public static void main(String[] args) {
      // Check If a Year is a Leap Year
        
        int year = 2024;
        String isitleapyear = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? "Leap Year" : "Not a Leap Year";
        
        System.out.println("This is year" + " is " + isitleapyear);  

	}    
}
