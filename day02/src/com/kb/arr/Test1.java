package com.kb.arr;

public class Test1 {

	public static void main(String[] args) {
		//배열 1. 선언
		int[] a;
		int b[];
		
		// 2. 생성
		a = new int[5];
		
		// 1+2 선언+생성 합체
		int[] aa = new int[5];
		
		// 3. 값할당
		a[0] = 11;
		a[1] = 22;
		
		// 1+2+3 선언+ 생성 + 값할당 합체
		int[] c = new int[] {1,2,3,4,4,5};
		int[] d = {1,3,4,5,6,6};
		
		
		m(a);
//		m({11,2,3,4,5});  에러발생
		m(new int[] {1,2,3,4}); //OK
		m(c);
		m(d);
		
		
		// 4. 검색
		for(int aaa : aa) {
			System.out.print(aaa+ " ");
		}
	}
	
	public static void m(int[] s) {
		System.out.println(s.length);
	}

}
