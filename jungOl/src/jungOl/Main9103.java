package jungOl;

import java.util.Scanner;

public class Main9103 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();		
		int result = recursive(num);
		System.out.println(result);
	}
	
	
	public static int recursive(int num) {
		if(num <= 1) {
			return 1;
		} else {
			return num * recursive(--num);
		}
		
	}
	

}
