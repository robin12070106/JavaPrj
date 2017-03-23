package oop.inherit.ui;

import oop.inherit.entity.Exam;

public class Program {

	public static void main(String[] args) {
		
		
		Exam exam = new Exam();//부품(=종속변수)=Dependency
		ExamConsole console = new ExamConsole(exam);//Injection(조립=주입)
		
		
		console.input();
		console.print();
		
		
		//1.Composition(일체형) Has a Inheritance. ◆
		//2.Association(조립형) Has a Inheritance. ->
		//3.Aggregation(집합형) Has a Inheritance. ◇
	}

}
