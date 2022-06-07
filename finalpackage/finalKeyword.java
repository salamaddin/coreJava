package finalpackage;

//A class can be made final by using the final keyword.
//The final class cannot be inherited and so the final 
//keyword is commonly used with a class to prevent inheritance.
 class FinalExample {
	final int speedlimit;

	FinalExample() {
		speedlimit = 100;
	}

	protected void run() {
		System.out.println("inside final method");
	}
}
class Test extends FinalExample{
	public void run() {
		System.out.println("inside final method");
	}
}

//the final variable cannot be reinitialized with another value
//the final method cannot be overridden
//the final class cannot be extended

public class finalKeyword {

	public static void main(String[] args) {
		FinalExample obj = new FinalExample();
		System.out.println(obj.speedlimit);
		obj.run();
	}

}
