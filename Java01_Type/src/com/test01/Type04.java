package com.test01;

public class Type04 {

	// 문자형, 문자열, 논리형
	public static void main(String[] args) {
		
		// 문자형 ' '
		char c01 = 'a';
		System.out.println(c01);
		char c02 = 'b';
		char sumC = (char) (c01 + c02);
		System.out.println(sumC);
		
		// 문자열 " "
		String s01 = "a";
		String s02 = "bc";
		String sumS = s01+ s02;
		System.out.println(sumS);
		
		// unicode 도 가능
		char lastName = '\uac15';
		System.out.println(lastName);
		String firstName = "\uc720\uc9c4";
		System.out.println(firstName);
		
		System.out.println("------------------");
		
		boolean b101 = true;
		boolean b102 = false;
		System.out.println(b101);
		System.out.println(b102);
		
		
		
	}
}
