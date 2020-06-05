package com.generic;
//generic: 컬렉션 안에 들어가는 값을 강제한다
//                 의도치 않는 에러를 방지하기 위해서

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MTest {

	public static void main(String[] args) {
		
		/*
		List<Integer> list = new ArrayList<Integer>();
		//list.add("1");
		list.add(2);
		//list.add('c');
		list.add(null);
		list.add(3);
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		*/
		
		Emp<String> samsong = new Emp<String>();
		samsong.setEname("홍길동");
		samsong.setEmpno("dev0015");
		
		Emp<Integer> ig = new Emp<Integer>(19019, "이순신");
		
		Emp dhit = new Emp("abcd", "김선달");
		
		System.out.println(samsong);
		System.out.println(ig);
		System.out.println(dhit);
				
		
		
	}
}
