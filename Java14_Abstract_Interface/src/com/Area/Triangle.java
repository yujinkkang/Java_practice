package com.Area;

import java.util.Scanner;

public class Triangle extends Arealmpl{

	public Triangle() {
		
	}
	@Override
	public void make() {
		System.out.println("밑변을 입력해 주세요: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("높이를 입력해 주세요 : ");
		int y = sc.nextInt();
		double res = (double)(x*y)/2;
		
		//setResult(Double.toString(res));
		//setResult(String.valueof(res));
		setResult(res +"");		
		
	}
	public void print() {
		System.out.print("삼각형의");
		super.print();
	}

}
