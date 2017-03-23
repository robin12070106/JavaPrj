package oop.array;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {
		
		int kor=0, eng=0, math=0;
		
		Scanner scan = new Scanner(System.in);
		String enter;
		
		
		Exam exams[]= new Exam[3];
		
		int index=0;
		int menu=0;
		int capacity=3;
		
		
		while(menu !=3){
			
			menu=Exam.inputMenu();
			
			
			switch(menu){
			
				case 1:
					
					System.out.println("┌──────────────┐");
				    System.out.println("│    성적입력           │");
				    System.out.println("└──────────────┘");
				    
					do{
						
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
						
						
						exams[index]= new Exam();
						exams[index].input();
						index++;
						System.out.println("계속 입력하시겠습니까?(y/n)");
						enter = scan.next();
						
							
					}while(!enter.equals("n"));
					
					break;
							 
				case 2:
					
					 System.out.println("┌──────────────┐");
				  	 System.out.println("│    성적출력           │");
				  	 System.out.println("└──────────────┘");
				  	 
					for(int i=0;i<index;i++){	
						exams[i].print();
					}
					break;
					
				case 3:
					
					System.out.println("감사합니다.");
					break ;
				
			}
		
		}	
		
	}
	
}

