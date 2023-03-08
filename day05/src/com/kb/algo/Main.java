package com.kb.algo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		//1. 키보드 입력
		Scanner sc = new Scanner(System.in);
		
		//2. 파일 입력
		Scanner sc1 = new Scanner(new File("input.txt")); // 프로젝트 폴더 안에 input.txt 있어야함 10 20 30 40 50 
		
		int num1 = sc1.nextInt();
		int num2 = sc1.nextInt();
		
		System.out.println(num1 + " " + num2);  // 10 20
		
		
		//3. 파일 입력
		System.setIn(new FileInputStream("input.txt"));		
		Scanner sc2 = new Scanner(System.in);	// FileInputStream때문에 이렇게 해줘도 파일입력 받음
		int num3 = sc2.nextInt();
		int num4 = sc2.nextInt();
		
		System.out.println(num3 + " " + num4);  // 10 20
		
		//4. 파일 읽기
		// Scanner 과정 0.5초 아껴야할 때 구현해야함
		FileInputStream fis = new FileInputStream("input.txt");  // file에서 8bit씩 읽어옴 -> 16bit로 바꿔줘야함
		InputStreamReader isr = new InputStreamReader(fis); 	// 8bit -> 16bit 변환 역할
		BufferedReader br = new BufferedReader(isr);	// 입출력 속도 차이를 위해 버퍼를 제공
		
//		BufferedReader br = new BufferedReader(
//										new InputStreamReader(
//												new FileInputStream("input.txt")));
		
		String data = br.readLine();
		System.out.println(data);
		String[] d = data.split(" ");
		
		int[] sd = new int[d.length];
		for(int i=0; i<d.length; i++) {
			sd[i] = Integer.parseInt(d[i]);
		}
		
		System.out.println(Arrays.toString(sd));
	}

}
