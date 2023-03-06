package com.itkb.ws03.dto;

import com.itskb.ws03.service.BankService;

public class Application {

	public static void main(String[] args) {
		
		BankService bankService = new BankService();
		AccountDto[] resultList = bankService.getAccountList(1);
//		UserDto userResult = bankService.getUserDetail(1);
		
		for(AccountDto dto: resultList)
			System.out.println(dto.accountNumber);
		
		System.out.println(bankService.getUserDetail(1).name);
	}
}
