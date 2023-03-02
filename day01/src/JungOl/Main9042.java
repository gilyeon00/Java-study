package JungOl;

import java.util.*;

public class Main9042 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int cnt = 0;
		while(true) {
			int num = sc.nextInt();
			if(num == 0) break;
			sum += num;
			cnt += 1;
		}
		
		System.out.println("입력된 자료의 개수 = " + cnt);
		System.out.println("입력된 자료의 합계 = " + sum);
		System.out.printf("입력된 자료의 평균 = %.2f", Float.valueOf(sum/(float)cnt) );
		
		
	}

}
