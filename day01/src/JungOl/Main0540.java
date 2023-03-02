package JungOl;

import java.util.*;

public class Main0540 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int num = sc.nextInt();
			if(num == -1) break;
			if(num % 3 != 0) continue;
			System.out.println(num/3);
		}

	}

}
