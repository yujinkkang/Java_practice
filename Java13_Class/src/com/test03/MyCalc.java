package com.test03;

public class MyCalc {
	//오버로딩 : 같은 이름으로 다른일을 한다. 그런데 멀리서 보면 같은 일을 하고 있다.
	//오버로딩은 파라미터 갯수, 파라미터 타입이 달라야한다.  ex) ArraytoStirng()
	public int sum(int i , int j) {
		return i + j;
	}
	public double sum(double i, double j) {
		return i + j;
	}
	public int sum(int i , int j, int k) {
		return i + j + k;
	}

}
