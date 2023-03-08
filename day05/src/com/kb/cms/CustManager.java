package com.kb.cms;

import java.util.ArrayList;
import java.util.List;


public class CustManager {
	List<Customer> customer = new ArrayList<>();
	
	// 저장
	public void saveCustomer(Customer c) {
		customer.add(c);
		
	}
	
	// 검색
	public void searchCustomer() {
		for(Customer c : customer) {
			System.out.println(c);
		}
	}
	
	// 상세검색
	public Customer searchCustomer(int num) {
		Customer resultCustomer = null;
		for(Customer c : customer) {
			if(c.num == num) {
				resultCustomer = c;
				break;
			}
		}
		
		return resultCustomer;
	}
	
	// 고객 주소 수정
	public void updateCustomer(int num, String address) {
		Customer c = searchCustomer(num);
		
		if(c != null) {
			c.address = address;
			System.out.println(num+"번 고객의 주소가" + address + "로 수정되었습니다.");
		}else System.out.println("수정 실패 : 목록에 없는 고객입니다.");
	}
	
	//삭제
	public void deleteCustomer(int num) {
		Customer c = searchCustomer(num);
		
		if(c != null) {
			customer.remove(c);
			System.out.println(num+"번 고객이 삭제되었습니다.");			
		}else System.out.println("삭제 실패 : 목록에 없는 고객입니다.");
	}
}
