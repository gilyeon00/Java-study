package com.kb.cms2;

import java.util.ArrayList;
import java.util.List;

import com.kb.cms.Car;

// 차량관리 클래스
// 차량들을 CRUD
public class CarManager {
	
//	ArrayList<Car>  cars = new ArrayList<Car>();
	List<Car> carList = new ArrayList<>();
	
	
	// 저장
	public void saveCar(Car car) {
		carList.add(car);
		
	}
	
	// 검색
	public void searchCar() {
		for(Car c : carList) {
			System.out.println(c);
		}
	}
	
	// 수정
	public Car searchCar(String num) {
		for(Car c :carList) {
			if(c.num.equals(num)) {
				return c;
			}
		}
		return null;
	}
	
	// 삭제
	
	
}
