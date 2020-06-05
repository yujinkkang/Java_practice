package com.test02;

public class Mtest {
	
	/*
	 * class diagram을 보고 FruitsBasket class를 작성하자.
	 * -fruitCount의 초기값은 5이다.
	 * - setting 메서드를 호출할때, size 변수에 30을 대입하자.
	 * - setting 메서드의 Stirng 파라미터는 과일의 이름을 받아서
	 *   fruitName 변수에 대입하고,
	 *   int 변수는 과일의 갯수를 받아서 fruitCount 변수에 더해서 대입하자 (+=)
	 * - basketPrn 메서드는 size와 fruitCount의 값을 비교해서,
	 *   size가 크거나 같으면 과일이름+"의 갯수는 "+ "+갯수+"입니다."
	 *   작으면 "바구니가 꽉 찼습니다." 를 출력한다.
	 */
	
public static void main (String[] args) {
		
		
		FruitsBasket bananaBasket = new FruitsBasket();
		bananaBasket.setting("바나나", 20);
		
		
		bananaBasket.size = 100;
		FruitsBasket.size = 50;
		System.out.println(bananaBasket.size);
		
		bananaBasket.fruitCount = 100;
		System.out.println(bananaBasket.fruitCount);
		//FruitsBasket.fruitCount = 100;
		
		
		FruitsBasket appleBasket = new FruitsBasket();
		appleBasket.setting("사과", 30);
		System.out.println(appleBasket.size);
		System.out.println(appleBasket.fruitCount);
		
	}
	
	

}
