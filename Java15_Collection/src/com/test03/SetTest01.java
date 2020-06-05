package com.test03;

import java.util.HashSet;
import java.util.Set;
// Set은 순서가 없고 중복이 안된다. 순서가 없기에 인덱스 사용할 수 없을 것

public class SetTest01 {
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("1");
		set.add("5");
		set.add("2");
		set.add("7");
		set.add("4");
		set.add("4");
		set.add("3");
		
		System.out.println(set);
		
		setFind(set, "5");
		setDelete(set, "5");
		
	}
	
	public static void setDelete(Set<String>set, String del) {
		for(String d : set) {
			if(d.equals(del)) {
				set.remove(del);
				System.out.println(d + " 지웠다!");
				break;
			}
		}
		
	}
	
	public static void setFind(Set<String>set, String find) {
		for(String f: set) {
			if(f.equals(find)) {
				System.out.println(f + " 찾았다!");
			}
		}
	}

}
