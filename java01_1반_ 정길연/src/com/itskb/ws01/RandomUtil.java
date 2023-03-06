package com.itskb.ws01;

import java.lang.Math;
import java.util.Random;

public class RandomUtil {
	static Random r = new Random();
	
	public static int getRandomInt1(int num1, int num2) {	
		int result = (int)(Math.random() * (num2-num1) + num1);

		return result;
	}
	
	public static int getRandomInt2(int num1, int num2) {
		int result = r.nextInt(num1, num2+1);
		
		return result;
		Math.PI;	
	}
	
	
	
}
