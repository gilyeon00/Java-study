package JungOl;

import java.util.*;

public class Main0539 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int cnt = 0;
		while(true) {
			int num = sc.nextInt();
			sum += num;
			cnt ++;
			
			if(num>=100) break;
		}
		
		System.out.println(sum);
		System.out.printf("%.1f", sum/(float)cnt);
	}

}
