import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileIOProgram {
	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/data.khw");
		Scanner scan = new Scanner(fis);

		int lotto;
		int sum = 0;
		int until = 0;

		
			
		while (scan.hasNextInt()) {

				lotto = scan.nextInt();
				while (until < 3) {

					System.out.printf("num : %d\n", lotto);
					sum = sum + lotto;
					lotto = scan.nextInt();
					until++;
			}
		}
		
		System.out.println(sum);

		scan.close();
		fis.close();

		/*
		 FileOutputStream fos = new FileOutputStream("C:\\Users\\sist\\Desktop\\workspace\\data.khw");
		 PrintStream fout = new PrintStream(fos);
		 
		 fout.println("Welcome to the HELL");
		 fout.close();
		 */
		System.out.println("작업종료");
	}
}
