package com.plus;

import java.util.Scanner;

public class Mtest {
	
	public static void main(String[] args) {
		//두자리 이상 숫자를 입력하면 각 자리수를 모두 더해서 리턴받아 출력하자.
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		System.out.println(plus(input));
		System.out.println(plusFor(input));
		System.out.println(plusWhile(input));
	}
	
	
	public static int plusFor(int i) {
		
		int sum = 0;
		
		for(int target = i; target>0; target/=10) {
			sum += target%10;
		}
		
		return sum;
	}
	
	public static int plusWhile(int i) {
		
		int sum =0;
		int target = i;
		
		while(target>0) {
			sum += target%10;
			target/=10;
		}
		return sum;
	}
	
	public static int plus(int i) {
		
		int a = (i/1000)%100;
		int b = (i/100)%10;
		int c = (i/10)%10;
		int d = (i/1)%10;
		
		return a+b+c+d;
	}

}

//5678