package com.itskb.ws01;

import java.util.*;

public class RandomUtilTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		for(int i=0; i<100; i++) {
			System.out.print(RandomUtil.getRandomInt1(num1,num2) + " "); 
		}
		
		System.out.println();
		
		for(int i=0; i<100; i++) {
			System.out.print(RandomUtil.getRandomInt2(num1,num2) + " "); 
		}
		

	}

}
