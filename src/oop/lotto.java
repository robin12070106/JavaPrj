package oop;
import java.util.Arrays;
import java.util.Random;

public class lotto {

	
	public static void genLotto(int [] lotto){		
		
		Random rand = new Random();		
		for(int i=0;i<6;i++){
			lotto[i]=rand.nextInt(45)+1;
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]){
					i--;
					break;
				}			
			}	
		}
		
	}
	
	
	public static void printLotto(int [] lotto){
		
		for(int i=0;i<6;i++)
			System.out.printf("%d ", lotto[i]);
			System.out.println();
		
	}
	
	
	public static void sortLotto(int [] lotto){
		
		int temp;
		
		for(int i=0;i<6;i++)
			for(int j=i;j<6;j++)
				if(lotto[i]>lotto[j]){
					temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
		
	}	
	
	
	public static void main(String[] args) {
		
		
		
		//로또 생성
		int lotto[]= new int[6];
		
		
		//로또번호 생성
		genLotto(lotto);
		
		
		//로또번호 출력
		printLotto(lotto);
		
		
		//로또번호 정렬
		sortLotto(lotto);
		
		
		//로또번호 출력
		printLotto(lotto);
	
		
				
		
	}

}
