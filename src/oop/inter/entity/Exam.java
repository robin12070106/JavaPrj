package oop.inter.entity;

import java.util.Scanner;

public abstract class Exam {
	

	private int kor, eng, math;
	
	public Exam() {		
	
	}
	
	public Exam(int kor, int eng, int math) {
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public void setKor(int kor){
		this.kor=kor;
	}
	
	public void setEng(int eng){
		this.eng=eng;
	}
	
	public void setMath(int math){
		this.math=math;
	}
	
	


	public int total() {
		
		return kor+eng+math;
	}
	
	public abstract float avg(); 

	

}
