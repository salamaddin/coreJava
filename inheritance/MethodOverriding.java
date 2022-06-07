package inheritance;


class Car {
	public  void run() {
		System.out.println("running…");
	}
	
}

class Maruti extends Car {

	public void run() {
		System.out.println("Maruti running...");
		//super.run();
	}

}

class Hyundai extends Car {

	public void run() {
		System.out.println("Hyundai running...");
	}

}


public class MethodOverriding {

	public static void main(String[] args) {
//		Car obj = new Hyundai(); //we can store child class object in parent reference variable
//		obj.run();
		
		Maruti m = new Maruti();
		m.run();
		
		

	}

}
