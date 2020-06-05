package com.test04;

public class StarPrn {
	

	public void prn01() {
		// ★
		// ★★
		// ★★★
		// ★★★★
		// ★★★★★
		
		// i = 줄
		// j =  *,   **,  ***,  ****,  *****
		//    (0+1) (1+1) (2+1) (3+1) (4+1)
		for(int i =0; i< 5; i++) {
			for(int j =0; j <i+1; j++) {
				System.out.print("★");
				
			}
			System.out.println();
			
		}
		System.out.println();
	}
	public void prn02() {
		// ★★★★★
		// ★★★★
		// ★★★
		// ★★
		// ★
		
		//i= 줄(0,1,2,3,4)
		//j = (5-0, 5-1, 5-2, 5-3, 5-4)
		for(int i =0; i< 5; i++) {
			for(int j =0; j <5-i; j++) {
				System.out.print("★");
				
			}
			System.out.println();
		}
		
	}
	public void prn03() {
		//      ★
		//     ★★
		//    ★★★
		//   ★★★★
		//  ★★★★★
		/*
		 * 0  4  1
		 * 1  3  2
		 * 2  2  3
		 * 3  1  4
		 * 4  0  5
		 * 
		 * 공백 (4-0, 4-1, 4-2, 4-3, 4-4)
		 * *(1+0, 1+1, 1+2, 1+3, 1+4)
		 */
		for(int i =0; i<5; i++) {
			for(int j =0; j<4-i; j++) {
				System.out.print(" ");
			}
			for(int a =0; a<i+1; a++) {
				System.out.print("★");
			}
			
			System.out.println();
		}
		System.out.println();
		
	}
	
	public void prn04() {
		//★★★★★
		// ★★★★
		//  ★★★
		//   ★★
		//    ★
		// 공백(0, 1, 2, 3, 4)
		// *(5-0, 5-1, 5-2, 5-3, 5-4)
		
		for(int i =0; i<5; i++) {
			for(int j =0; j<i ; j++) {
				System.out.print(" ");
			}
			for(int a =0; a<5-i; a++) {
				System.out.print("★ ");
			}
			
			System.out.println();
		}
		System.out.println();
		
	}
	public void prn05() {
		//         ★
		//       ★★★
		//     ★★★★★
		//   ★★★★★★★
		// ★★★★★★★★★
		// 공백(4-0,4-1,4-2,4-3,4-4)
		//*(1,3,5,7,9)
		//*(2*0+1, 2*1+1, 2*2+1, 2*3+1, 2*4+1)

		for(int i =0; i<5; i++) {
			for(int j =0; j<4-i ; j++) {
				System.out.print(" ");
			}
			for(int a =0; a<2*i+1; a++) {
				System.out.print("★ ");
			}
			
			System.out.println();
		}
		System.out.println();
		
	}
}
