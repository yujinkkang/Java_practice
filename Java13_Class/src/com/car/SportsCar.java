package com.car;

public class SportsCar extends Car {
	
	public SportsCar() {
		//super();  -> 작성하지 않아도 자동 호출됨
	}
	public SportsCar(String color) {
		super(color);
	}
	public void accelPedal() {
		//speed += 15;
		//speed = speed + 15;
		//오버라이드
		setSpeed(getSpeed()+15);
		System.out.println("속도가 빠르게 올라갑니다.");
	}
	public void breakPedal() {
		//speed -= 15;
		//speed = speed - 15;
		setSpeed(getSpeed()-15);
		if(getSpeed()>0) {
		 System.out.println("속도가 빠르게 내려갑니다.");
		}else {
			System.out.println("멈췄습니다.");
			setSpeed(0);
		}
	}
	public String toString() {
		//return "SportsCar의 " +super.toString();
		return "SportsCar의 현재 속도는 " + getSpeed()+ "입니다.";
	}

}
