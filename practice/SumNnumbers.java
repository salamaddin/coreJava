package practice;

import java.util.Scanner;

public class SumNnumbers {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("enter a number: ");
		int num = in.nextInt();
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);

		// using recursion

		int res = getSum(num);
		System.out.println(res);

	}

	static int getSum(int n) {

		if (n == 0) {
			return 0;
		} else {

			// System.out.println(n);
			return getSum(n - 1) + n;
		}

	}

}
