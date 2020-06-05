package com.test01;

public class Mtest {

	public static void main(String[] args) {
		AA a = new AA();
		Super s = a;
		//BB b = (BB)s;  --> AA객체와 BB객체는 엄연히 다르다. 
		
		System.out.println(a.hashCode());
		System.out.println(s.hashCode());

	}

}
