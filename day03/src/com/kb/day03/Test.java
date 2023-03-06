package com.kb.day03;

public class Test {

	public static void main(String[] args) {
		MyDate myDate = new MyDate();
		myDate.year = 2023;
		myDate.month = 3;
		myDate.day = 6;
		
		String strDate = myDate.toString();
		System.out.println("1. " + strDate); //1. 2023년 3월 6일 
		
		System.out.println("2. " +myDate.toString()); //2. 2023년 3월 6일 
		
		System.out.println("3. " +myDate); //3. 2023년 3월 6일  // C언어는 주소값 리턴함 얘는 결국  myDate.toString()을 부름 
		
		// 생성자 - Constructor
		// 기본 생성자 ( Default constructor)
		//  : 파라미터, return, body가 업는 생성자\
		// -> class의 생성자가 하나도 없다면 컴파일러가 기본적으로 만들어줌 
		
	}

}
