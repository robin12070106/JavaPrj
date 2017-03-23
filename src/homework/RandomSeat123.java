package homework;

import java.util.Random;

public class RandomSeat123 {

	private int x, sw, tt, batch[];
	private String name[];
		
	public RandomSeat123() {
		
		batch = new int[20];
		name = new String[] { "채경주", "유동근", "구은정", "조원준", "김진영", "박선미", "윤운영", "김홍욱", "이승진", "라지현", "이창룡", "이세은", "김정목",
		            "최성환", "최윤정", "김승일", "김선민", "박기윤", "김영균","ㅁㅁㅁ" };

	}

	public void mix() {		
	   
		Random rand = new Random();
	      do {
	         int p = rand.nextInt(name.length);
	         for(int i=0;i<x;i++) {
	            if (p == batch[i]) {sw = 1;} 
	         }
	         if (sw !=1) {
	            batch[x] = p;
	            x++;
	         }
	         sw=0;
	      } while(x!=name.length);
		
	}

	public void print() {
		
		for (int i=0;i<name.length;i++) {
	         if (i%4 == 0) {tt++; System.out.print(tt+"조 : ");}; 
	         System.out.print(name[batch[i]]+ "  ");
	         if (i%4 == 3) System.out.println("");
	      }
		
	}	
	
}
