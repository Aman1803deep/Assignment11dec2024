package foreachloop;

public class foreachExample4 {

	public static void main(String[] args) {

		double[] numbers = { 10.5, 20.75, 30.25, 40.0 };

		double sum = 0;

		// Using foreach loop to calculate the sum
		for (double number : numbers) {
			sum += number;
		}

		System.out.println("Total Sum: " + sum);

		// forloop code

		for (int i = 0; i <= numbers.length - 1; i++) {
			double sum1 = 0;
			sum1 += i;

		}

		System.out.println("Total Sum with forloop: " + sum);
	}
}
