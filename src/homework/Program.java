package homework;

import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*String name[] = new String[] { "채경주", "유동근", "구은정", "조원준", "김진영", "박선미", "윤운영", "김홍욱", "이승진", "라지현", "이창룡", "이세은", "김정목",
	            "최성환", "최윤정", "김승일", "김선민", "박기윤", "김영균","ㅁㅁㅁ" };*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("group의 숫자는?");
		int x = scan.nextInt();
		System.out.println("group원 숫자는?");
		int y = scan.nextInt();
		String tt = scan.nextLine();
		
		ShuffleSeats sf = new ShuffleSeats(x,y);// 5group, 3명씩
		/*String z="";*/
		for (int i=0;i<x ;i++) {
			for(int j=0; j<y;j++) {
				System.out.printf((int)(i+1)+"그룹"+(int)(j+1)+"그룹원의 이름은?");
				String z = scan.nextLine();
				sf.add(i,j,z);				
			}
		}
		
	/*	sf.shuffle();
		
		
		int group=0;
		int seatIndex=0;
		String userName="";
		List <Seat> list = sf.getSeats();
		Seat seat = sf.shuffle();
		
		
		sf.add(0, 1, "newlec");
		sf.add(0, 2, "dragon");
		sf.add(0, 3, "ball");
		
		sf.add(1, 1, "newlec1");
		sf.add(1, 2, "dragon1");
		sf.add(1, 3, "ball1");
		         
		sf.add(2, 1, "newlec2");
		sf.add(2, 2, "dragon2");
		sf.add(2, 3, "ball2");
		
		sf.shuffle();
		
		List<Group> list = sf.getSeats();
*/
	}

}
