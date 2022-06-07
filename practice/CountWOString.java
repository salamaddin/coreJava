package practice;

public class CountWOString {

	public static void main(String[] args) {
		String s = "  hello, my   name is salam";
		
		String str = s.trim().replaceAll(" +", " ");
		String[] arr = str.split("\\s");
		System.out.println(arr.length);
		
		int count = 1;
		String s2 = s.trim(); 
		for(int i=0; i<s2.length(); i++) {
			if(s2.charAt(i) == ' ' && s2.charAt(i+1) !=' ')  {
				count++;
			}
		}
		System.out.println(count);
		
	    }
}
