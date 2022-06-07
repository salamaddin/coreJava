
public class StringTest {

	public static void main(String[] args) {
		String s1= "KOLKATA";
		String s2 = "New.Town";
		String s3 = "";
		
		System.out.println(s1.charAt(0));
		System.out.println(s1.length());
		System.out.println(s1.indexOf("TA")); //default value -1 if not found
		System.out.println(s1.lastIndexOf("K"));
		System.out.println(s2.concat(s1));
		System.out.println(s1.equals(s2));
		System.out.println(s1.endsWith("ATA"));
		System.out.println(s1.startsWith("KOL"));
		System.out.println(s1.substring(0,2));
		System.out.println(s1.contains("KA"));
		System.out.println(s3.isEmpty());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s2.replace("New", "old"));
		System.out.println(s1.trim());
	//	The trim() method in Java string checks this Unicode value before and after
	//	the string, if it exists then the method removes the spaces and returns the omitted string.
		
		String arr[]=s2.split("\\.");
		for(String a:arr){  
			System.out.println(a);  
			} 
		//System.out.println(arr[0]); 
		
		//System.out.println(arr);
		
		char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
		String s=new String(ch);
		System.out.println(s);
		
		 StringBuilder builder=new StringBuilder("hello");  
	        builder.append("java");  
	        System.out.println(builder);  
	        
	        StringBuffer buffer=new StringBuffer("hello");  
	        buffer.append("java");  
	        System.out.println(buffer);  
		
		
		
	}

}
