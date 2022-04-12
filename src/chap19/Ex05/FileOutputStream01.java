package chap19.Ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * InputStream : 추상 클래스 => FileInputStream 구현한 클래스 (읽기)
 * OutputStream : 추상 클래스 => FileOutputStream  구현한 클래스 (쓰기)
 * FileInputStream : byte() 단위 데이터 읽기
 * FIleOutputStream : byte() 단위 데이터 쓰기
 * 
 * Windows 콘솔, 메모장 Enter를 넣으면 : \r\n (\r은 생략 가능)
 * Mac : \n
 */

public class FileOutputStream01 {

	public static void main(String[] args) throws IOException {
		// 1. 입력 파일 생성 (존지하지 않음)
		File outFile = new File("src/chap19/Ex05/FileOutput1.txt");
		
		// 2. 1byte씩 쓰기
		OutputStream os1 = new FileOutputStream(outFile);
			// FileOutputStream에 존재하지 않는 파일을 넣으면 실행시 생성됨
			// FileInputSream 경로에 파일이 존재해야됨. 예외발생
		
		os1.write('J');
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.write('\r');	// 13 엔터 => 생략 가능
		os1.write('\n');	// 10 엔터
		
		// 중요 : write() 메소드는 버퍼(= 메모리)에 쓰기. 버퍼에 꽉차면 파일에 쓰기 => 생략가능
		// 		 flush() : 버퍼에 저장된 내용을 파일에 강제로 쓰기할 때 사용
		
		os1.flush();	// 버퍼가 꽉 차지 않더라도 강제로 파일에 쓰기를 진행함 => 생략 가능. write를 사용하면 flush() 사용할 것을 권장
		os1.close();	// close() 호출시 flush() 먼저 작동됨
		
		// 2. n-byte 단위 쓰기 (byte[] 의 offset부터 length 개의 byte 데이터 쓰기
		OutputStream os2 = new FileOutputStream(outFile);	// 덮어쓰기
							// FileOutputStream(File o, Boolean append) => append : true(이어쓰기) / false( 덮어쓰기) * false가 기본값
		byte[] byteArray1 = "Hello!".getBytes();	// String -> byte로 변환 : getBytes() 메소드 사용
		
		os2.write(byteArray1);
		os2.write('\n');	// \r은 생략 가능, \n만 넣어도 Window 10 이상에서 enter 처리
		
		os2.flush();
		os2.close();
		
		// 3. n-byte 단위 쓰기 (byte[]의 offset부터 length객의 byte 데이터 쓰기
		OutputStream os3 = new FileOutputStream(outFile, true);		// 이어쓰기
		byte[] byteArray2 = "Better the last smile than the first laughter".getBytes();
		
		os3.write(byteArray2, 7, 8);	// 7byte부터 띄우고 시작하여 8byte 읽어와서 저장
										// read일 떄는 반대로 처리
		os3.flush();
		os3.close();
	}
	
}
