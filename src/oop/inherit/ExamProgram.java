package oop.inherit;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {
		
		int kor=0, eng=0, math=0;
		
		Scanner scan = new Scanner(System.in);
		String enter;
		
		
		ExamList list = new ExamList();
		
		
		int menu=0;
		
		while(menu !=3){
			
			menu=Exam.inputMenu();
			
			
			switch(menu){
			
				case 1:
					
					System.out.println("┌──────────────┐");
				    System.out.println("│    성적입력           │");
				    System.out.println("└──────────────┘");
				    
					do{
						
						Exam exam= new Exam();
						exam.input();
						
						list.add(exam);
						
						System.out.println("계속 입력하시겠습니까?(y/n)");
						enter = scan.next();
						
							
					}while(!enter.equals("n"));
					
					break;
							 
				case 2:
					
					 System.out.println("┌──────────────┐");
				  	 System.out.println("│    성적출력           │");
				  	 System.out.println("└──────────────┘");
				  	 
					for(int i=0;i<list.size();i++){	
						Exam exam=list.get(i);
						exam.print();
					}
					break;
					
				case 3:
					
					System.out.println("감사합니다.");
					break ;
				
			}
		
		}	
		
	}
	
}

