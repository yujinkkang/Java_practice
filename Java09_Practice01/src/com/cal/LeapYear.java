package com.cal;

import java.util.Scanner;

//ctrl+shift_f
public class LeapYear {
	/*
	 * 즉, ① 서력 기원 연수가 4로 나누어 떨어지는 해는 우선 윤년으로 하고, ② 그 중에서 100으로 나누어 떨어지는 해는 평년으로 하며,
	 * ③ 다만 400으로 나누어 떨어지는 해는 다시 윤년으로 정하였다.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		for (int i = 2000; i <= 2020; i++) {
			if (isLeapYear(i)) {
				System.out.println(i + "년도는 윤년이 맞습니다.*");
			} else {
				System.out.println(i + "년도는 윤년이 아닙니다.");
			}
		}

	}

	public static boolean isLeapYear(int year) {

		boolean leap = false;

		if ((year % 4 == 0) && (year % 400 != 0) || (year % 400 == 0)) {
			leap = true;
		}
		return leap;
	}
}
