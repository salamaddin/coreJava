package practice;

public class Plindrome {

	public static void main(String[] args) {
		String s = "levelf";
		String str ="";
		
		
		for(int i =s.length()-1; i>=0; i--) {
			str += s.charAt(i);
		}
		
		if(s.equals(str)) {
			System.out.print("plindrome");
		}else {
			System.out.print("Not plindrome");
		}
		
		
	}

}
