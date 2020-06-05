package com.test04;

public class MTest {

	
	public static void main(String[] args) {
		int kor, eng, math;
		kor = eng = math = 0;
		
		kor = 99;
		eng = 34;
		math = 79;
		
		int sum;
		double avg;
		
		sum = getSum(kor,eng,math);
		avg = getAvg(sum);
		
		System.out.println("총점 : "+ sum);
		
		System.out.println("평균 : " + avg);
		
		
	}
	
	
	//1.
	
	static int getSum(int kor, int eng, int math) {
		int sum = kor + eng + math;
		return sum;
	}
	
	//2.
	
	private static double getAvg(int sum) {
		double res = (double) sum/3;
		return res;
		
	}
	
	//3.
	
	/*
	public static void main(String[] args) {
		int sum = getSum(100, 34, 79);
		System.out.println(sum);
		
		double avg = Mtest.getAvg(avg);
		System.out.println(avg);
		
	}
	*/
	
	
	// 1. 국어, 영어, 수학 점수를 받아서 총점을 리턴하는 메소드를 만들자.
	// 접근제한자는 default, 메모리영역은 static, 리턴타입 int
	//파라미터는 int형 변수 세개, 이름은 getSum 이다.
	
	//2. 총점을 받아서 평균을 리턴하는 메소드를 만들자.
	// 접근제한자는 private, 메모리영역은 static, 리턴타입은 double
	//파라미터는 int형 변수 한개, 이름은 getAvg이다.
	
	//3. main 메소드에서 getSum과 getAvg를 호출하여,
	//총점과 평균을 출력하자.
	
}
