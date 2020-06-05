package com.baseball;

import java.util.Arrays;
import java.util.Scanner;

public class Play extends Print{
	
	static int stage = 10;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Referee referee = new Referee();
		int[] goal;
		int[] strike;
		
		try {
			
			do {
				System.out.println(START);
				stage =10;
				// 게임 목표 설정
				goal = new Ball().getGoal();
				//System.out.println("내부목표: "+Arrays.toString(goal));
				User user = new User();
				
				do {
					System.out.println(ING_PRE + (10- stage +1)+ ING_POST);
					
					int[] input = user.input();
					strike = referee.isStrike(goal, input);
					strikePrn(strike);
					
					if(strike[0] == 3) {
						System.out.println(WIN);
						break; //while문 빠져나옴
					}
					
					
					stage--;
				}while(stage>0);
				
				if(stage == 0) {
					System.out.println(LOSE_PRE + Arrays.toString(goal) + LOSE_POST);
				}
				System.out.println(END);
				String stop = sc.next();
				if(stop.toLowerCase().contentEquals("n")) {
					break;
				}
				
				/*
				Ball ball = new Ball();
				int[] computer = ball.getGoal();
				
				for(int i =stage; i>0; i--) {
					
					User user = new User();
					Print print = new Print();
					
					print.strikePrn(referee.isStrike(computer, user.input()));
				}
				*/
				
			} while (true);
			System.out.println(BYE);
			
		} catch (Exception e) {
			System.out.println(ERROR);
		}finally {
			sc.close();
		}
		
	}

}
