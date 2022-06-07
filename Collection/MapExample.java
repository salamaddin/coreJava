package Collection;

import java.util.HashMap;
import java.util.Map;

class Book{
	 static int id;
	String name, author;
	
	public Book(int id, String name, String author){
		this.id = id;
		this.name = name;
		this.author = author;
		
	}
}

public class MapExample {

	public static void main(String[] args) {
		
		Book b1 = new Book(101,"java","jkskg");
		Book b2 = new Book(102,"c","jkskg");
		Book b3 = new Book(103,"javascript","jkskg");
		Book b4 = new Book(102,"python","jkskg");
		Map<Integer,Book> map=new HashMap<Integer,Book>();  
		  map.put(100,b1);  
		  map.put(101,b2);  
		  map.put(102,b3);
		  map.put(Book.id, b4);
		  //Elements can traverse in any order  
		  for(Map.Entry<Integer, Book> entry:map.entrySet()){
			  Book b = entry.getValue();
		   System.out.println(b.id + " "+b.name + " " +b.author); 
		  }

	}

}
