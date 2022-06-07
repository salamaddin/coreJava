package exceptionHandle;

class Main {
	public static void main(String[] args) {
	 	try {
			
			// code that generates exception
			int divideByZero = 5 / 0;
			
			System.out.println("Rest of code in try block");
			return;
			//System.out.println("Rest of code in try block");
		}
	 	catch (ArithmeticException e) {
			System.out.println("ArithmeticException => " + e.getMessage());
			//System.exit(0); //if use use this then immediately terminate won't execute finally block
			//return;
		}
		//System.out.println("task compeleted");
		
//		try {
//			// code that generates exception
//			// int divideByZero = 5 / 0;
//			System.out.println("Rest of code in try block");
//		}
//
//		catch (ArithmeticException e) {
//			System.out.println("ArithmeticException => " + e.getMessage());
//		}
//
//		finally {
//			System.out.println("This is the finally block");
//			
//		}
		System.out.println("task compeleted");
	}
}