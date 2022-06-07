
public class Constructor {

	int x; // instance variable
	static String str = "Hello"; //static variable

	 public static void myMethod() {
		    System.out.println("I just got executed!");
		  }
	 
	Constructor() {
		x = 5;
		int y = 20; // local variable
		

	}

	Constructor(int x) {
		this.x = x;

	}

	public static void main(String[] args) {
		Constructor obj = new Constructor();
		Constructor obj2 = new Constructor(10);
		System.out.println(obj.x);
		System.out.println(obj2.x);
		System.out.println(str);
		
		myMethod(); // we can access static method by class name or directly

	}

}
