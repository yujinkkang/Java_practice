package com.test03;

public class Score {
	// Score 클래스를 완성하자.
			// getAvg 메소드는 , 국어 영어 수학 점수를 전달하면
			// 평균을 리턴해준다.
			// getGrade 메소드는, 평균을 전달하면
			/*
			 * 90~ 100 : A
			 * 80~ 89 :B
			 * 70~79: C
			 * 60~69: D
			 * 0~59: F를 리턴해준다.
			 * 
			 * "ㅁㅁㅁ님의 평균은 xx.xx점 이고, 등급은 'ㅁ'입니다." 라고 출력
			 */

	public double getAvg(int kor, int eng, int math) {
		return (kor + eng + math)/3.0;
		 
	}
	
	
	public String getGrade(double avg) {
		
		switch ((int)avg/10) {
			case 10:
			case 9 :
				return "A";
			case 8:
				return "B";
			case 7:
				return "C";
			case 6:
				return "D";
			default :
				return "F";
		}

		
	}
	
	
}
