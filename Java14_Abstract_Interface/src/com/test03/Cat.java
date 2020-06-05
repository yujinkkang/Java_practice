package com.test03;

// class -> class : extends
// class -> interface : implements
// interface -> interface : extends
public class Cat implements Animal {

	@Override
	public void bark() {
		System.out.println("야옹");

	}

	@Override
	public void eat(String feed) {
		System.out.println("고양이가 "+ feed + " 먹는다.");

	}

}
