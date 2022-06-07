abstract class Bike{
	Bike(){
		System.out.println("Bike is created");
	}
	abstract void run(int a);
	void changeGear() {
		System.out.println("Gear changed");
	}
}

class Honda extends Bike{
	void run(int a) {
		System.out.println("Running safely.."+a + "km/h");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		Honda obj = new Honda();
		obj.run(40);
		obj.changeGear();

	}

}
