package com.test01;

import java.util.Vector;

public class VectorTest01 {
	
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(10,5);  // 기본은 10, 이후 5씩 증가, 만약 (); 이라면 기본 값은 10이고 10씩 증가한다.
		System.out.println(v.size() + " : " + v.capacity());
		System.out.println("-----------------");
		for(int i =0; i<10; i++) {
			v.add(i);
			System.out.println(v.size() + " : " + v.capacity());
		}
		System.out.println("----------------");
		v.add(10);
		System.out.println(v.size() + " : " + v.capacity()); //기본 수용량 10에서 벗어나서 +5됨
		
		
		String str = "홍길동은 강유진이다.";
		System.out.println(str.substring(0, 4));
		
		
	}

}
