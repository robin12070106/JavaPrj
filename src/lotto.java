
import java.util.Arrays;
import java.util.Random;

public class lotto {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int lotto[]= new int[6];
		int temp;
		
		for(int i=0;i<lotto.length;i++){
			
			
			/*lotto[i]=(int)(Math.random()*45)+1;*/
			
			lotto[i]=rand.nextInt(45)+1;
			
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]){
					i--;
					break;
				}			
			}				
		}
		
		
		/*Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));*/
		
		
		for(int i=0;i<6;i++)
			for(int j=i;j<6;j++)
				if(lotto[i]>lotto[j]){
					temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
				
		
		for(int i=0;i<lotto.length;i++)
			System.out.println(lotto[i]);
				
		
	}

}
