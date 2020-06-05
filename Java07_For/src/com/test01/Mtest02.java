package com.test01;

public class Mtest02 {
	
	public static void main(String[] args) {
	
		prn01();
		
	}


	public static void prn01() {
		for(int i =0; i<10; i++) {
			for(int j =0 ;  j<10; j++) {
				System.out.printf("(%d,%d)  ", i,j);
			}
			System.out.println();
		}
		
	}
	//디버그 모드
}
