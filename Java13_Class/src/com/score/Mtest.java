package com.score;

public class Mtest {

	public static void main(String[] args) {
		Score lee = new Score();
		lee.setName("이순신");
		lee.setKor(100);
		lee.setEng(23);
		lee.setMath(75);
		
		Score hong = new Score("홍길동", 58, 90, 17);
		
		System.out.println(lee);
		System.out.println(hong);
	}

}
