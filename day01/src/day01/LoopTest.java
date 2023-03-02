package day01;

public class LoopTest {

	public static void main(String[] args) {
		// for
		
		// 별찍기
		for(int i=1; i<10; i++) {
			for(int j=0; j<i; j++){
				System.out.print("*");
			}
			System.out.println();
		}System.out.println();
		
		// 별찍기2
		for(int i=10; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 구구단
		int num = 3;
		for(int i=1; i<10; i++) {
			System.out.println(num+"X"+i+" = "+num*i);
		}
		System.out.println();
		
		// all 구구단
		for(int i=2; i<10; i++) {
			System.out.println("<< "+i+"단 >>");
			for(int j=1; j<10; j++) {
				System.out.println(i+"X"+j+" = "+i*j);
			}
			System.out.println();
		}
		
		
		// for ~ each
		int[] su = {30,70,20,80,10};
		for(int i=0; i<su.length; i++) {
			System.out.println("su["+i+"] : "+su[i]);
		}
		// 전체 꺼내올 때 속도가 더 빠름
		for(int s : su) {
			System.out.print(s + " ");
		}
		
		/*
		//while
		while(조건) {
			
			
		}
		
		//do ~ while
		do {
			
		} while(조건);
		*/
		
	} // end main

} //end class
