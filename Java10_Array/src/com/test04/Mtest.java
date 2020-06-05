package com.test04;

public class Mtest {
	
	/*
	 * 1.5칸짜리 int형 1차원 배열을 만들자.
	 * 2.  반복문을 사용하여, 해당 배열의 앞에서 4개에 
	 * 	5~9사이의 랜덤한 숫자를 각각 대입하자.
	 * 3. 배열의 5번째 위치한 인덱스에 앞의 4개의 모든 값들을 곱해서 저장하자.
	 * 4. 배열을 출력하자.
	 * 5. 배열안의 모든 값을 더해서 출력하자.
	 */
	public static void main(String[] args) {
		prn01();
	}
	
	public static void prn01() {
		
		int [] arr = new int[5];
		
		int gob =1;
		int sum =0;
		
		for(int i =0; i<4; i++) {
			int r = (int)(Math.random()*5)+5;
			System.out.print(r +" ");
			gob *= r;
			sum += r;
		}
		System.out.println(gob);
		System.out.println();
		System.out.println(gob+sum);
		
	}

}
