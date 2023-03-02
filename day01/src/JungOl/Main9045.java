package JungOl;

import java.util.*;

public class Main9045 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		while(flag) {
			System.out.println("1. 입력하기");
			System.out.println("2. 출력하기");
			System.out.println("3. 삭제하기");
			System.out.println("4. 끝내기");
			System.out.print("작업할 번호를 선택하세요. ");
			
			int select = sc.nextInt();
			System.out.println();
			
			switch(select) {
			case 4:
				System.out.println("끝내기를 선택하였습니다.");
				flag = false;
				break;
			case 1:
				System.out.println("입력하기를 선택하였습니다.");
				break;
			case 2:
				System.out.println("출력하기를 선택하였습니다.");
				break;
			case 3:
				System.out.println("삭제하기를 선택하였습니다.");
				break;
			default:
				System.out.println("잘못 선택하였습니다.");
				
			}
			System.out.println();
					
		}
		
	}

}
