package session2;

import java.util.HashMap;
import java.util.Map.Entry;

public class HasMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> empid = new HashMap<String, Integer>();
		empid.put("jon", 1234);
		empid.put("neha", 1235);
		empid.put("jae", 1236);
		System.out.println(empid);
		System.out.println(empid.get("neha"));
		System.out.println(empid.containsValue(12345));
		System.out.println(empid.containsKey("neha"));
		
		  for (Entry<String, Integer> e : empid.entrySet())
	            System.out.println("Key: " + e.getKey()
	                               + " Value: " + e.getValue());
	}

}
