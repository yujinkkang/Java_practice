package com.test02;

public class Mtest02 {
	
	
	public static void main(String[] args) {
		prn();
		
	}
	
	public static void prn() {
		int i = 0;
		
		while(i<=10) {
			i++;
			if(i%2 == 0) {
				continue;
				// 내밑에 있는 거 하지 말고 처음부터 해라.
			}
			System.out.println(i);
		}
	}

}
