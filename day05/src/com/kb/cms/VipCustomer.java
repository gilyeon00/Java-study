package com.kb.cms;

public class VipCustomer extends Customer {
//	int num;
//	String name;
//	String address;
	
	String hobby;
	String carNumber;
	
	public VipCustomer() {
		super(); 	// super의 기본생성자 
	}

	
	public VipCustomer(int num, String name, String address, String hobby, String carNumber) {
		super(num, name, address);
		this.hobby = hobby;
		this.carNumber = carNumber;
	}
	

	public VipCustomer(int num, String name, String address, String carNumber) {
//		이렇게 쓰면 위의 생성자와 코드가 넘 겹침
//		super(num, name, address);
//		this.hobby = "";
//		this.carNumber = carNumber;
		
//		this(); // 나의 생성자. = VipCustomer()의 기본 생성자
		this(num, name, address, "", carNumber);
		
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VipCustomer [toString()=");
		builder.append(super.toString());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", hobby=");
		builder.append(hobby);
		builder.append(", carNumber=");
		builder.append(carNumber);
		builder.append("]");
		return builder.toString();
	}



	
	


	
	
	
	
	
}
