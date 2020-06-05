package com.Area;

public abstract class Arealmpl implements Area{
	private String result;
	
	public Arealmpl() {
		
	}
	public void print() {
		System.out.println(Area.PRINT +result);
		
		
	}
	public abstract void make();
	
	public void setResult(String result) {
		this.result = result;
		
	}
	

}
