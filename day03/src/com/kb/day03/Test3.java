package com.kb.day03;

public class Test3 {

	public static void main(String[] args) {
		MyDate[] myDate = new MyDate[5];    //  int[] numArr = new int[5] 처럼 선언
		myDate[0] = new MyDate(3,23);
		myDate[1] = new MyDate(4,21);
		myDate[1] = new MyDate(5,5);
		
		System.out.println(myDate[0]);
		
		for(MyDate md: myDate) {
			System.out.println(md);
		}
		
		for(int i=0; i<myDate.length; i++) {
			if(myDate[i] != null) {
				if(myDate[i].month == 5) System.out.println(myDate[i]);
			}
		}
		
	}

}
