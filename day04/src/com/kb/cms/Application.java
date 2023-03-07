package com.kb.cms;

public class Application {
	public static void main(String[] args) {
//		Car car = new Car();
//		car.num = "서울가1234";
//		car.price = 5000;
//		car.drive();
//		System.out.println(car); // car.toString();
		
		// 이렇게 쓸거면 상속쓰는 이유 없음
//		Bus bus = new Bus();
//		bus.num = "경기느4232";
//		bus.price = 6300;
//		bus.seat = 45;
//		bus.drive();
//		System.out.println(bus); // bus.toString();
		
		// 자식클래스 만들면 자동으로 부모클래스도 만들어짐
		// Bus를 만들고 Car를 레퍼런스
		// 똑같은 Car클래스인데 다른 결과값이 나옴 -> 다형성
		Car bus = new Bus();
		bus.num = "경기느4232";
		bus.price = 6300;
//		bus.seat = 45;
		bus.drive();
		System.out.println(bus); // bus.toString();
		
	}
	
	
}
