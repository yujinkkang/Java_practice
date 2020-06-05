package com.test02;

import java.util.Arrays;

public class ShallowCopy {
	//겉복사, 얕은 값 복사
	//주소값 복사 (복사본을 변경하면 원본도 변경)

	public static void main(String[] args) {
		int [] original = {10, 20, 30, 40, 50};
		int [] copy = original;
		
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copy));
		
		System.out.println(original == copy);
		
		copy[0] =100;
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copy));
		
		//hashCode : 객체의 주소값
		System.out.println(original.hashCode());
		System.out.println(copy.hashCode());
	}
}
