package com.lotto;

//1~45 사이의 "중복되지 않는" 난수 7개를 만들고,
//정렬해서 출력하자.
public class Lotto {

	static int max = 45;
	static int min = 1;

	static int[] arr = new int[45];

	public static void prn01() {

		System.out.print("로또숫자는    ");

		for (int i = 0; i < 8; i++) {
			if (prn02(i)) {
				System.out.print(arr[i] + "  ");
			}else{
				prn02(i);
			}
		}
		System.out.print(" ---->> 다음 7숫자입니다. ");

	}

	public static boolean prn02(int i) {
		
		for (int i1 = 0; i1 < 7; i1++) {
			int r = (int) (Math.random() * (max - min + 1) + min);
			arr[i1] = r;
		}
		
		switch(arr[i]) {
		case 1: case 2 : case 3: case 4: case 5: case 6: case 7:
			
			return true;
		}
		return false;

	}

	public void prn() {
		// TODO Auto-generated method stub
		
	}

}
