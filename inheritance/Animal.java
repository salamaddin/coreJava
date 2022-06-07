package inheritance;

class Animal {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.print("Barking...");
	}
	
//	void eat() {
//		System.out.println(" Dog eating...");
//	}

}


class BabyDog extends Dog {
	void weep() {
		System.out.println("weeping...");
	}
}
