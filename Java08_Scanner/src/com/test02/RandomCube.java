package com.test02;

import java.util.Random;

public class RandomCube {
	
	
	/*1. 5*5 숫자를 출력하자. (0~9 사이의 랜덤한 숫자 하나하나를)
	 *2. 만들어진 전체 숫자의 평균을 출력하자
	 */
	public static void main(String[] args) {
		prn01();
		cube();
	}
	
	public static void prn01() {
		int max =9;
		int min =0;
		int sum =0;
		
		for(int i =0; i<5; i++ ) {
			for(int j =0; j<5;j++) {
				int r = (int)(Math.random()*(max- min +1)) + min;
				sum+=r;
				System.out.printf("%3d",r);
				
			}
			System.out.println();
			
				
		}
		System.out.println("평균:" +((double)sum/25));
			
			
	}
	
	public static void cube() {
		
		int sum = 0;
		
		for(int i =0; i<5; i++) {
			for(int j =0; j<5; j++) {
				int r = (int)(Math.random() * 10);
				System.out.printf("%2d",r);
				sum += r;
			}
			System.out.println();
		}
		System.out.println("평균:" +((double)sum/25));
	}
		
}


