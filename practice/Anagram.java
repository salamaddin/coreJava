package practice;

import java.util.Arrays;

public class Anagram {
	public static void anagram(String s1, String s2) {
		
		s1=s1.replaceAll("\\s", "");
		s2=s2.replaceAll("\\s","");
//		System.out.print(s2);

		char[] arr1 = s1.toLowerCase().toCharArray();
		char[] arr2 = s2.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
		
	
	}

	public static void main(String[] args) {
		anagram("Keep", "Peek"); 
		anagram("Mother In Law", "Hitler Woman");
	}

}
