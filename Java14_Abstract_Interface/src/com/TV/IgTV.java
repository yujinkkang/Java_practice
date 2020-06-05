package com.TV;

public class IgTV implements TV {

	private int volume=0;
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
		
	}
	
	@Override
	public int volumeUp() {
		// TODO Auto-generated method stub
		volume+=3;
		return volume;
	}

	@Override
	public int volumeDown() {
		// TODO Auto-generated method stub
		volume-=3;
		return volume;
	}
	

	

}
