package com.test04;

public class MtestTeacher {
	public static void main(String[] args) {
		
	int arr[] = new int[5];
	
	for(int i = 0; i<4; i++) {
		arr[i]= (int) (((Math.random()*5))+5);
		
	}
	
	int tmp =1;
	for(int i =0; i<4;i++) {
		tmp*=arr[i];
	}
	
	arr[4]=tmp;
	
	for(int i=0; i<arr.length;i++) {
		System.out.printf("%2d",arr[1]);
	}
	}
}
