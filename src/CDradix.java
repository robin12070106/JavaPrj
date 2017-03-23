import java.util.Scanner;

public class CDradix {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
				
		while(true){
			
			int enter;
			int radix[]= new int[32];
			
			
			System.out.println("Decimal to binary conversion");
			System.out.println();
			System.out.println("Enter the Decimal number you want to convert> ");
			enter = scan.nextInt();
			
			
			for(int i=0;i<radix.length;i++){			
			
				radix[i]=enter%2;
				enter=enter/2;
												
				if(enter==0)
					break;
				
			}			
			
					
			for(int i=0; i<radix.length/2;i++){
				int temp;
				temp=radix[radix.length-1-i];
				radix[radix.length-1-i]=radix[i];
				radix[i]=temp;
			}
				
		
		
			for(int i=0;i<radix.length;i++){
				if((i+1)%8==0)
					System.out.printf("%s ",radix[i]);
				else
					System.out.printf("%s",radix[i]);
			}
			
			System.out.println();
			System.out.println();
								
				
		
		}		

	}

}
