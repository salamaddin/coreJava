import java.util.ArrayList;
import java.util.List;

class Address {
	String addline1, addline2, city;
	int zipcode;

	Address(String addline1, String addline2, String city, int zipcode) {
		this.addline1 = addline1;
		this.addline2 = addline2;
		this.city = city;
		this.zipcode = zipcode;
	}
	
	public void printAddress() {
		System.out.println("Adress line1:" +addline1);
		System.out.println("Adress line2:" +addline2);
		System.out.println("City:" +city);
		System.out.println("Zipcode:" +zipcode);
	}
}

class School{
	List<Address> addresses;
	String schoolName, bordName;
	List<Teacher> teachers;
	// class room , student , fees, libeary, gym, hostel, 
	School(String schoolName,  String bordName)
	{
		this.bordName = bordName;
		this.schoolName = schoolName;
		teachers = new ArrayList<Teacher>();
	}
	public void printSchool()
	{
		System.out.println("School Name: "+schoolName);
		System.out.println("Bord Name: "+bordName);
	}
	public void addTeacher(String firstName, String lastName, int age, String gender, String subject)
	{
		//teachers.add(new Teacher(name,subject));
		//Teacher temp = new Teacher();
		//teachers.add(temp);
	}
	
	public void addAddress(String line1, String line2, String city, Integer zipcode) {
			
			Address temp = new Address(line1, line2, city, zipcode);
			addresses.add(temp);
	}
}

class Teacher{
	String firstName, lastName, gender, subject;
	int age;
	List<Address> addresses = new ArrayList<Address>();
	
	Teacher(String firstName, String lastName, int age, String gender, String subject){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.subject = subject;
	}
	
	public void addAddress(String line1, String line2, String city, Integer zipcode) {
		
		Address temp = new Address(line1, line2, city, zipcode);
		addresses.add(temp);

	}
	public void printDetails() {

		System.out.println("First Name: " + this.firstName);
		System.out.println("Last Name: " + this.lastName);
		System.out.println("Gender: " + this.gender);
		System.out.println("Age: " + this.age);

		for (int i = 0; i < addresses.size(); i++) {
			System.out.println("--------Adress # " + (i + 1) + "----------");
			addresses.get(i).printAddress();
			System.out.println("--------------------------");
		}

	}
	
	Student obj = new Student("bristi", "roy", 35, "Female");
}

public class Student {
	String firstName, lastName, gender;
	int age;

	static int count = 0;
	static int max = 0;
	static int maxAddress = 0;

	static Student eldest;
	static Student maxAddStudent;

	List<Address> addresses;

	Student(String firstName, String lastName, int age, String gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		count++;

		if (max < age) {
			max = age;
			eldest = this;
		}

		addresses = new ArrayList<Address>();

	}

	public void addAddress(String line1, String line2, String city, Integer zipcode) {

		Address temp = new Address(line1, line2, city, zipcode);
		addresses.add(temp);

		if (maxAddress < addresses.size()) {
			maxAddress = addresses.size();
			maxAddStudent = this;
		}
	}

	public static void maxAddress() {
		System.out.println(maxAddStudent.firstName + " has the maximum numbers of addresses");
		maxAddStudent.printDetails();

	}

	public void printDetails() {

		System.out.println("First Name: " + this.firstName);
		System.out.println("Last Name: " + this.lastName);
		System.out.println("Gender: " + this.gender);
		System.out.println("Age: " + this.age);

		for (int i = 0; i < addresses.size(); i++) {
			System.out.println("--------Adress # " + (i + 1) + "----------");
			addresses.get(i).printAddress();
			System.out.println("--------------------------");
		}

	}

	public static void writeExam() {
		System.out.println(eldest.firstName + " is writing exam");
	}

	public static void showEldestFirstName() {
		System.out.println("Eldest person is " + eldest.firstName);
	}

	public static void main(String[] args) {

		String[] fistName = { "salam", "sumon", "soharab", "neha" };
		String[] lastName = { "sk", "mondal", "sk", "neha" };
		int[] age = { 40, 25, 36, 22 };
		String[] gender = { "male", "male", "male", "female" };

		Student[] students = new Student[fistName.length];

		for (int i = 0; i < 4; i++) {
			students[i] = new Student(fistName[i], lastName[i], age[i], gender[i]);
		}

		students[2].addAddress("line1", "line2", "city", 202541);

		students[3].addAddress("line2", "line22", "city2", 202541);
		students[2].addAddress("line3", "line22", "city2", 202541);
		students[2].addAddress("line4", "line22", "city2", 202541);
		students[1].addAddress("line5", "line22", "city2", 0066);

		Student obj = new Student("bristi", "roy", 35, "Female");
		obj.addAddress("line6", "line22", "kolkata", 202541);
		obj.addAddress("line7", "line22", "berhampure", 202541);
//		obj.addAddress("line8","line22","city2",202541);
//		obj.addAddress("line9","line22","city2",202541);
//		obj.addAddress("line10","line22","city2",202541);

		System.out.println("Total number of Student: " + Student.count);
		// System.out.println(" max age " +Student.max);

		Student.showEldestFirstName();
		writeExam();
		 maxAddress(); // calling directly because it static method
		//students[1].printDetails(); //calling printdetails method  by object

//		Teacher ob = new Teacher();
//		ob.addAddress("line66", "line66", "delhi", 32245);
//		ob.printDetails();
		// Teacher sc = new Teacher();
		
	}

}