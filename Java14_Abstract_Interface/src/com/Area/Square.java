package com.Area;

import java.util.Scanner;

public class Square extends Arealmpl {

	public Square() {

	}

	@Override
	public void make() {
		System.out.println("반지름을 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int str = sc.nextInt();
		double result = (double)(str*str)/2;

	}

	public void print() {

	}

}
