package day01;

public class LoopTest2 {

	public static void main(String[] args) {
		// 1부터 100까지 짝수합
		int sum = 0;
		for(int i=0; i<=100; i++) {
			if(i % 2 == 0) {
				sum += i;				
			}else continue;
		}
		System.out.println("1to100 짝수합: "+sum);
		
		
		
		// 1부터 100까지 홀수합
		int sum2 = 0;
		for(int i=2; i<=100; i+=2) {
				sum2 += i;				
		}
		System.out.println("1to100 홀수합: "+sum2);
		
		
		// 1부터 100까지 3의 배수의 합
		int sum3 = 0;
		for(int i=3; i<=100; i+=3) {
			sum3 += i;
		}
		System.out.println("1to100 3의 배수의 합: "+sum3);

		
		// 1부터 100까지 3의 배수의 합, 5의 배수는 제외
		int sum4 = 0;
		for(int i=3; i<=100; i+=3) {
			if(i%5 == 0) continue;
			sum4 += i;
		}
		System.out.println("1to100 5의 배수 제외 3의 배수의 합: "+sum4);

	}

}
