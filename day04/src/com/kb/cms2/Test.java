package com.kb.cms2;

import com.kb.cms.Bus;

public class Test {

	public static void main(String[] args) {
		CarManager carManager = new CarManager();
		carManager.saveCar(new Bus("1233", 5000, 45));
		carManager.saveCar(new Bus("2551", 6500, 50));
		carManager.saveCar(new Bus("0452", 8800, 70));
		carManager.saveCar(new Bus("8557", 4800, 30));
		carManager.searchCar();
	}

}
