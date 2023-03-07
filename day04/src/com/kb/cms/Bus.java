package com.kb.cms;

public class Bus extends Car implements Door{
	int seat;
	
	
	public Bus() {}
	public Bus(String num, int price, int seat) {
		this.num = num; // this에 없으면 super로 감
		this.price = price;
		this.seat = seat;
	}
	
	
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
