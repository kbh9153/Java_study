package chap19.Ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

// FileOutputStream을 사용해서 한글 처리

public class FileOutputStream02 {
	
	public static void main(String[] args) throws IOException {
		// 1. 저장할 파일 생성
		File outFile = new File("src/chap19/Ex05/FileOutput2.txt");		// 기본적으로 이클립스의 default charactorSet으로 저장
		
		// 2. n-byte 단위로 쓰기 처리 (byte[]의 처음부터 끝까지 쓰기)
		OutputStream os1 = new FileOutputStream(outFile);
		byte[] byteArray1 = "안녕하세요".getBytes(Charset.forName("MS949"));	// String -> byte[]에 저장 (getBytes() 이용)
			// MS949 : 한글은 한 문자에 2byte씩 처리 / UTF-8 : 한글은 한 문자에 3byte씩 처리
		
		os1.write(byteArray1);
		os1.write('\n');
		os1.flush();
		os1.close();
		
		// 3. n-byte 쓰기 (byte[]의 offset부터 length개의 byte 데이터 쓰기)
		OutputStream os2 = new FileOutputStream(outFile, true);		// 이어서 쓰기
//		byte[] byteArray2 = "반갑습니다".getBytes(Charset.forName("MS949"));
		byte[] byteArray2 = "반갑습니다".getBytes(Charset.defaultCharset());		// 기본 charset으로 가져오기
		
		os2.write(byteArray2, 4, 2);	// 4byte부터 띄우고 시자갛여 2byte 읽어와서 저장
		// write (byte 배열, offset, length)
		
		// 영어, 숫자, 특수문자 => ASCII 코드로 1byte
		os2.flush();
		os2.close();
		
	}
}
