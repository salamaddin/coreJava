
class ABC {
	static int n = 20;
	void display1() {
		System.out.println("i am non static method");
	}

	static void display2() {
		System.out.print("i am static method");
	}
}

public class StaticMethod {
	public static void main(String[] args) {
		ABC obj = new ABC();
		obj.display1();
		ABC.display2();
		System.out.println(ABC.n);

	}

}
