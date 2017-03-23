package oop.collection;

public class ExamList {

	private Exam exams[];
	private int index,capacity;
	
	public ExamList(){
		exams= new Exam[3];		
		index=0;
		capacity=3;
	}

	public void add(Exam exam) {
		
		if(index>=capacity)//배열 공간이 부족할 경우
		{
			//1.임시배열 temp 생성
			Exam temp[]= new Exam[capacity+5];
			//2.temp로 이전
			for(int i=0;i<index;i++)
				temp[i]=exams[i];
			//3.창고 늘리기
			capacity+=5;
			//4.exams가 참조하는 배열을 temp배열로 변경
			exams=temp;			
		}		
		
		exams[index]= exam;
		index++;
		
	}

	public int size() {
			
		return index;
		
	}

	public Exam get(int i) {
		
		return exams[i];
		
	}
}
