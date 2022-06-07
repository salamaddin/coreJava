package Collection;

import java.util.*;

public class HassetTest {
	public static void main(String args[]) {
 // HashSet. It contains unique items.
		HashSet<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
  
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}