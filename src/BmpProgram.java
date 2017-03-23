import java.io.FileInputStream;
import java.io.IOException;


public class BmpProgram {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("res/dream.bmp");
		
		
		//파일 헤더 로드
		byte fsHeader[] = new byte[14];
		fis.read(fsHeader);
				
		byte bmpHeader[] = new byte[92];
		fis.read(bmpHeader);
		
		fis.close();
		
		
		//파일 크기
		int fileSize = ((int) fsHeader[5]&0xff)<<24 | ((int) fsHeader[4]&0xff)<<16 | ((int) fsHeader[3]&0xff)<<8 |((int) fsHeader[2]&0xff)<<0;
		
		System.out.printf("file size : %d\n", fileSize);
		
		//이미지 너비 출력
		int imageWidth = ((int) bmpHeader[7]&0xff)<<24 | ((int) bmpHeader[6]&0xff)<<16 | ((int) bmpHeader[5]&0xff)<<8 |((int) bmpHeader[4]&0xff)<<0;
		
		System.out.printf("image width : %d\n", imageWidth);
		
		
		
	}

}
