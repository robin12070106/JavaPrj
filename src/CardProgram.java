import java.util.Random;

public class CardProgram {

	public static void main(String[] args) {
		
		int cards[] = new int[52];
		
		for(int i=0;i<cards.length;i++)
			cards[i]=i+1;
		
		
		Random rand = new Random();
		
		
		for(int i=0;i<100;i++){
		
			int left = rand.nextInt(52);
			int right = rand.nextInt(52);
			
			
			int temp;
			
			if(left!=right){
				temp=cards[left];
				cards[left]=cards[right];
				cards[right]=temp;
			}else
				i--;
			
		}
			
				
		
		for(int i=0;i<cards.length;i++){
			System.out.printf("%4d",cards[i]);
			if((i+1)%13==0)
				System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
