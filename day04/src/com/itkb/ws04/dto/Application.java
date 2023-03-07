package com.itkb.ws04.dto;

import java.util.List;

import com.itskb.ws04.service.BankService;

public class Application {

	public static void main(String[] args) {
		
		BankService bankService = new BankService();
		List<AccountDto> resultList = bankService.getAccountList(1);
//		UserDto userResult = bankService.getUserDetail(1);
		
		for(AccountDto dto: resultList)
			System.out.println(dto);
		
		System.out.println(bankService.getUserDetail(1).name);
	}
}
