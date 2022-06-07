
class Adder{
	final static int add(int a, int b) {
		return a+b;
	}
	static int add(int a, int b, int c) {
		return a+b+c;
	}
	static float add(float a, int b) {
		return a+b;
	}
	static double add(double a, int b) {
		return a+b;
	}
	static double add(double a, double b) {
		return a+b;
	}
}
public class Overloading {

	public static void main(String[] args) {
		System.out.println(Adder.add(5,5));
		System.out.println(Adder.add(10,10,10));
		System.out.println(Adder.add(10.0F,5));
		System.out.println(Adder.add(20.0,5));
		System.out.println(Adder.add(20.0,20.0));

	}

}
