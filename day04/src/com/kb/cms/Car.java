package com.kb.cms;

public class Car {
	String num;
	int price;
	
	public void drive() {
		System.out.println("시속 60km로 달립니다");
	}
	
	public void drive(int speed) {
		System.out.println("시속 " + speed + "km로 달립니당");
	}

	@Override
	public String toString() {
		return "Car [num=" + num + ", price=" + price + "]";
	}
	
	

}
