package com.TV;

public class SamsongTV implements TV {

	private int volume;
	
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	@Override
	public int volumeUp() {
		volume+=2;
		return volume;
	}

	@Override
	public int volumeDown() {
		volume-=2;
		return volume;
	}
	

}
