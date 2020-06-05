package com.seat;

public class Seat {
	public static void main(String[] args) {
		
		int[] arr = new int[26];
		int index =0;
		
		for(int i=0; i<26;i++) {
			arr[i] =i+1;
			System.out.print(" "+ arr[i]);
		}
		System.out.println();
		System.out.println();
		
		int cnt =1;
		for(int i = arr.length; i>0; i--) {
			int ran = (int) (Math.random()*25 +1);
			
			
			if(!isSame(arr,ran)) {
				arr[index] = ran;
				index++;
			}
			
			if(cnt%6 ==0) {
				System.out.println(arr[ran]);
			}
			cnt++;
		}
	}

	private static boolean isSame(int[] arr, int ran) {
		boolean same = false;
		
		for(int i =0; i<arr.length;i++) {
			if(arr[i] == ran) {
				same = true;
				break;
			}
		}
		
		return same;
	}

}
