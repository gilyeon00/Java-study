package com.kb.lang;

public class StringTest {

	public static void main(String[] args) {
		String s1 = new String("IT's your life");
		String s2 = "Welcome ";		// String만 허용됨
		String s3 = s2 + s1;
		System.out.println(s3);
		System.out.println();
		
		String str1 = "Hello";
		String str2 = str1 + 10;
		System.out.println(str2);
		System.out.println(10 + 43 + str2);
		System.out.println();
		
		
		System.out.println(s3.length());
		System.out.println(s3.toLowerCase());
		System.out.println(s3.toUpperCase());
		
		
		String s = "IT's your life";
		System.out.println(s1 == s); // = 참조값이 같으냐 물어보는 것 -> false
		System.out.println(s1.equals(s)); // = 참조하고 있는 값이 같냐 -> true
		System.out.println();
		
		
		String s4 = "ABC";	// 65 + 66 + 67
		String s5 = "ABD";  // 65 + 66 + 68
		System.out.println(s4.compareTo(s5)); // -1
		System.out.println(s5.compareTo(s4)); // 1
		
		System.out.println(s1.indexOf("your")); 	// 5	
		System.out.println(s1.charAt(6));		// o
		
		System.out.println(s1.substring(2,6));	// 's y
		System.out.println(s1.substring(5,12)); // your li 5부터 11까지
		
		System.out.println(s1.substring(1));	// 오버로딩 된 메서드임
		
		
	}

}
