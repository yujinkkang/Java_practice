package com.coffee03;

import java.util.Scanner;

public class CoffeeMachine {

	// 입력 예)
	// "일반커피/고급커피 선택해 주세요"
	// "일반커피 : 1/ 고급커피: 2"
	// 2
	// "돈을 넣어주세요"
	// 10000
	// "커피 몇잔이 필요하신가요?"
	// 3
	// "커피 1잔이 나왔습니다."
	// "잔돈은 9700원 입니다."

	public static void type() {
		System.out.println("일반커피(1) / 고급커피(2) 선택해 주세요");
		Scanner sc = new Scanner(System.in);
		int type = sc.nextInt();
		if (type == 1) {
			inputMoneyNormal();

		} else if (type == 2)
			inputMoneyClass();

	}

	public static void inputMoneyNormal() {
		System.out.println("돈을 넣어 주세요");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();

		if (money >= 300) {
			System.out.println("커피 몇잔이 필요하신가요?");
			int count = sc.nextInt();
			coffeeMakeNormal(money,count);
		} else if (money < 300) {
			System.out.println("금액이 부족합니다.");
			System.out.println("잔돈을 가져가세요.");
		}

	}

	public static void inputMoneyClass() {
		System.out.println("돈을 넣어 주세요");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();

		if (money >= 500) {
			System.out.println("커피 몇잔이 필요하신가요?");
			int count = sc.nextInt();
			coffeeMakeClass(money,count);
		} else if (money < 500) {
			System.out.println("금액이 부족합니다.");
			System.out.println("잔돈을 가져가세요.");
		}

	}

	private static void coffeeMakeNormal(int money, int count) {
		System.out.println("커피 몇잔이 필요하신가요?");
		int change = money -(count*300);
		
		if(change>=0) {
			System.out.println("일반커피 "+count+"잔이 나왔습니다.");
			System.out.println("잔돈은 "+ change +"원 입니다.");
		}else {
			System.out.println("금액이 부족합니다.");
			System.out.println("잔돈은 "+money+"원 입니다.");
		}

	}

	private static void coffeeMakeClass(int money, int count) {
		
		System.out.println("커피 몇잔이 필요하신가요?");
		int change = money -(count*500);
		
		if(change>=0) {
			System.out.println("고급커피 "+count+"잔이 나왔습니다.");
			System.out.println("잔돈은 "+ change +"원 입니다.");
		}else {
			System.out.println("금액이 부족합니다.");
			System.out.println("잔돈은 "+money+"원 입니다.");
		}
	}

}
