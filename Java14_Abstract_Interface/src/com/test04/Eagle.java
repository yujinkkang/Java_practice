package com.test04;

public class Eagle extends Animal implements Bird {

	//class는 한개만 상속가능, Interface는 상관없음 (다이아몬드 상속)-> 자바의 경우에만
	@Override
	public void fly() {
		System.out.println("파닥파닥");

	}

	@Override
	public void bark() {
		System.out.println("피오오오오");

	}

}
