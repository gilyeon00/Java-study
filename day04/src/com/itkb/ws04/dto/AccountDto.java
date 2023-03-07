package com.itkb.ws04.dto;

public class AccountDto {
	int accountSeq;
	public String accountNumber;
	int balance;
	public int userSeq;
	

//	String PrintAccountInfo() {
//		return "계좌 일련번호 :" + accountSeq + " 계좌번호 : " + accountNumber + " 통장 잔고 : " + balance ;
//	}

// alt + shift + s -> gernerate 
	public AccountDto(int accountSeq, String accountNumber, int balance, int userSeq) {
		super();
		this.accountSeq = accountSeq;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.userSeq = userSeq;
	}
	
	
	
}
