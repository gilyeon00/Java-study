package day02;

import java.util.Random;

public class Test5 {

	public static void main(String[] args) {
		// 사용1
		Random  r = new Random();
		int num = r.nextInt();
		System.out.println(num);

		
		// 사용2 - static메서드일 경우, class.메서드명()
		int a = Math.abs(-34);
		System.out.println("Math.abs(-34): " + a);
//		static이 붙어있어서, new안써도됨 
//		public static int abs(int a) {
//	        return (a < 0) ? -a : a;
//	    }
		System.out.println("Math.random(): " + Math.random());
		
		
		// String to Int
		String b = "123";
		int bb = Integer.parseInt(b);
		System.out.println(bb);
		
		
	}

}
