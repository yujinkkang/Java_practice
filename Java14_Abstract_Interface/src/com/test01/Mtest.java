package com.test01;

public class Mtest {
	
	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal dog = new Dog();
		
		cat.bark();
		dog.bark();
		
		cat.eat("참치");
		dog.eat("뼈다귀");
		
		//추상 클래스는 객체 생성 불가!
		//Animal some = new Animal();
		 
		
	}

}
