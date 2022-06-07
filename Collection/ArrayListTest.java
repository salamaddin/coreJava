package Collection;

import java.util.*;

public class ArrayListTest {
	
	public static void main(String[] srgs) {
		//List<> list = new ArrayList();
		ArrayList<String> cars = new ArrayList<String>();
		List <Integer> list1= new ArrayList(); 
		 cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
//		    System.out.println(cars.get(0));
//		    
//		    for(String s : cars) { 
//		    	System.out.println(s);
//		    }
		    
		    List<String> al=new ArrayList<String>();//creating arraylist    
		    al.add("Ravi");//adding object in arraylist    
		    al.add("Vijay");    
		    al.add("Ravi");    
		    al.add("Ajay");    
		      
		    List<String> al2=new LinkedList<String>();//creating linkedlist    
		    al2.add("James");//adding object in linkedlist    
		    al2.add("Serena");    
		    al2.add("Swati");    
		    al2.add("Junaid"); 
		    
		    Iterator<String> itr = al.iterator();
		      while(itr.hasNext()) {
		    	  System.out.println(itr.next());
		      }
//		    System.out.println("arraylist: "+al);  
//		    System.out.println("linkedlist: "+al2);  
 	}
}
