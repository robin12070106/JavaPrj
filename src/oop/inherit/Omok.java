package oop.inherit;

import java.util.Scanner;

public class Omok {

	
	private int x, y;
	
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}




	public void input() {


       	Scanner scan = new Scanner(System.in);	            		            		
 		System.out.println(">오목입력(X Y)");
        System.out.println("오목입력 범위는(X= 0~19 , Y= 0~14)입니다");
        System.out.println("새로 시작하기는 (20 20)입니다");            

        x = scan.nextInt();
        y = scan.nextInt(); 	
		
		
	}


	
	
	
	
	
	
	
	
	

}
