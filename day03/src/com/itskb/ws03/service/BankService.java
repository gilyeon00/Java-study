package com.itskb.ws03.service;

import com.itkb.ws03.dto.AccountDto;
import com.itkb.ws03.dto.UserDto;

import java.util.Scanner;

public class BankService {
	int ACCOUNT_SIZE = 5;
	int USER_SIZE = 10;
	int ACCOUNT_CURRENT_SIZE = 0;
	int USER_CURRENT_SIZE = 0;
	
	AccountDto[] getAccountList = new AccountDto[ACCOUNT_SIZE];
	UserDto[] getUserDetail = new UserDto[USER_SIZE];
	
	getAccountList[0] = new AccountDto(1,"1234-00",20000,1);
	getAccountList[1] = new AccountDto(2,"4567-00",45670,2);
	
	getUserDetail[0] = new UserDto(1,"정길연", "12@naver.com","010-1234-4567",false);
	getUserDetail[1] = new UserDto(2,"홍세원", "345@naver.com","010-4568-5777",false);
	
	
	void showUserAccount(int userIdx) {
		for(int i=0; i<getAccountList.length; i++) {
			if(getAccountList[i] != null) {
				if(getAccountList[i].userSeq == userIdx) 
					System.out.println(getAccountList[i].accountNumber);
			}
		}
		
	}
	
	void showUserInfo(int userIdx) {
		for(int i=0; i<getAccountList.length; i++) {
			if(getAccountList[i].userSeq == userIdx)
				System.out.println(getAccountList[i]);
		}
	}
	
	public static void main(String[] args) {
//		showUserAccount(1); // 오류남
	}
	
}
