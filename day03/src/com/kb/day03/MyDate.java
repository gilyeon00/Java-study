package com.kb.day03;

public class MyDate {
	int year;
	int month;
	int day;
	
	public String toString() {
		return year + "년 " + month + "월 " + day + "일 ";
	}
	
	public MyDate() {
	}
	
	public MyDate(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
		System.out.println(year + "년 " + month + "월 " + day + "일 ");
	}
	
//	public MyDate(int year, int month, int day) {
//		this.year = year;
//		this.month = month;
//		this.day = month;
//		System.out.println(year + "년 " + month + "월 " + day + "일 ");
//	}
	
	public MyDate(int m, int d) {
		year = 1990;
		month = m;
		day = d;
		System.out.println(year + "년 " + month + "월 " + day + "일 ");
	}
	
}
