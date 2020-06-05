package com.test02;

public class FruitsBasket {
	
	// field : class의 속성
	static int size = 30;
	public int fruitCount= 5;
	private String fruitName;
	
	// method : class의 기능
	public void setting(String name, int cnt) {
		//size = 30;
		fruitName = name;
		fruitCount += cnt;
		
		basketPrn();
		
	}
	
	public void basketPrn() {
		String res = (size >= fruitCount) ? 
				fruitName +"의 갯수는"+ fruitCount +" 개 입니다." : 
					"바구니가 꽉 찼습니다.";
		
		System.out.println(res);
	}
	
	
	
	
}
