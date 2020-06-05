package com.test02;

public class MyException extends Exception{

	public MyException() {
		this("Exception Test!"); //파라미터 하나짜리 생성자 호출
	}
	
	public MyException(String message) {
		super(message);       //부모에게 전달
	}
}
