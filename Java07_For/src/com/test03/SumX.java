package com.test03;

public class SumX {
	public static void main(String[] args) {
		sumX();
		prn();
	}
	/*
	 * 1  2  3  4  5
	 * 6  7  8  9  10
	 * 11 12 13 14 15
	 * 16 17 18 19 20
	 * 21 22 23 24 25
	 * X의 총합
	 * X의 평균
	 */
	public static void sumX() {
		int sum =0;
		double avg =0;
	
		for(int i= 1; i<26; i+=6) {
			sum += i;
		}
		for(int j=5; j<22; j+=4) {
			sum += j;
		}
		int rsum= sum-13;
		System.out.println(rsum);
		avg=rsum/9;
		System.out.println(avg);
	}
	
	public static void prn() {
		// 행렬을 생각하라
		int count = 1;
		int sum = 0;
		
		for(int i =0; i<5;i++) {
			for(int j =0; j<5;j++) {
				
				if((i==j)||(i+j==4)) {
					sum += count;
				}
				System.out.printf("%3d", count++);
			}
			System.out.println();
		}
		System.out.println("총합:"+sum);
		System.out.println("평균:"+sum/9.0);
	}
	

}
