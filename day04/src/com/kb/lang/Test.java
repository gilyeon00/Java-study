package com.kb.lang;

public class Test {

	public static void main(String[] args) {
		int[] su = new int[3];
		System.out.println(su[1]); // 0
		
//		int i;
//		i += 3; // 컴파일에러

		
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		System.out.println(s1 == s2);  // false
		System.out.println(s1.equals(s2));
		
		String s3 = "GGG";
		String s4 = "GGG";
		System.out.println(s3 == s4);  //true
		System.out.println(s3.equals(s4));
		
	}

}
