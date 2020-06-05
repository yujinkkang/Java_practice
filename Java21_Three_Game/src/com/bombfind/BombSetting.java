package com.bombfind;

import java.util.Scanner;

public class BombSetting {

	public static void main(String[] args) {
		coordinate();
		// bombset();
	}

	public static void coordinate() {

		String[][] arr = new String[10][10];

		String[] bomb = new String[10];

		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				arr[i][j] = " 0 ";
				// System.out.print(arr[i][j] + " ");
			}
			// System.out.println();
		}

		for (int i = 0; i < 10; i++) {
			bomb[i] = " * ";

		}

		for (int i = 0; i < 10; i++) {
			arr[(int) (Math.random() * 10)][(int) (Math.random() * 10)] = bomb[i];
		}

		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		

		int i = 0;
		int j = 0;

		System.out.println("폭탄이 없는 곳을 찾으시오!");
		Scanner sc = new Scanner(System.in);
		System.out.println("i입력(0~9)");
		i = sc.nextInt();
		System.out.println("j입력(0~9)");
		j = sc.nextInt();

		int cnt = 0;

		if (arr[i][j] == " 0 ") {
			for (int k = i - 1; k < i + 2; k++) {
				for (int q = j - 1; q < j + 2; q++) {
					if (arr[k][q] == " * ") {
						cnt++;
					}
				}
			}

			System.out.println("주위에 " + cnt + " 개 의 폭탄 존재");
		} else if (arr[i][j] == " * ") {
			System.out.println("여긴 폭탄존!!! 게임끝!!");
		}

	}

	/*
	 * public static void bombset() {
	 * 
	 * for(int i =0; i<=9;i++) { for(int j =0; j<=9; j++) { arr[i][j] =(i*10)+j+1;
	 * System.out.print(arr[i][j]+" "); } System.out.println(); }
	 * 
	 * }
	 */

}
