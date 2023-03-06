package com.kb.sms;

public class Student {
	int num;
	String name;
	
	static void study() {
		System.out.println("공부중 ..");
	}
	
	void work(int time) {
		System.out.println(time + "시간 째");
	}
	
	public String toStr() {
		return name + "의 번호는 " +  num;
	}
	
	// 기본 생성자
	public Student() {
		
	}
	
	// 생성자 생성
	public Student(int num, String s) {
		this.num = num;
		name = s;
		System.out.println(name + "의 번호는 " +  num);
	}
}
