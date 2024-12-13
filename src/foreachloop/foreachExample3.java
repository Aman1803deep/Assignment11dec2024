package foreachloop;

public class foreachExample3 {

	public static void main(String[] args) {
		
		int[] numbers = {5, 10, 15, 20, 25};

        // Using foreach loop to print the binary representation of each number
        for (int number : numbers) {
            String binary = Integer.toBinaryString(number);
            System.out.println("Decimal: " + number + " -> Binary: " + binary);
        }
        
        //forloop code
        for(int i=0; i<=numbers.length-1;i++)
        {
        	String binary = Integer.toBinaryString(i);
            System.out.println("With forloop"+"Decimal: " + i + " -> Binary: " + binary);
        }
        	

	}

}
