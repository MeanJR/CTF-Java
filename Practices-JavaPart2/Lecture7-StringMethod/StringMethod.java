package com.ctf.StringMethod;

public class StringMethod {

	public static void main(String[] args) {
		
		
		String text1 = "  You and Me ";
		String text2 = " you and me ";
		
		//1
		System.out.println(compareString(text1, text2));
		
		//2
		System.out.println(searchString(text1, text2));
		
		//3
		System.out.println(lengthString(text1));
		
		//4
		System.out.println(cutString(text1));
		
		//5
		System.out.println(marginString(text1));
		
		//6
		System.out.println(upperString(text1));
		
		//7
		System.out.println(chainingString(text2));
		

	}
	//1
	
	public static boolean compareString(String text1, String text2) {
					
		return text1.equals(text2);
	}
	//2
	
	public static boolean searchString(String text1, String text2) {
		
		return text1.contains(text2);
	}
	//3	
	
	public static int lengthString(String text) {
		
		return text.length();
	}
	//4
	
	public static String cutString(String text) {
		
		return text.substring(4);
	}
	//5
	
	public static String marginString(String text) {
		
		return text.trim();
	}
	//6
	
	public static String upperString(String text) {
		
		return text.toUpperCase();
	}
	//7
	
	public static String chainingString(String text) {
		
		return text.toUpperCase().trim();
	}

}
