package com.car;

public class Truck extends Car {
	public Truck() {

	}

	public Truck(String color) {
		super(color);
	}

	public void accelPedal() {
		setSpeed(getSpeed() + 5);
		System.out.println("속도가 천천히 올라갑니다.");
	}

	public void breakPedal() {
		setSpeed(getSpeed()-5);
		if(getSpeed()>0){
			System.out.println("속도가 천천히 줄어듭니다.");
			}else {
				System.out.println("멈췄습니다.");
				setSpeed(0);
			}
	}

	public String toString() {
		//return "Truck의 " + super.toString();
		return "Truck의 현재 속도는 " + getSpeed()+ "입니다.";
	}

}
