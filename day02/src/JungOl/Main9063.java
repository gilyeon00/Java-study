package JungOl;

import java.util.*;

public class Main9063 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		for(int i=0; i<5; i++) {
			int n = sc.nextInt();
			arr[i] = n;
		}
		
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}
