package com.baseball;

import java.util.InputMismatchException;
import java.util.Scanner;

public class User {
	//입력받는다. (숫자 3개를)
	
	private int[] inputArr;
	private int size;
	
	public User() {
		size =3;
		inputArr = new int[size];
		
	}
	public User(int size) {
		this.size = size;
		inputArr = new int[size];
	}
	
	public int[] input() {
		System.out.println(size + "개의 숫자를 입력해주세요.");
		System.out.println("각 숫자는 공백으로 구분해 주세요. (ex.1 2 3)");
		
		while(true) {
			try {
				Scanner sc = new Scanner(System.in);
				String[] input = sc.nextLine().split(" ");
				
				for(int i =0; i<input.length; i++) {
					if(input[i].length()>1) {
						throw new ArrayIndexOutOfBoundsException();
					}
					inputArr[i] = Integer.parseInt(input[i]);
				}
				
				break;
			}catch(InputMismatchException e){
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
			}catch(NumberFormatException e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
			}
		}
		
		return inputArr;
	}
	
	
	
}
