/*
 * 
 * class ShuffleSeats{
 *       public ShuffleSeats(int groupCapa, int seatCapa){...}
 *       public void add(int group, int seatIndex, String userName){}
 *       public void shuffle(){}
 *       public List<Seat> getSeats(){}
 *       
 * }
 * 
 * class Seat{
 *       private String userName;
 *       private int group;
 *       private int Index;       
 * }
 * 
 * class Program{
 *       main(){
 *          ShuffleSeats sf = new ShuffleSeats(5,3); // 5group, 3명씩
 *          
 *          sf.add(0, 1, "newlec");
 *          sf.add(0, 2, "dragon");
 *          sf.add(0, 3, "ball");
 * 
 *          sf.add(1, 1, "newlec1");
 *          sf.add(1, 2, "dragon1");
 *          sf.add(1, 3, "ball1");
 *          
 *          sf.add(2, 1, "newlec2");
 *          sf.add(2, 2, "dragon2");
 *          sf.add(2, 3, "ball2");
 * 
 *          sf.shuffle();
 * 
 *          List<Group> list = sf.getSeats();
 *     }
 * }
 * 
 */

import java.util.Random;

public class Deploy {
   public static void main(String[] args) {
      int x=0,sw=0,tt=0;
      int batch[] = new int[100];
      String namee[] = { "채경주", "유동근", "구은정", "조원준", "김진영", "박선미", "윤운영", "김홍욱", "이승진", "라지현", "이창룡", "이세은", "김정목",
            "최성환", "최윤정", "김승일", "김선민", "박기윤", "김영균","ㅁㅁㅁ" };
      
      Random rand = new Random();
      do {
         int p = rand.nextInt(namee.length);
         for(int i=0;i<x;i++) {
            if (p == batch[i]) {sw = 1;} 
         }
         if (sw !=1) {
            batch[x] = p;
            x++;
         }
         sw=0;
      } while(x!=namee.length);
      
      for (int i=0;i<namee.length;i++) {
         if (i%4 == 0) {tt++; System.out.print(tt+"조 : ");}; 
         System.out.print(namee[batch[i]]+ "  ");
         if (i%4 == 3) System.out.println("");
      }
   }

}