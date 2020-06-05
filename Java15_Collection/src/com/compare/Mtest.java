package com.compare;

import java.util.Arrays;

public class Mtest {
	public static void main(String[] args) {
		Score[] students = new Score[3];
		
		students [0] = new Score("강유진",80, 33,90);
		
		students [1] = new Score();
		students[1].setName("정은주");
		students[1].setKor(100);
		students[1].setEng(79);
		students[1].setMath(88);
		
		Score sc = new Score("김영선", 100, 98, 97);
		students [2] = sc;
		
		for(Score tmp:students) {
			System.out.println(tmp);
		}
		
		Arrays.sort(students);
		System.out.println("------------");
		for(Score tmp: students) {
			System.out.println(tmp);
		}
	}

}
