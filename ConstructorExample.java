
class A {
	// int num; // when we declare non static variable it"s create an instance
	static int num;
	String name;

	A() {
		num++;
//		System.out.println(num);
	}

	void display() {
		System.out.println(num);
	}
}

public class ConstructorExample {

	public static void main(String[] args) {
		A obj = new A(); // 1 
		A obj2 = new A(); //2
		A obj3 = new A(); //3
		
		obj.display();
		obj2.display();
		obj3.display();
	}

}
