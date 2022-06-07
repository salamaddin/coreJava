package practice;

public class NumPositiveNegative {

	public static void main(String[] args) {
		int num = 10;

		if (num > 0) {
			System.out.println("Positive");
		} else if (num < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Zero");
		}

		// uses a ternary operator

		if (num == 0) {
			System.out.println("Zero");
		} else {

			String result = num > 0 ? "The number is positive" : " The number is negative";
			System.out.print(result);
		}
	}

}
