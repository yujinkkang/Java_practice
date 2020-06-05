package com.test01;

public class Mtest01 {

	public static void main(String[] args) {
		prn01();
		prn02(true, false);
	}
	
	public static void prn01() {
		// if : 만약 ~라면
		int i = 10;
		int j = 20;
		
		//if
		if(i<j) {
			System.out.println("i가 j보다 작아요.");
		}
		
		//if ~ else
		
		if(i>j) {
			System.out.println("j가 j보다 커요.");
		} else {
			System.out.println("i가 j보다 안커요.");
		}
		
		
		//if ~ else if ~
		if(i>15) {
			System.out.println("i가 15보다 커요.");
		}else if(i>10) {
			System.out.println("i가 10보다 커요.");
		}else if (i==10){
			System.out.println("i가 10이랑 같아요.");
		}else {
			System.out.println("i가 10보다 작아요.");
		}
		
	}
	
	
	private static void prn02(boolean ring, boolean married) {
		if(ring) {
			
			if(married) {
				System.out.println("결혼하셨군요!");
			}else {
				System.out.println("연인이 있으시군요!");
			}
			
		}else {
			if(married) {
				System.out.println("연인이 있으시군요!");
			}else {
				System.out.println("솔로시군요");
			}
		}
		
		if(ring && married) {
			System.out.println("결혼하셨군요!");
		}else if(ring || married) {
			System.out.println("연인이 있으시군요!");
		}else {
			System.out.println("솔로시군요");
		}
		
		
		if(ring) {
			System.out.println("반지 있다.");
		}
		if(married) {
			System.out.println("결혼했다.");	
			System.out.println("부럽다.");		
		}
	}
}

