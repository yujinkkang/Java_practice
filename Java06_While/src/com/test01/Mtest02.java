package com.test01;

public class Mtest02 {
	public static void main(String[] args) {
		//1. 1~100까지의 숫자를 역순으로 출력하자.
		reverse();
		//2. 1~100까지의 숫자 중, 2의 배수만 출력하자.
		twice();
		//3. 1~100까지의 숫자 중, 7의 배수의 갯수와 총 합을 출력하자.
		test03();
	}
	
	public static void reverse() {
		int i = 100;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
	}
	
	public static void twice() {
		int i = 2;
		while(i<101){
			if(i%2 ==0) {
				System.out.println(i);
			}
			i++;
		}
	}
	
	public static void test03() {
		int i = 1;
		int count = 0;
		int sum = 0;
		
		while(i<101) {
			if(i%7 ==0) {
				count++;
				sum += i;
			}
			i++;
		}
		System.out.println(count);
		System.out.println(sum);
	}

}
