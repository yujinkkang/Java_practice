package com.test02;

import java.util.ArrayList;
import java.util.List;

public class ListTest03 {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		// list는 순서가 있고 중복이 가능하다.
		
		list.add("홍길동");
		list.add("김길동");
		list.add("신길동");
		list.add("김길동");
		list.add("박길동");
		
		System.out.println(list);
		
		
		
		
	}

}
