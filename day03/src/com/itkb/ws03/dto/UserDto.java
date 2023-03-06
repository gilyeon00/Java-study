package com.itkb.ws03.dto;

public class UserDto {
	int userSeq;
	String name;
	String email;
	String phone;
	boolean isSleep; 
	
	String PrintUserInfo() {
		return "user 일련번호 : " +userSeq + "user 이름 : " + name + "user email주소 : " +email + "휴면계정 여부 : " + isSleep; 
	}
//	public UserDto(int userSeq, String name, String email, String phone, boolean isSleep) {
//		this.userSeq = userSeq;
//		this.name = name;
//		this.email = email;
//		this.phone = phone;
//		this.isSleep = isSleep;
//		
//	
//	}
}
