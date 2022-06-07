
interface Printable {
	public static final int i = 10; // by default all variable is public static final in interface class
	void print(); // by default methods are abstract 
	public default void display() {
		System.out.println("Default method");
	}
}
interface Showable{
	public static final int i = 20;
	void show();
//	public default void display(int i) {
//		System.out.println("Default method");
//	}
}

class Demo implements Printable, Showable{
	public void print() {
		System.out.println("Hello");
	}
	public void show() {
		System.out.println("welcome");
	}
}

public class InterfaceFirst {

	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.print();
		obj.show();
		obj.display();

	}

}
