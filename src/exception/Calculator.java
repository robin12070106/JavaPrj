package exception;

public class Calculator {

	public static int add(int x, int y) throws over100{
		
		int result = x+y;
		
		//예외 상황 1 : 합이 100 넘으면 안됨
		if(result>100)
			//예외 오류 발생 - 100을 넘는 오류 (직접 조치를 하지는 않음)
			throw new over100();
		
		return result;
	}
	
	public static int sub(int x, int y){
		
		int result = x-y;
		
		return result;
	}


}
