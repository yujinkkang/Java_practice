package com.test01;

public class Mtest03Teacher {
	
	public static void main(String[] args) {
		
		char[] ch = new char[26];
		for(int i =0; i < ch.length; i++) {
			ch[i] = (char)('a'+i);
		}
		prn01(ch);
		prn02(ch);
		prn03(ch);
	
	}
	
	public static void prn01(char[] arr) {
		for(int i =1; i<=arr.length; i++) {
			System.out.print(arr[i-1]+" ");
			
			if(i%6 == 0) {
				System.out.println();
			}
			
		}
	}
	
	public static void prn02(char[] arr) {
		System.out.println("---------------------");
		int cnt =1;
		for(int i = arr.length; i>0; i--) {
			System.out.print(arr[i-1]+" ");
			if(cnt%6 ==0) {
				System.out.println();
			}
			cnt++;
		}
	}
	
	public static void prn03(char[] arr) {
		System.out.println("--------------------");
		for(int i =1; i <=arr.length; i++) {
			System.out.print(Character.toUpperCase(arr[i-1]) + " ");
			if(i%6 == 0) {
				System.out.println();
			}
		}
	}

}
