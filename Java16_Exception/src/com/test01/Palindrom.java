package com.test01;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		char[] ch = str.toCharArray();

		if (ch[0] == ch[ch.length - 1]) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
