package practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int count = 0;

		if (num < 2) {
			System.out.println("The given is number " + num + " is not prime");
		} else {

			for (int i = 1; i <= num; i++) {

				if (num % 2 == 0) {
					count++;
				}
			}

			if (count > 2) {
				System.out.println("The given is number " + num + " is not prime");
			} else {
				System.out.println("The given is number " + num + " is prime");
			}
		}

	}

}
