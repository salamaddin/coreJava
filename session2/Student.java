package session2;

import java.util.ArrayList;
import java.util.List;

public class Student {
	String fname,lname,gender;
	int age;
	static int maxAge=0;
	static Student eldest;
	
	List<String> line1;
	List<String> line2;
	List<String> city;
	List<Integer> zipcode;
	
	
	Student(String fname, String lname, String gender, int age){
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.age = age;
		
		if(maxAge<age) {
			maxAge = age;
		eldest = this;
		}
		
		line1 = new ArrayList<String>();
		line2 = new ArrayList<String>();
		city = new ArrayList<String>();
		zipcode = new ArrayList<Integer>();
		
	}
	
	public void addAddress(String line1, String line2, String city, Integer zipcode) {
		this.line1.add(line1);
		this.line2.add(line2);
		this.city.add(city);
		this.zipcode.add(zipcode);
	}
	
	public void printAddress() {
		System.out.println("Adress line1:" +line1.get(0));
		System.out.println("Adress line2:" +line2);
		System.out.println("City:" +city);
		System.out.println("Zipcode:" +zipcode.get(0));
	}

	public static void main(String[] args) {
		
		Student s = new Student("bristi", "roy", "female", 23);
		System.out.println(s.fname);
		
		String[] firstName = {"salam", "sumon", "soharab","neha"};
		String[] lastName = {"sk", "sumon", "sk","neha"};
		int[] age = {20,25,36,22};
		String[] gender = {"male", "male", "male","female"};
		
		Student[] students = new Student[firstName.length];
		
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student(firstName[i], lastName[i],gender[i],age[i]);
		}
		
		students[0].addAddress("line1", "line2","city", 2546);
		students[0].addAddress("line1", "line2","city", 2546);
		students[1].addAddress("line1", "line2","city", 2546);
		students[0].printAddress();
		
		System.out.println("Eldest person is: "+eldest.fname);
	}

}
