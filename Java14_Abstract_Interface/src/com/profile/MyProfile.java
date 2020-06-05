package com.profile;

public class MyProfile extends Profile implements Display, Job  {
	
	public MyProfile(String name, String phone) {
		super(name, phone);
		System.out.println("이     름: "+ name);
		System.out.println("전화번호: " + phone);
	}

	private String loc;
	
	public void jobLoc(String loc) {
		System.out.println("회사주소: "+ loc);
	}
	
	public void display() {
		System.out.println("직      종: " + JOB_ID);
		
	}
	

}
