package oop.collection;

import java.util.ArrayList;

public class Program {
	
	public static void main(String[] args){
		//기본이 Object 형 - 특화하고 싶으면 GenericList<Integer> 넣어주면 됨.
		ArrayList list = new ArrayList();
		
		list.add(3);		
		
		list.add(new Exam());
		
	
		System.out.println(list.get(1));		

		
		System.out.println("done");
		
		
	}

}
