package com.kb.arr;

public class Test2 {

	static int[] su = {34,13,15,73,227,74,90,682,1,-33};
	
	public static void main(String[] args) {
		
		int cnt = su.length;
		int sum = total(su);
		int m = max(su);
		double a = avg(su);
		double d = diff(su);
		
		System.out.println("평균은 "+ sum/cnt + "점 입니다.");
		

	}
	
	
	public static int total(int[] arr) {
		int sum = 0;
		for(int a : arr) {
			sum += a;
		}
		System.out.println("총점은 "+ sum+"점 입니다.");
		
		return sum;
	}
	
	
	public static int max(int[] arr) {
		int max = -100000000;
		for(int a : arr) {
			if(max <a) {
				max = a;
			}
		}
		System.out.println("MAX값은 "+max +"입니다.");
		return max;
	}
	
	public static double avg(int[] arr) {
		double sum = total(arr);
		int cnt = arr.length;
		double avg = sum/cnt;
		
		System.out.println("평균은 "+avg+"입니다.");
		return avg;
		
	}
	
	
	public static double diff(int[] arr) {
		double av = avg(arr);
		double maxDiff = -1000000000;
		int maxDiffIdx = -1;
		
		for(int i =0; i<arr.length; i++) {
			double d = Math.abs(av-arr[i]);
			if(maxDiff < arr[i]) {
				maxDiff = arr[i];
				maxDiffIdx = i;
			}
		}
		
		System.out.println("편차가 가장 큰 값의 위치는 " + maxDiffIdx +"이며, 그 값은 " + maxDiff + "입니다.");
		return maxDiff;
	}

}
