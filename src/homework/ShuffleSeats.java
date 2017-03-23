package homework;

import java.util.List;
import java.util.Random;

public class ShuffleSeats {
	private int groupCapa=0;
	private int seatCapa=0;
	String name[] = new String[100];
	int sw=0;
	
	public ShuffleSeats(int groupCapa, int seatCapa){
		this.groupCapa = groupCapa;
		this.seatCapa = seatCapa;
	}
	
	public void add(int group, int seatIndex, String userName){
		name[sw] = userName;
		sw++;	
	}
	
	public void shuffle(){	
		Random rand = new Random();
		int x=0,sw=0,tt=0;
		int batch[] = new int[100];
		
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
		
	public List<Seat> getSeats(){
		
		return list;
	}
	*/
	
	
	
	
	

	
}
