package com.point;

import java.lang.Math;
import java.util.Scanner;

public class PointLength {

	public static void main(String[] args) {
		//(0,0) ~ (x~y)의 거리를 구하자.
		// x와 y는 Scanner를 통해 입력받자.
		// java.lang.Math
		Scanner sc = new Scanner(System.in);
		System.out.println("x의 값을 입력하세요");
		int x = sc.nextInt();
		System.out.println("y의 값을 입력하세요");
		int y = sc.nextInt();
		
		prn01(x,y);
		prn02(x,y);
		
	}
	
	public static void prn01(int x,int y) {
		//z = root(x^2+y^2) 
		double z = Math.sqrt(Math.pow(x, 2) + Math.pow(y,2));
		
		System.out.printf("(0,0) 에서 (%d,%d)까지의 거리는 %.2f입니다.", x, y, z);
		System.out.println();
		
	}
	public static void prn02(int x, int y) {
		System.out.printf("(0,0) 에서 (%d,%d)까지의 거리는 %.2f입니다.", x, y, Math.hypot(x, y));
		
	}
	
}


/*
hypot
public static double hypot(double x,
                           double y)
Returns sqrt(x2 +y2) without intermediate overflow or underflow.
Special cases:

If either argument is infinite, then the result is positive infinity.
If either argument is NaN and neither argument is infinite, then the result is NaN.
The computed result must be within 1 ulp of the exact result. If one parameter is held constant, the results must be semi-monotonic in the other parameter.

Parameters:
x - a value
y - a value
Returns:
sqrt(x2 +y2) without intermediate overflow or underflow
Since:
1.5
*/