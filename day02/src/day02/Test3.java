package day02;

import java.util.*;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int num = r.nextInt();
		
		while(true) {
			System.out.println("복권을 살 금액을 입력하세요");
			int money = sc.nextInt();
			
			if(money%1000 != 0) {
				System.out.println("1000원 단위로 입력해야합니다.");
				continue;
			}
			
			int count = money / 1000;
			System.out.println("복권 " + count + "개를 생성합니다.");
			int[] lotto = {0,0,0,0,0,0};
			for(int j =0; j<count; j++) {
				for(int i = 0; i<6; i++){
					int num1 = r.nextInt(45)+1;
					
					lotto[i] = num1;
					System.out.print(lotto[i] + "	" );
				}	
				System.out.println();
			}
			System.out.println();
		}
		

	}

}
