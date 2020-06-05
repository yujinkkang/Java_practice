package com.cal;

import java.util.Scanner;

// 연 월 일 입력하면 -> ?년 ?월 ?일은 ?요일입니다. 출력
// 달력 만들기
public class DayOfCalendar {

	// 윤년 계산
	public static boolean isLeapYear(int year) {
		boolean leap = false;
		
		if((year % 4 ==0)&&(year %100 !=0)||(year %400 ==0)) {
			leap = true;
		}
		
		return leap;
	}
	
	// 일수 계산(year, month):int
	public static int dates(int year, int month) {
		int res = 0;
		
		if(isLeapYear(year)) {
			switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				res =31;
				break;
			case 4: case 6: case 9: case 11:
				res =30;
				break;
			case 2: 
				res =29;
				break;
			}
		}else {
			
			if(month == 1 || month ==3 || month ==5 || month ==7||
					month == 8|| month ==10|| month == 12){
				res = 31;
			}else if(month == 4 || month ==6 || month ==9 || month ==11) {
				res = 30;
			}else if(month ==2) {
				res = 28;
			}
			
		}
		
		return res;
	}
	// 요일 계산
	public static void main(String[] args) {
		// 총 일수의 합 (0001.01.01~year.month.day)
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("연도 입력: ");
		int year = sc.nextInt();
		System.out.println("월 입력: ");
		int month = sc.nextInt();
		System.out.println("일 입력: ");
		int day = sc.nextInt();
		
		//1.1.1.~ year - 1.12.31
		for(int i =1; i<year; i++) {
			for(int j =1; j<=12;j++) {
				sum+= dates(i,j);
			}
		}
		//year.1.1 ~year.month -1.last
		for(int i =1; i<month; i++) {
			sum += dates(year,i);
		}
		
		//+days
		sum += day;
		
		
		// 총합 %7 = 0(일)~6(토)
		System.out.printf("%d년 %2d월 %2d일은 %s 입니다."
				,year,month,day,dayMode(sum%7));
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