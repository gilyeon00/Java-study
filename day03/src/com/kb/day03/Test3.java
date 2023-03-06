package com.kb.day03;

public class Test3 {

	public static void main(String[] args) {
		MyDate m = new MyDate(); // 원래는 이 문장은 public MyDate() {} 생성자를 호출하는 건데 없으면 컴파일할 때 자동 생성
		m.year = 2055;
		m.month = 6;
		m.day = 27;
		System.out.println(m);
		
		MyDate m1 = new MyDate(2023,3,6);
		MyDate m2 = new MyDate(12,8);
		
		

	}

}
