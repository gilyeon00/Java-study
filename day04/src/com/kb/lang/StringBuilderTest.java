package com.kb.lang;

public class StringBuilderTest {
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = "HIHIHIHIhihih";
		s2 += s1;
		System.out.println(s2);
		
		// String : 잘 안바뀔때
		// StringBuilder : 자주 바뀔때
		StringBuilder sb = new StringBuilder("ABX");
		System.out.println(sb);
		sb.append("DEF");	// 덧셈 안됨
		System.out.println(sb);
		
		System.out.println(sb.charAt(2));	// X
		System.out.println(sb.length());	// 6
		
		sb.setLength(4);			
		System.out.println(sb);			// // ABXD
		
		System.out.println(sb.reverse());	// DXBA
		System.out.println(sb);				// DXBA
	}

}
