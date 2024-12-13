package ternaryOperator;

import java.util.Scanner;

public class Ternaryexample1 {

	public static void main(String[] args) {
		
		// Find Day of the Week Based on a Number
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number (1-7) to find the day of the week: ");
	        int dayNumber = scanner.nextInt();
	        String day = (dayNumber == 1) ? "Monday" :
	                     (dayNumber == 2) ? "Tuesday" :
	                     (dayNumber == 3) ? "Wednesday" :
	                     (dayNumber == 4) ? "Thursday" :
	                     (dayNumber == 5) ? "Friday" :
	                     (dayNumber == 6) ? "Saturday" : "Sunday";
	    
	        System.out.println("Today is: " + day); 
	      
	        
	     
	        scanner.close();
	}

}
