package com.test02;

public class Season {
	
	//Season class를 만들자.(com.test02에)
			// 어디서나 접근 가능하고, static 영역에 생성되고,
			// int형 파라미처 하나 받아서 String 값을 리턴하는
			// getSeason 이라는 메소드를 만들자.
			// getSeason 메소드 안에서는,
			// 파라미터로 받은 숫자가 12, 1, 2라면 "겨울"
			// 3,4,5 라면 "봄"
			// 6,7,8 라면 "여름"
			// 9,10,11라면 "가을"
			// 을 리턴하도록 명령문을 작성하자.
	
	public static String getSeason(int i) {
		String res = null;
		
		
		switch(i){
			case 1:
			case 12:
			case 2:
				res = "겨울";
				break;
			case 3:		
			case 4 :
			case 5 :
				res = "봄";
				break;
			case 6 :	
			case 7 :
			case 8 :
				res = "여름";
				break;
			case 9 :	
			case 10 :
			case 11 :
				res = "가을";
				break;
				
			
		}
		
		return res;
		
	}
	
	
	
	
}
	


