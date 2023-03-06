package com.itskb.ws03.service;

import com.itkb.ws03.dto.AccountDto;
import com.itkb.ws03.dto.UserDto;

public class BankService {
	int ACCOUNT_SIZE = 5;
	int USER_SIZE = 10;
	int ACCOUNT_CURRENT_SIZE = 0;
	int USER_CURRENT_SIZE = 0;
	
	int accountIndex = 0;
	int userIndex = 0;
	AccountDto[] accountList;
	UserDto[] userList;
	
	
	public BankService() {
		accountList = new AccountDto[ACCOUNT_SIZE];
		userList = new UserDto[USER_SIZE];
		
		accountList[accountIndex++] = new AccountDto(1,"1234-00",20000,1);
		accountList[accountIndex++] = new AccountDto(2,"4567-00",45670,2);
		accountList[accountIndex++] = new AccountDto(3,"99-4285-00",8741000,1);
		
		userList[userIndex++] = new UserDto(1,"정길연", "12@naver.com","010-1334-4567",false);
		userList[userIndex++] = new UserDto(2,"홍세원", "345@naver.com","010-4568-5777",false);
		userList[userIndex++] = new UserDto(3,"김양희", "ffq2j@naver.com","010-6542-8163",true);
	}
	
	
	public AccountDto[] getAccountList(int userSeq) {
		// 배열 생성을 위한 결과 데이터 개수 체크
		int count =0;
		for(int i=0; i<accountIndex; i++) {
			if (accountList[i].userSeq == userSeq) {
				count ++;
			}
		}
		
		// 배열 생성
		AccountDto[] resultList = new AccountDto[count];
		
		// 결과 데이터 담기 
		int idx = 0;
		for(int i=0; i<accountIndex; i++) {
			if(accountList[i].userSeq == userSeq) {
				resultList[idx++] = accountList[i];
			}
		}
		
		return resultList;	
	}
	
	
	public UserDto getUserDetail(int userSeq) {
		UserDto result = null;
		
		for(int i=0; i<userIndex; i++) {
			if(userList[i].userSeq == userSeq) {
				result = userList[i];
				break;
			}
		}
		return result;
	}

	
}
