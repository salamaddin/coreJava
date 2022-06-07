
public class CommandLine {
	public static void main(String args[]) { // This is the entry point
		System.out.println("Program class - Main method");
	}

	public static void main() { // This is not entry point
		System.out.println("Program class - Main() method");
	}

	public void main(String ar) { // This is not entry point

		System.out.println("Program class - String argument-main");
	}
}

class Test {
	public static void main(String[] args) { // This is the entry point
		System.out.println("Test class - Main method");

	}

	public static void main() { // This is not entry point
		System.out.println("Test class-Main() method");

	}

	public void main(String ar) { // This is not entry point

		System.out.println("Test2 class-String argument-main");

	}
}

class Test2 {
	public static void main(String[] args) { // This is the entry point
		System.out.println("Test2 class - Main method");

	}

	public static void main() { // This is not entry point

		System.out.println("Test2 class - Main() method");

	}

	public void main(String ar) { // This is not entry point

		System.out.println("Test2 class-String argument-main");

	}
}