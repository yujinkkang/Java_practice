package com.test04;

public class ReMTest {
	public static void main(String[] args){
		int kor,eng, math;
		kor = eng = math = 0;
		
		kor = 113;
		eng = 34;
		math = 79;

		int sum;
		double avg;
		
		sum = getSum(kor, eng, math);
		avg = getAvg(sum);
		System.out.println("합계:" + sum);
		System.out.println("평균:" + avg);
	}

	static int getSum(int kor, int eng, int math){
	int sum = kor + eng +math;
	return sum;
	
	}

	private static double getAvg(int sum){
	double avg = (double) sum/3;
	return avg;
	
	}
}
