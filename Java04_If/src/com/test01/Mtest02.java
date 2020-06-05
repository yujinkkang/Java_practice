package com.test01;

public class Mtest02 {

	public static void main(String[] args) {
		/*
		 * 1. 아규먼트가 5의 배수이면 "5의 배수입니다."라고 출력하는 메서드를 만들자.
		 * 2. 아규먼트가 2의 배수이면서 3의 배수이면
		 * 		"2와 3의 배수입니다."를 출력하고, 아니면
		 * 		"2와 3의 배수가 아닙니다."를 출력하는 메소드를 만들자.
		 * 3. 아규먼트가 소문자라면 "소문자 입니다." 를 출력하고,
		 * 		대문자라면 "대문자 입니다."를 출력하는 메소드를 만들자.
		 * 
		 * 4. 메소드 3개를 호출하자(test01, 02, 03)
		 */
		a(11);
		b(7);
		c('A');
	}
	
	public static void a(int i) {
		if(i%5==0) {
			System.out.println("5의 배수입니다.");
		}	
	}
		
	public static void b(int i) {	
		if((i%2 ==0) && (i%3==0)) {
			System.out.println("2와 3의 배수입니다.");
		}else {
			System.out.println("2와 3의 배수가 아닙니다.");
		}
	}
	
	public static void c(char i) {
		//java.lang.Character
		//boolean isLowerCase
		if(Character.isLowerCase(i)) {
			System.out.println("소문자 입니다.");
		}else if(Character.isUpperCase(i)) {
			System.out.println("대문자 입니다.");
		}
		//ascii
		
		if(((int)i >= 97) && ((int)i<=122)){
			System.out.println("소문자 입니다.");
		}else if(((int)i >= 65)&& ((int)i <=90)) {
			System.out.println("대문자 입니다.");
		}
		
		
		
	}
}
