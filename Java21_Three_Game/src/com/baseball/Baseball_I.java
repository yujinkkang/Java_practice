package com.baseball;

import java.util.Arrays;
import java.util.Scanner;

public class Baseball_I {
	
	
	static int[] capacity = new int[3];
	static int arr[] = new int[3];

	public static void main(String[] args) {
		prn01();
		//game();
	}

	public static void prn01() {
		

		Arrays.fill(arr, -1);

		int ran = 0;

		for (int i = 0; i < arr.length; ) {
			ran = (int) ((Math.random() * 10) + 0);

			if (!isSame(arr, ran)) {
				arr[i] = ran;
				i++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static boolean isSame(int[] arr, int ran) {
		boolean same = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ran) {
				same = true;
				break;
			}
		}
		return same;
	}

	public static void input() {

		System.out.println();
		System.out.println("숫자 3개를 입력해주세요(0~9)");

		while(true) {
			try {
				System.out.println();
				Scanner sc = new Scanner(System.in);
				
				for(int i =0; i<3; i++) {
					capacity[i] = sc.nextInt();
				}
				break;
				
			} catch (Exception e) {
				System.out.println("0~9까지의 숫자를 입력하세요");
				System.out.println("--------------------");
			}
		}
	}
	/*
	public static void game() {
		
		input();
		for(int i =0 ; i<3; i++) {
			
			if(arr[i] == capacity[i]) {
				System.out.println("스트라이크!");
			//}else if(arr[i] != capacity[i]){
				//if(arr[i] == capacity[i-1] && arr[i] == capacity[i+1]) {
					//System.out.println("볼!");
				//}else {
					//System.out.println("아웃!");
				}
				
			}
		}
		
		
		
		
		
		
	}
	*/
	
	
	
	
	
	

}
