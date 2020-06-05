package com.baseball;

public class Print {

	static String START = "게임을 시작합니다!";
	static String ING_PRE = "[";
	static String ING_POST = "번째 도전]";
	
	static String WIN = "맞추셨습니다!! 축하드려요";
	static String LOSE_PRE = "아쉽네요..목표했던 숫자는 ";
	static String LOSE_POST = "입니다...";
	
	static String ERROR = "예상치 못한 상황으로 인해,게임이 종료됩니다.";
	
	static String END = "게임이 끝났습니다. \n 다시 시작할까요?(y/n)";
	static String BYE = "수고하셨습니다.";
	
	static void strikePrn(int[] output) {
		if(output[2]== 3) {
			System.out.println("OUT");
		}else {
			System.out.printf("%d strike %d ball!\n", output[0], output[1]);
		}
	}
			
}
