package com.kb.cms;

public class Bus extends Car implements Door{
	int seat;
	
	public void autoDoor(boolean flag) {
		if(flag)
			System.out.println("Opened door");
		else
			System.out.println("Closed door");
			
	}
	
	// Overriding : 리턴타입, 이름, 파라미터 모두 같아야함
	public String toString() {
		return "Bus [num=" + num + ", seat=" + seat + ", price=" + price + "]";
	}
	
	public void drive() {
		System.out.println("시속 40km로 달립니다");
	}

	@Override
	public void open() {
		System.out.println("버스문이 열렸습니다.");
		
	}

	@Override
	public void close() {
		System.out.println("버스문이 닫혔습니다.");
		
	}
}
