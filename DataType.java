
public class DataType {

	public static void main(String[] args) {

		float f = 10.0F;
		int i = (int)f;
		
		String str = "50";
		int n = Integer.valueOf(str); // coverted String to int
		
		int num = 20;
		String s = String.valueOf(num); // converted int to String
		
		long phoneNumber = 8159925643L; 
		
		System.out.println(phoneNumber);
		System.out.println(f);
		System.out.println(i);
		System.out.println(s);

	}

}
