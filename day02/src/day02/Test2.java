package day02;

import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt();
		System.out.println(num);
		System.out.println(num / 100000);
		
		Random r1 = new Random();
		int[] lotto = {0,0,0,0,0,0};
		
		boolean flag = false;
		int i=0;
		while(true) {
			if(lotto[lotto.length-1] != 0) break;
			
			int num1 = r.nextInt(45);
			for(int j=0; j<lotto.length; j++) {
				if(num1 == lotto[j]) {
					flag = true;
					break;
				}
			}
			
			if(flag == true) continue;
			else {
				lotto[i] = num1;
				System.out.print(lotto[i] + " " );
				i++;
			}
			
		}
		

	}

}
