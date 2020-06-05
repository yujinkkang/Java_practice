package com.cal01;

import java.util.Scanner;

public class DayOfCalendar {
	// 윤년 계산

	public static boolean isLeapYear(int year) {
		boolean leap = false;

		if ((year % 4 == 0) && (year % 100 == 0) || (year % 400 == 0)) {
			leap = true;
		}
		return leap;
	}

	// 일수 계산
	public static int dates(int year, int month) {
		int res = 0;

		if (isLeapYear(year)) {
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				res = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				res = 30;
				break;
			case 2:
				res = 29;
				break;
			}
		} else {
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				res = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				res = 30;
				break;
			case 2:
				res = 28;
				break;
			}
		}
		return res;

		// 요일 계산
	}


	public static void prn03() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력하세요. ");
		int year = sc.nextInt();
		System.out.println("월을 입력하세요. ");
		int month = sc.nextInt();
		int day = 1;
		
		int sum = 0;

		for (int i = 1; i < year; i++) {
			for (int j = 1; j < 12; j++) {
				sum += dates(i, j);
			}
		}

		for (int i = 1; i < month; i++) {
			sum += dates(year, i);
		}
		
		System.out.printf("%d년 %2d월 %2d일은 %s입니다", year,month,day,dayMode(sum%7));
		
		
	}
	
	public static String dayMode(int day) {
		switch(day) {
		case 0:
			return "일요일";
		case 1:
			return "월요일";
		case 2:
			return "화요일";
		case 3:
			return "수요일";
		case 4:
			return "목요일";
		case 5:
			return "금요일";
		case 6:
			return "토요일";
		}
		return null;
	}
	
}
