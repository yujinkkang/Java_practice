package com.coffee02;

import java.util.Scanner;

public class CoffeeMachine {
	//입력 예)
	//"돈을 넣어주세요"
	//10000
	//"커피 몇잔이 필요하신가요?"
	//1
	//"커피 1잔이 나왔습니다."
	//"잔돈은 9700원 입니다."
	
	public void inputMoney() {
		System.out.println("돈을 넣어 주세요.(한잔 당 300원)");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		
		if(money>=300) {
			coffeeMake(money);
		}else {
			System.out.println("금액이 부족합니다.");
			System.out.println("잔돈"+ money+"를 가져가세요.");
		}
			
	}
	private void coffeeMake(int money) {
		System.out.println("커피 몇잔이 필요하신가요?");
		Scanner sc = new Scanner(System.in);
		int cup = sc.nextInt();
		int change = money -(cup*300);
		
		System.out.println("커피 "+cup+"잔 나왔습니다.");
		System.out.println("잔돈은 "+change+"원 입니다.");
		
		
	}

}
