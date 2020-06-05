package com.test02;

public class TypeToType01 {

	public static void main(String[] args) {
		// 형변환
		
		//묵시적 형변환(upCasting / promotion) : 작은타입 -> 큰타입
		byte b01 = 100;
		int i01 = b01;
		System.out.println(i01);
		
		//명시적 형변환 (dowmCasting / casting) : 큰타입 -> 작은타입
		int i02 = 100;
		byte b02 = (byte)i02;
		System.out.println(b02);
	}
}
