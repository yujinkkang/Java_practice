package com.test02;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
	public static void main(String[] args) {
		List<String>list = new ArrayList<String>();
		list.add("홍길동");
		list.add("이순신");
		list.add("강호동");
		list.add("유재석");
		list.add("신동엽");
		list.add("조세호");
		
		//prn(list);
		transElement(list);
	}

	private static void transElement(List<String> list) {
		//1. 홍길동을 김길동으로 바꾸자
		list.set(list.indexOf("홍길동"), "김길동");
				
		prn(list);
		System.out.println();
		
		
		
		//2. "신"으로 끝나는 객체를 찾아서,
		//    만일 있다면 "신"을 "자"로 바꾸자.
		
		for(String s: list) {
			if(s.endsWith("신")) {
				System.out.print(s.replace("신", "자")+" ");
			}else {
			System.out.print(s+ " ");
			}
		}
		
		
		//3. "호"로 끝나는 객체를 찾아서,
		//    만일 있다면 삭제하자.
		for(int i =0; i<list.size(); i++) {
			if(list.get(i).endsWith("호")) {
				list.remove(i);
				
			}
			
		}
		prn(list);
		
		
	}

	public static void prn(List<String> list) {
		
		for(String s: list) {
			System.out.print(s +"\t");
		}
		System.out.println();
		
		//{이름, 이름, 이름}
		//System.out.println(list);
		
		
			System.out.print("{");
			for(int i =0; i<list.size(); i++) {
				if(i<list.size()-1) {
					System.out.print(list.get(i) +", ");
				}else {
					System.out.print(list.get(i)+"}");
				}
			}
		}
		
	

}
