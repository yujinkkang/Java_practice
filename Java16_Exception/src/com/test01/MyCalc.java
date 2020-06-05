package com.test01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyCalc {
	
	public int inputNum() {
		
		int n = 0;
		
		System.out.println("숫자만 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		return n;
		
	}
	
	public int calculation() {
		int res = 0;
		
		while(true) {
			try {
				res = inputNum()/ inputNum();

				String a = "10";
				int i = Integer.parseInt(a);
				
				
				System.out.println(res);
				break;
			}catch(InputMismatchException e) {
				System.out.println("숫자 입력 에러");
				//e.printStackTrace();  //-> stack구조로 보여주겠다. 어디서 에러가 났는지 알려주는 표시  Stack은 LIFO
			}catch(NumberFormatException e){
				System.out.println("숫자 변환 에러");
				//e.printStackTrace();
			}finally {
				System.out.println("----------");
			}
		}
		return res;
	}

}
