package com.kb.cms;

public class Application {

	public static void main(String[] args) {
		// interface는 new 인터페이스 불가
		// Interface interface = new 원본();
		ICustManager mgr = new CustManager();
		
		mgr.saveCustomer(new Customer(1001, "gilyeon", "seoul"));
		mgr.saveCustomer(new Customer(1002, "sewon", "seoul"));
		mgr.saveCustomer(new Customer(1004, "kim", "incheon"));
		mgr.saveCustomer(new VipCustomer(1003, "park", "jeju", "11가9290"));
		mgr.saveCustomer(new VipCustomer(1005, "jung", "anyang", "golf", "56다1451"));
		
		
		mgr.searchCustomer();
		mgr.searchCustomer(1003);
		
		mgr.updateCustomer(1004, "ansan");
		mgr.updateCustomer(1045, "ansan");
		
		mgr.deleteCustomer(1005);
		mgr.searchCustomer();
	}

}
