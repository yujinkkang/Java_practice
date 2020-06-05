package com.make;

import java.util.Scanner;

public class Mine {

	private int size;
	private String[][] arr;

	public Mine() {
		size = 10;
	}

	public Mine(int size) {
		this.size = size;
	}

	public String[][] make() {
		arr = new String[size][size];

		fillTheZero();
		randomMine();
		cntMine();

		return arr;
	}

	private void fillTheZero() {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = "0";
			}
		}
	}

	private void randomMine() {

		int cnt = size;

		while (cnt != 0) {
			int ranX = (int) (Math.random() * size);
			int ranY = (int) (Math.random() * size);

			if (!arr[ranX][ranY].equals("*")) {
				arr[ranX][ranY] = "*";
				cnt--;
			}
		}
	}
	
	
	private void cntMine() {
		for(int i =0; i<arr.length;i++) {
			for(int j =0; j<arr.length;j++) {
				if(!arr[i][j].contentEquals("*")) {
					arr[i][j] = String.valueOf(count(i,j));
				}
			}
		}
	}
	private int count(int x , int y) {
		int cnt =0;
		for(int i = x-1; i<=x+1 ; i++) {
			for(int j = y-1; j<=y+1; j++) {
				if(i<0||j<0) {
					continue;//(그냥 넘어가라)
				}
				if(i>arr.length-1 || j>arr.length-1) {
					continue;
				}
				if(arr[i][j].equals("*")) {
					cnt++;
				}
			}
		}
		
		
		return cnt;
	}

	public void prn() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.printf("%3s", arr[i][j]);
			}
			System.out.println();
		}
	}

	/*
	public void findMine(int i, int j) {
	
		System.out.println("폭탄이 없는 곳을 찾으시오!");
		Scanner sc = new Scanner(System.in);
		System.out.println("i입력(0~9)");
		i =sc.nextInt();
		System.out.println("j입력(0~9)");
		j =sc.nextInt();
		
		
		int cnt =0;
		
		if (arr[i][j] == "0") {
			for (int k = i - 1; k < i + 2; k++) {
				for (int q = j - 1; q < j + 2; q++) {
					if(arr[k][q]=="*") {
						cnt++;
					}
				}
			}
			
			System.out.println("주위에 "+cnt +" 개 의 폭탄 존재");
		}else if(arr[i][j] == "*") {
			System.out.println("여긴 폭탄존!!! 게임끝!!");
		}
	}
	*/

}
