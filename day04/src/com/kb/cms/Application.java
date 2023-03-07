package com.kb.cms;

public class Application {
	public static void main(String[] args) {
		Car car = new Car();
		car.num = "서울가1234";
		car.price = 5000;
		car.drive();
		System.out.println(car); // car.toString();
		
		
		Bus bus = new Bus();
		bus.num = "경기느4232";
		bus.price = 6300;
		bus.seat = 45;
		bus.drive();
		System.out.println(bus); // bus.toString();
	}
	
	
}
