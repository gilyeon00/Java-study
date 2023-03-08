package com.kb.cms;

public interface ICustManager {

	// 저장
	void saveCustomer(Customer c);

	// 검색
	void searchCustomer();

	// 상세검색
	Customer searchCustomer(int num);

	/**
	 * 주어진 고객번호를 검색하여 주소를 수정한다
	 * @param num : 고객번호
	 * @param address : 수정할 주소
	 */
	void updateCustomer(int num, String address);

	//삭제
	void deleteCustomer(int num);

}