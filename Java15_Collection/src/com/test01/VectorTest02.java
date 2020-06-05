package com.test01;

import java.util.Vector;

public class VectorTest02 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("홍길동");
		v.add("이순신");
		v.add("강호동");
		v.add("유재석");
		v.add("신동엽");
		v.add("조세호");
		
		//prn(v);
		//System.out.println(v);  //-> toString override 했다.
		transElement(v);
	}
	
	public static void transElement(Vector<String> v) {
		// String 메소드 사용해야 문제 풀림
		
		//1. 홍길동의 인덱스를 찾아서, 해당 인덱스에 있는 값을
		//   홍길순으로 바꾸자.
		
		/*
		for(String s: v) {
			if(s=="홍길동") {
				System.out.print("홍길순\t");
			}else {
			System.out.printf("%s\t", s);
			}
		}
		
		System.out.println();
		
		
		v.set(0, "홍길순");
		for(String s: v) {
			System.out.printf("%s\t",s);
		}
		
		
		*/
		v.set(v.indexOf("홍길동"), "홍길순");
		prn(v);
		System.out.println();
		
		
		//2. "신"으로 끝나는 객체를 찾아서,
		//    만일 있다면, "신"을 "자"로 바꾸자.
		
		/*
		System.out.println();
		
		for(int i =0; i<v.size(); i++) {
			if(v.get(i).contains("신")) {
				 System.out.print(v.get(i).replace("신", "자"));
			}else {
			System.out.print(v.get(i)+" ");
			}
		}
		*/
		
		for(int i = 0 ; i<v.size(); i++) {
			if(v.get(i).endsWith("신")) {
				v.set(i, v.get(i).replace("신","자"));
			}
		}
		prn(v);
		System.out.println();
		
		//3. "호"로 끝나는 객체를 찾아서,
		//    만일 있다면, 삭제하자.
		
		/*
		for(int i = 0; i<v.size(); i++) {
			if(v.get(i).endsWith("호")) {
				v.set(i, v.get(i).replace("호", ""));
			}
		}
		*/
		
		/*
		for(String s: v) {
			if(s.endsWith("호")) {
				v.remove(s);
				break;
			}
		}
		*/
		
		for(int i =0; i<v.size(); i++) {
			if(v.get(i).endsWith("호")) {
				v.remove(i);
			}
		}
		prn(v);
		
		
	}
	
	public static void prn(Vector<String> v) {
		//향상된 for문 (forEach)
		//for(데이터 하나하나를 담을 변수 : 덩어리(배열, 컬렉션))
		for(String s: v) {
			System.out.printf("%s\t",s);
		}
	}
}
