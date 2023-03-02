package day01;

public class IfTest {

	public static void main(String[] args) {
		int score = 88;
		if(score >= 90) {
			System.out.println("A학점입니다");
		}else if (score >= 80) {
			System.out.println("B학점입니다");
		}else if (score >= 70) {
			System.out.println("C학점입니다");
		}else if (score >= 60) {
			System.out.println("D학점입니다");
		}else {
			System.out.println("F학점입니다");
		}
		
		switch(score / 10) {
		case 10:
		case 9:
			System.out.println("A");
		default:
			System.out.println("F");
			
		}


	}

}
