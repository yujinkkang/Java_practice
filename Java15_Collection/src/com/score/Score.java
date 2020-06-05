package com.score;

public class Score {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getSum() {
		return kor+eng+math;
	}
	
	public double getAvg() {
		return (double)(getSum()/3);
	}
	
	public String getGrade() {
		switch((int)(getAvg()/10)) {
		case 10:
		case 9:
			return "A";
		case 8:
			return "B";
		case 7:
			return "C";
		case 6:
			return "D";
		default:
			return "F";
		
		}
	}
	@Override
	public String toString() {
		return "점수 [이름 =" + name + ", 국어점수 =" + kor + ", 영어점수 =" + eng + ", 수학점수 =" + math + ", 점수 총합 =" + getSum()
				+ ", 점수 평균 =" + getAvg() + ", 등급 =" + getGrade() + "]";
	}
	
	

}
