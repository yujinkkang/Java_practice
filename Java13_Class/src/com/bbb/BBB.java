package com.bbb;

import com.aaa.AAA;

public class BBB extends AAA {
	//field
	private int b;
	
	public BBB() {
		// super(); // 부모의 생성자를 명시하지 않는 경우, 부모의 기본 생성자를 자동호출
		// -> public AAA()
		System.out.println("BBB() 생성");
	}
	public BBB(int b) {
		super(b); //부모의 생성자 -> public AAA(int abc)
		this.b = b;
		System.out.println("BBB(int b) 생성");
	}
	public BBB(int abc, int b) {
		super(abc); //부모의 생성자 -> public AAA(int abc)
		this.b = b;
		System.out.println("BBB(int abc, int b) 생성");
	}
	
	//getter & setter
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getSum() {
		//super: 부모의 객체--->super.을 지워도 가능, 상속받은 경우에 this.을 지워도 마치 내것처럼 사용 가능
		//this: 나 객체
		int sum = super.getAbc() + this.getB();
		return sum;
	}
	
	public void prn() {
		System.out.println("BB의 prn 메서드");
	}
	
	
}
