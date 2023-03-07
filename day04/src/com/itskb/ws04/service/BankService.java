package com.itskb.ws04.service;

import java.util.ArrayList;
import java.util.List;

import com.itkb.ws04.dto.AccountDto;
import com.itkb.ws04.dto.UserDto;
import com.kb.cms.Bus;
import com.kb.cms2.CarManager;

public class BankService {
	List<AccountDto> accountList;
	List<UserDto> userList;
	
	int accountIndex = 0;
	int userIndex = 0;
	
	public void createAccount(AccountDto accountDto) {
		accountList.add(accountDto);
	}
	
	
	public BankService() {
		
		accountList = new ArrayList<AccountDto>();
		userList = new ArrayList<UserDto>();
		
		accountList.add(new AccountDto(1,"1234-00",20000,1));
		accountList.add(new AccountDto(2,"4567-00",45670,2));
		accountList.add(new AccountDto(3,"99-4285-00",8741000,1));

		userList.add(new UserDto(1,"정길연", "12@naver.com","010-1334-4567",false));
		userList.add(new UserDto(2,"홍세원", "345@naver.com","010-4568-5777",false));
		userList.add(new UserDto(3,"김양희", "ffq2j@naver.com","010-6542-8163",true));
		
	}
	
	
	public List<AccountDto> getAccountList(int userSeq) {
		// 배열 생성을 위한 결과 데이터 개수 체크
		int count =0;
		for(int i=0; i<accountList.size(); i++) {
			if (accountList.get(i).userSeq == userSeq) {
				count ++;
			}
		}
		
		// 배열 생성
		List<AccountDto> resultList = new ArrayList<>();
		
		// 결과 데이터 담기 
//		for(int i=0; i<accountIndex; i++) {
//			if(accountList.get(i).userSeq == userSeq) {
//				resultList.add(accountList.get(i));
//			}
//		}
//		
//		return resultList;	
		
		for(AccountDto dto : accountList) {
			if(dto.userSeq == userSeq) {
				resultList.add(dto);
			}
			
		}
		return resultList;
	}
	
	
	public UserDto getUserDetail(int userSeq) {
		UserDto result = null;
		
		for(UserDto dto: userList) {
			if(dto.userSeq == userSeq) {
				return dto;
			}
		}
		return result;
	}

	
}
