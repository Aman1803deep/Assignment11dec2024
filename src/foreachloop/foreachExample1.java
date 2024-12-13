package foreachloop;

public class foreachExample1 {

	public static void main(String[] args) {

		int[] numbers = { 3, 7, 1, 9, 4, 2 };

		// Initializing max and min values
		int max = Integer.MIN_VALUE; // -2147483648
		int min = Integer.MAX_VALUE; // 2147483647

		// Using foreach loop to find max and min
		for (int number : numbers) {
			if (number > max)
				max = number;
			if (number < min)
				min = number;
		}

		System.out.println("Max: " + max);
		System.out.println("Min: " + min);

		// forloop code

		for (int i = 0; i < +numbers.length; i++) {

			if (numbers[i] > max) {
				max = numbers[i];
			}

			if (numbers[i] < min) {
				min = numbers[i];

			}

		}

		System.out.println("With forloop the Max: " + max);
		System.out.println("With forloop the Min: " + min);
	}

}
