/* 2차원 배열이 주어지면, 행 우선 출력하는 class*/
package com.itskb.ws01;
public class ZigZag1 {

	public static void main(String[] args) {
		int [][] intArray = 
			{
					{1, 2, 3, 4, 5},
					{6, 7, 8, 9, 10},
					{11, 12, 13, 14, 15},
					{16, 17, 18, 19, 20},
			};

		for(int i=0; i<intArray.length; i++) {
			if(i%2 == 0) {
				for(int j=0; j<intArray[i].length; j++) System.out.print(intArray[i][j]+" ");
			}else {
				for(int j=intArray[i].length-1; j>=0; j--) System.out.print(intArray[i][j]+" ");   
			}
			System.out.println();
		}
		
	}

}
