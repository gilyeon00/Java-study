package com.kb.cms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTest {

	public static void main(String[] args) {
		List<String> strList1 = new ArrayList<>();
		strList1.add("KIM");
		strList1.add("ParK");
		strList1.add("Jung");
		
		for(String s : strList1) {
			System.out.println(s);
		}
		
		System.out.println();
		
		// List sort 방법
		Collections.sort(strList1);
		for(String s : strList1) {
			System.out.println(s);
		}
		
		System.out.println();
		
		// Array sort 방법
		String[] strList2 = {"Kim, Lee, Kang, Bae"};
		Arrays.sort(strList2);
		for(String s : strList2) {
			System.out.println(s);
		}
		
		System.out.println();
		
		System.out.println(Arrays.toString(strList2));
		
	}

}
