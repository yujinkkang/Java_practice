package com.baseball;

import java.util.Arrays;

public class Ball {
	
	private int[] goal;
	
	public Ball() {
		goal = new int[3];
		makeGoal();
	}
	public Ball(int size) {
		goal = new int[size];
		makeGoal();
	}
	
	public int[] getGoal() {
		return goal;
	}
	
	private void makeGoal() {
		Arrays.fill(goal, -1);
		int cnt =0;
		
		while(cnt < goal.length) {
			int ran = (int)(Math.random()*10);
			
			if(!isSame(goal, ran)) {
				goal[cnt] = ran;
				cnt++;
			}
		}
		
	}
	private boolean isSame(int[] arr, int input) {
		boolean same = false;
		
		for(int i =0; i<arr.length;i++) {
			if(arr[i] == input) {
				same = true;
				break;
			}
		}
		
		
		
		return same;
	}
	
	

}
