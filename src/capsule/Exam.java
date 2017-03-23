package capsule;

import java.util.Scanner;

public class Exam {
	

	private int kor, eng, math;
	
	
	
	
	public void setKor(int kor){
		this.kor=kor;
	}
	
	public void setEng(int eng){
		this.eng=eng;
	}
	
	public void setMath(int math){
		this.math=math;
	}
	
	
	
	public void print() {
		
		/*int kor=this.kor; 
		int eng=this.eng;
		int math=this.math; */
		
		int total = kor + eng + math;
        double avg = total / 3;

        System.out.println("┌──────────────┐");
  	    System.out.println("│               성적출력                 │");
  	    System.out.println("└──────────────┘");
          
	    System.out.printf(" 국어 : %d\n ", kor);
	    System.out.printf(" 영어 : %d\n ", eng);
	    System.out.printf(" 수학 : %d\n ", math);             
	    System.out.printf(" 총점 : %d\n ", total);
	    System.out.printf(" 평균 : %.2f\n ", avg);
	    System.out.println("───────────────");
          
		
	}

	public void input() {
		
		/*int kor, eng, math;*/
		
	    Scanner scan = new Scanner(System.in);
				
		System.out.println("┌──────────────┐");
	    System.out.println("│               성적입력                 │");
	    System.out.println("└──────────────┘");

	      do {
	         System.out.print(" 국어 : ");
	         kor = scan.nextInt();
	         
	         if (kor < 0 || kor > 100)
	            System.out.println("성적의 입력 범위는 0~100까지입니다.");
	      } while (kor < 0 || kor > 100);

	      do {
	         System.out.print(" 영어 : ");
	         eng = scan.nextInt();
	         if (eng < 0 || eng > 100)
	            System.out.println("성적의 입력 범위는 0~100까지입니다.");
	      } while (eng < 0 || eng > 100);

	      do {
	         System.out.print(" 수학 : ");
	         math = scan.nextInt();
	         if (math < 0 || math > 100)
	            System.out.println("성적의 입력 범위는 0~100까지입니다.");
	      } while (math < 0 || math > 100);
	      
	      System.out.println(" ────────────────────");
		
	    /* this.kor=kor;
	     this.eng=eng;
	     this.math=math;*/
	       
	}

	public static int inputMenu() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("┌──────────────┐");
	    System.out.println("│               메인메뉴                 │");
	    System.out.println("└──────────────┘");
	    System.out.println(" 1.성적 입력  ");
	    System.out.println(" 2.성적 출력  ");
	    System.out.println(" 3.종료  ");
	    System.out.println(" 선택 > ");
	    
	    int menu = scan.nextInt();
	     
		return menu;
		
	}
	

}
