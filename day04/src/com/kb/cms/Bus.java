package com.kb.cms;

public class Bus extends Car {
	int seat;
	
	public void autodoor(boolean flag) {
		if(flag)
			System.out.println("Opened door");
		else
			System.out.println("Closed door");
			
	}
	
	// Overriding : 리턴타입, 이름, 파라미터 모두 같아야함
	public String toString() {
		return "Bus [num=" + num + ", seat=" + seat + ", price=" + price + "]";
	}
}
