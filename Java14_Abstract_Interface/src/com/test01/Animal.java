package com.test01;

//추상 클래스: 추상 메서드를 하나 이상 가진 클래스
//new 사용 불가(객체 생성 안됨)
public abstract class Animal {
	//추상 메소드: 상속받는 자식 클래스에서 반드시 구현하도록 강제!
	//                   (상속받는 클래스가 반드시 구현!)
	//body{ } 없다.
	public abstract void bark();
	
	public void eat(String feed) {
		System.out.println(feed+" 먹는다.");
	}
	

}
