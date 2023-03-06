package com.itskb.ws02;

public class EvenOddSm {

	public static void main(String[] args) {
		int[][] numArr = {
				{1,2,5,7,3,4},
				{3,1,9,8,4,5},
				{6,2,4,6,2,8},
				{9,7,4,3,7,8},
				{2,3,4,8,4,6},
				{4,6,2,3,7,8}
		};
		int sum =0;
		int cnt =0;
		
		int dx[] = {1,-1,0,0};
		int dy[] = {0,0,1,-1};
		
		for(int i=0; i<numArr.length; i++) {
			for(int j=0; j<numArr[0].length; j++) {
				int tmp = 0;
				
				for(int k=0; k<4; k++) {
					
					int nx = i + dx[k];
					int ny = j + dy[k];
					
					if(nx < 0 || nx >= numArr.length) {
						continue;
					}
					if(ny < 0 || ny >= numArr[0].length) {
						continue;
					}
					tmp += numArr[nx][ny];	
					System.out.println(tmp + ":tmp " + numArr[nx][ny] +":numArr[nx][ny] "+ nx +":nx " + ny + ":ny ");
				}
				System.out.println();
				
				if(tmp% 2 == 0) {
					sum += tmp;
					System.out.println(tmp + " " + sum);
				}
				System.out.println();
				
			
			}
		}
		
		System.out.println(sum);
		System.out.println(cnt);

	}

}
