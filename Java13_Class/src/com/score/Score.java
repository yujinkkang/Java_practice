package com.score;

public class Score {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Score() {
		
	}
	public Score(String name, int kor, int eng, int math)  {
		/*
		getName();
		setName(name);
		
		getKor();
		setKor(kor);
		
		getEng();
		setEng(eng);
		
		getMath();
		setMath(math);
		
		getSum();
		getAvg();
		getGrade();
		*/
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
		return (double)getSum()/3;
	}
	
	public String getGrade() {
		if(getAvg()>=90) {
			return "A";
		}else if(getAvg()>=80) {
			return "B";
		}else if(getAvg()>=70) {
			return "c";
		}else if(getAvg()>=60) {
			return "D";
		}else {
			return "F";
		}
		/*
		 * switch((int)getAvg()/10){
		 * 	case 10:
		 * 	case 9:
		 * 		return "A";
		 * 	case 8:
		 * 		return "B";
		 * }
		 */
		
	}
	

	@Override   //toString은 주소값을 출력하는 애인데 오버라이딩해서 아래 내용으로 재정의
	public String toString() {
		return "이름 : " + name + " 국어 : "+kor + " 영어 :  "+ eng 
				+ "수학 : " + math + "총점 : " + getSum() + "평균 : "+ getAvg()+ "등급 : " + getGrade();
	}
	
	
	

}
