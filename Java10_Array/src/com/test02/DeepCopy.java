package com.test02;

import java.util.Arrays;

//깊은 값복사
// 새로운 객체가 된 복사본을 변경해도 원본에 영향 없음.
public class DeepCopy {
	
	public static void main(String[] args) {
		
		int[] original = {10,20,30,40,50};
		
		//방법 1. 배열 인덱스의 값을 가져와서 복사
		int[] copyOne = new int[original.length];
		for(int i = 0 ; i<original.length; i++) {
			copyOne[i] = original[i];
		}
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copyOne));
		System.out.println(original == copyOne);
		
		copyOne [0] = 100;
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copyOne));
		System.out.println("-------------------");
		
		//방법 2. original한테 요청하여 복사
		int []copyTwo = original.clone();
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copyTwo));
		System.out.println(original == copyTwo);
		System.out.println("--------------------");
		
		//방법 3. System을 사용하여 복사
		//System.arrayCopy(원본 배열 객체, 원본 시작위치, 복사 배열 객체, 복사 시작위치, 복사 갯수);
		int [] copyThree = new int[5];
		Arrays.fill(copyThree, 4);
		System.out.println(Arrays.toString(copyThree));
		System.arraycopy(original, 0, copyThree,2,2);
		// 10 20 30 40 50
		// 4 4 10 20 4
		System.out.println(Arrays.toString(copyThree));
		System.out.println("---------------------");
		
		System.out.println(original.hashCode());
		System.out.println(copyOne.hashCode());
		System.out.println(copyTwo.hashCode());
		System.out.println(copyThree.hashCode());
		
		
	}

}
