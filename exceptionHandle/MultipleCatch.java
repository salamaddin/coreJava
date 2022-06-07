package exceptionHandle;

public class MultipleCatch {

	public static void main(String[] args) {

		try {
			int a[] = new int[5];
			// a[0] = a[6]; //ArrayIndexOutOfBounds Exception occurs
			// a[5]=30/0; //Arithmetic Exception occurs
			String s = null;
			System.out.println(s.length()); //null pointer exception
			
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
			
		} catch (NullPointerException e) {
			System.out.println("NullPointer Exception occurs");
			
		} catch (Exception e) {
			System.out.println("Parent Exception occurs" + e);
		}
		System.out.println("rest of the code");
	}
}