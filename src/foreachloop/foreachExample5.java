package foreachloop;

import java.util.Arrays;

public class foreachExample5 {

	public static void main(String[] args) {

		Integer[] numbers = { 5, 1, 9, 3, 7, 6, 2, 8, 4 };

		Arrays.sort(numbers);
		// Using foreach loop to print the sorted array
		System.out.println("Sorted in descending order:");

		for (int number : numbers) {

			System.out.println(number);

		}
		
		//forloop code
		
		for (int i = 0; i <= numbers.length - 1; i++) {
			
			Arrays.sort(numbers);
			System.out.println("Sorted in descending order with forloop:" + numbers[i]);
			
		}

	}

}
