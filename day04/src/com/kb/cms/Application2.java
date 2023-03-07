package com.kb.cms;

public class Application2 {

	public static void main(String[] args) {
		// 객체의 다형성  
//		Car car = new Car();
//		car.drive();	// 메서드의 다형성
		
		Car bus = new Bus();
		bus.drive();
		
		Door door = new Bus();
		door.open();
		door.close();
	}

}
