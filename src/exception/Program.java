package exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program {

	public static void main(String[] args){
		
		//예외처리 : 예외

		//오류 : 1.구문오류   2.논리오류   3.예외오류
		//버그 -> 2번 오류

		/* 구문에는 문제 없음
		논리적으로도 문제 없음
		사용자가 오류 있다고 이런게 예외오류 */
		
		/*APP--->API 이용
		API 가 용량 권한 베드 등 체크---->예외 상황 발생을 APP에게 전달 시스템 필요--->예외 상황 처리는 APP하는 시스템 필요*/
		
		FileOutputStream fis = null;
		
		try {
			
			Calculator.add(20, 10);
			fis = new FileOutputStream("aa.txt");
			fis.write(52);
			
		} catch (FileNotFoundException e) {

			System.out.println("파일 없다.");
		} catch (IOException e) {
			
			System.out.println("출력에 문제가 발생");
		} catch (over100 e) {
			
			System.out.println("100 넘기면 안됨");
		
		} catch (Exception e) {
			
			System.out.println("죄송합니다");
		} finally{
			//정리작업 - 무조건 여기 들러서 작업 처리하고 돌아감
			System.out.println("정리함");
			try {
				fis.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		

	}

}
