package com.lotto;

public class LottoTeacher {
	// 로또 배열 생성
	private int[] make() {
		int[] arr = new int[7];
		int index =0;
		
		while(index<7) {
			int ran= (int)(Math.random()*45+1);
			
			if(!isSame(arr,ran)) {
				arr[index] = ran;
				index++;
			}
		}
		return arr;
	}

	// 중복값 판별
	private boolean isSame(int[] arr, int ran) {
		boolean same = false;
		
		for(int i = 0 ; i<arr.length; i++) {
			if(arr[i]==ran) {
				same =true;
				break;
			}
		}
		return same;
	}

	// 정렬
	private void sort(int[] arr) {
		for(int i =0; i<arr.length; i++) {
			for(int j =1; j<arr.length; j++) {
				if(arr[j]<arr[j-1]) {
					//swap: tmp는 하나의 다른 방 
					int tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
					
				}
			}
		}
	}

	// 출력
	
	public void prn() {
		int[] arr = make();
		
		sort(arr);
		//Arrays.sort(arr);
		
		for(int i =0; i <arr.length;i++) {
			System.out.printf("%3d", arr[i]);
		}
	}

}
