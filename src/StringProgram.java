import java.io.FileInputStream;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class StringProgram {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/script.txt");
		Scanner scan = new Scanner(fis);
		Scanner enter = new Scanner(System.in);

		String line;
		String query;
		int num = 0, pnum = 0, swi = 0;

		
		String got[] = new String[1000];
		while (scan.hasNextLine()) {
			line = scan.nextLine();
			got[num] = line;
			num++;
		}

		do {
			System.out.print("검색어를 입력하세요>");
			query = enter.next();
			for (int i = 0; i < num; i++) {
				if (got[i].indexOf(query) >= 0)
					System.out.println(i + 1 + " " + got[i].replace(query, "[" + query + "]"));
				else
					pnum++;
			}
			if (num == pnum) {
				System.out.println("입력하신 단어는 존재하지 않습니다.");
				swi = 1;
			}
		} while (swi == 1);

		scan.close();
		fis.close();
	}

}
