package JungOl;

import java.util.*;

public class Main9043 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int cnt = 0;
		while(true) {
			int num = sc.nextInt();
			if(num == 0) break;
			if(num % 2 != 0) {
				sum += num;
				cnt++;
			}
		}
		
		System.out.println("홀수의 합 = " + sum);
		System.out.println("홀수의 평균 = " + sum/cnt);
		
	}

}
