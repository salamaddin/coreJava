package superkeyword;

class Animal {
	
	Animal() {
		System.out.println("parent cons called");
	
	}
	Animal(String s) {
		System.out.println(" parameter parent cons  is created "+s);
	}
	void display() {
		System.out.print("display");
	}
	
}

class Dog extends Animal {
	public Dog() {
		super("dog");
		
		System.out.println(" default child cons is created");
		super.display();
	}
	public Dog(String n) {
		super("cat");
		
		System.out.println(" parameterized child con dog is created"+n);
	}
}

public class SuperConns {
	public static void main(String args[]) {
		Dog d = new Dog("cat");
//		Animal a = new Animal("dog");
//		a.display();
		
	}
}
