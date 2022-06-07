package session2;

import java.util.HashMap;

public class HashMapEx {
	int i=4;
	HashMap<String, String> days = new HashMap<String, String> ();
	HashMap<String, HashMap<String, String>> slot = new HashMap();
	public void adDay() {
		
		days.put("1","Monday");
		days.put("2","Tuesday");
		days.put("3","Wednesday");
		days.put("4","Thursday");
		days.put("5","Friday");
		days.put("6","saturday");
		days.put("7","Sunday");
	}
	
	public void addTimeTable(String day, String time[], String classDetails[]) {
		HashMap<String, String> temp = new HashMap<String, String> ();
			
			for (int i = 0; i < time.length; i++) {
				temp.put(time[i], classDetails[i]);
			}
		
		slot.put(day, temp);
	}
	
	public String getSlotDetails(String day, String time) {
		return slot.get(day).get(time);
	}
	
	public String getDayName(int num) {
		return days.get(""+num);
	}
	
	
	public static void main(String[] args) {
		HashMapEx d = new HashMapEx();
		d.adDay();
		
		String [] time = { 
				"10:00 to 10:00",
				"11:00 to 11:00",
				"12:00 to 1:00",
				"1:00 to 2:00",
				"2:00 to 4:00",
				"3:00 to 4:00"
				};
		String [] classDetails = {
				"Maths , souvik",
				"English , soharab",
				"Physics , sumon",
				"Break-times",
				"Chemistry , sonali",
				"Bangla , sojol",
		};
		
		d.addTimeTable("Monday", time, classDetails);
		
		System.out.println(d.getDayName(2));
		System.out.print(d.getSlotDetails("Monday","12:00 to 1:00"));

	}

}
