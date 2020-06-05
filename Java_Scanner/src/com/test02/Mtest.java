package com.test02;

import java.util.Random;

public class Mtest {

	public static void main(String[] args) {
		random01();
		random02();
		random03();

	}
	
	public static void random01() {
		double d = Math.random();
		System.out.println(d);
		// 0.0 <= Math.random() <1.0
	}
	
	public static void random02() {
		//(int)(Math.random()*(max- min +1)) + min;
		//(int)(Math.random()*갯수) + 시작값;
		int max =10;
		int min = 5;
		int r = (int)(Math.random()*(max- min +1)) + min;
		System.out.println(r);
	}
	public static void random03() {
		Random r = new Random();
		System.out.println(r.nextInt(6) + 5);
		//5부터 10사이
		
	}

}
