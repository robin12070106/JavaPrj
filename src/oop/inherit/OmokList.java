package oop.inherit;

public class OmokList {

	private Omok omoks[];
	private int index,capacity;
	
	public OmokList(){
		omoks= new Omok[3];		
		index=0;
		capacity=3;
	}

	public void add(Omok omok) {
		
		if(index>=capacity)//배열 공간이 부족할 경우
		{
			//1.임시배열 temp 생성
			Omok temp[]= new Omok[capacity+5];
			//2.temp로 이전
			for(int i=0;i<index;i++)
				temp[i]=omoks[i];
			//3.창고 늘리기
			capacity+=5;
			//4.omoks가 참조하는 배열을 temp배열로 변경
			omoks=temp;			
		}		
		
		omoks[index]= omok;
		index++;
		
	}

	public int size() {
			
		return index;
		
	}

	public Omok get(int i) {
		
		return omoks[i];
		
	}
}
