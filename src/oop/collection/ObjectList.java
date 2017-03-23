package oop.collection;

public class ObjectList {

	private Object objects[];
	private int index,capacity;
	
	public ObjectList(){
		objects= new Object[3];		
		index=0;
		capacity=3;
	}

	public void add(Object exam) {
		
		if(index>=capacity)//배열 공간이 부족할 경우
		{
			//1.임시배열 temp 생성
			Object temp[]= new Object[capacity+5];
			//2.temp로 이전
			for(int i=0;i<index;i++)
				temp[i]=objects[i];
			//3.창고 늘리기
			capacity+=5;
			//4.objects가 참조하는 배열을 temp배열로 변경
			objects=temp;			
		}		
		
		objects[index]= exam;
		index++;
		
	}

	public int size() {
			
		return index;
		
	}

	public Object get(int i) {
		
		return objects[i];
		
	}
}
