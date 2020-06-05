package com.test01;

public class Mtest {

	static String str = "     The String class represents character strings.     ";

	public static void main(String[] args) {
		String s = "Hello";
		System.out.println(1 + 2 + s);
		System.out.println(s);
		s = s + 1 + 2;
		System.out.println(s);
		// String concatenation

		prn09();
		prn10();
	}

	// 1. str의 전체 길이 (출력하자.)
	public static void prn01() {

		System.out.println(str.length());
	}

	// 2. str 전체 대문자로 바꿔서
	public static void prn02() {
		System.out.println(str.toUpperCase());
	}

	// 3. str 전체 소문자로 바꿔서
	public static void prn03() {
		System.out.println(str.toLowerCase());
	}

	// 4. str에서 첫번째로 나오는 c의 인덱스를
	public static void prn04() {
		System.out.println(str.indexOf('c'));
	}

	// 5. "class" -> "java"로 바꿔서
	public static void prn05() {
		System.out.println(str.replace("class", "java"));
	}

	// 6. "character"를 찾아서 대문자로 변환 후 , 변환된 내용으로 전체 출력
	public static void prn06() {
		String target = "character";
		int start = str.indexOf(target);
		int end = start + target.length();

		String upper = str.substring(start, end).toUpperCase();
		System.out.println(str.replace(target, upper));

	}

	// 7. str을 char[]로 출력하되, 'c'만 출력하자.
	// 그리고 c의 갯수도 출력하자.
	public static void prn07() {
		char[] ch = str.toCharArray();
		int cnt = 0;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'c' || ch[i] == 'C') {
				System.out.print(ch[i]);
				cnt++;
			}
		}
		System.out.println("\nc의 갯수: " + cnt);

	}

	// 8. str을 char[]로 출력하되, 대문자만
	// 그리고 대문자의 갯수도
	public static void prn08() {
		char[] arr = str.toCharArray();
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(arr[i])) {
				System.out.print(arr[i] + " ");
				count++;
			}

		}
		System.out.println("\n대문자의 갯수:" + count);
	}

	// 9. str안의 모든 공백 제거 후 출력
	private static void prn09() {
		System.out.println(str.replace(" ", ""));// regex
	}
	// TODO Auto-generated method stub

	// 10. 전체 역순으로
	private static void prn10() {
		int index = 0;
		char[] ch = new char[str.length()];
		for (int i = str.length() - 1; i >= 0; i--) {
			ch[i] = str.charAt(index);
			index++;
		}
		System.out.println(ch);

	}

}
