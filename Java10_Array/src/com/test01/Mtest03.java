package com.test01;

public class Mtest03 {
	//1. a~z의 값을 일차원 배열에 저장하고
	//다음과 같이 출력하자.
	/*
	 *  a b c d e f
	 *  g h i j k l 
	 *  m n o p q r
	 *  s t u v w x
	 *  y z
	 */
	
	//2. 위에서 만든 배열을 거꾸로 출력하자.
	/*
	 * z y x w v u
	 * t s r q p o
	 * ...
	 */
	
	//3. 1번에서 만든 배열을 대문자로 바꿔서 출력하자.
	public static void main(String[] args) {
		test01();
		
	}
	
	public static void test01(){
		char [] alphabet= {'a','b','c','d','e','f',
							'g','h','i','j','k','l',
							'm','n','o','p','q','r',
							's','t','u','v','w','x',
							'y','z'};
		//1번
		for(int i = 0; i<alphabet.length; i++) {
			if(i%6==0) {
				System.out.println();
			}
			System.out.print(alphabet[i]+ " ");
		}
		System.out.println();
		System.out.println();
		
		//2번
		for(int i =25; i>0; i--) {
			if(i%6==0) {
				System.out.println();
			}
			System.out.print(alphabet[i]+ " ");
		}
		System.out.println();
		
		//3번
		alphabet [0] = 'A';
		for(int i =0; i<alphabet.length; i++) {
			if(i%6==0) {
				System.out.println();
			}
			alphabet[i] = alphabet[0]++;
			System.out.print(alphabet[i]+" ");
		}
		
		
		
	}
	
	

}