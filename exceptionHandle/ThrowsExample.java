package exceptionHandle;

import java.io.*;

public class ThrowsExample {
	// defining a method
	public void checkNum(int num) throws ArithmeticException {
		if (num < 1) {
			throw new ArithmeticException("\nNumber is negative, cannot calculate square");
		} else {
			System.out.println("Square of " + num + " is " + (num * num));
		}
	}

	// main method
	public static void main(String[] args) {
		ThrowsExample obj = new ThrowsExample();
		try {
			obj.checkNum(-3);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

		
		System.out.println("Rest of the code..");
	}
}