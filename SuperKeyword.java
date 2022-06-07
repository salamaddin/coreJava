//class Animal {
//	Animal() {
//		System.out.println("Parent cons");
//	}
//}
//
//class Dog extends Animal {
//	Dog() {
//		System.out.println("Child cons");
//	}
//}
//
//public class SuperKeyword {
//
//	public static void main(String[] args) {
//		Dog d = new Dog();
//	}
//
//}

//super keyword refer variable

class Animal {
	String color = "white";
	{
		System.out.println("Instance");
	}
	
	Animal(){
		System.out.println("constructor");
		
	}
	public static void myMethod() {
		System.out.println("Method");
	}
	static {
		System.out.println("Static");
	}
}

class Dog extends Animal {
	String color = "black";

	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
}

class SuperKeyword {
	
	public static void main(String args[]) {
//		Dog d = new Dog();
//		d.printColor();
		Animal.myMethod();
		new Animal();
//		obj.myMethod();
	}
}
