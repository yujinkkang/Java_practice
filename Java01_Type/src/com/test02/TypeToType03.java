package com.test02;

public class TypeToType03 {

	public static void main(String[] args) {
		// boxing : 값을 wrapper클래스에 넣는다
		Integer i = new Integer(100);
		System.out.println(i);
		
		//unboxing : wrapper class -> 값
		// 1) 명시적
		int j = i.intValue();
		System.out.println(j);
		// 2)묵시적
		int k = i;
		System.out.println(k);
		
	}
}
