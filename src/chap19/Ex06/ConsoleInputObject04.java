package chap19.Ex06;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/*
 * 콘솔 인풋시 한글 처리 : 1byte씩 읽으면 한글 처리가 불가능. 배열로 읽어야 한글 처리가 가능
 * InputStream System.in
 */

public class ConsoleInputObject04 {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;		// System.in은 한 페이지에서 한번만 만들 수 있음. close() 제일 마지막에 사용
		
		// 2. n-byte 배열 읽기 (byte[] 처음 위치에서 읽은 데이터 저장)
		byte[] byteArray1 = new byte[100];
		
		System.out.println("한글을 입력하세요.");
		
		int count1 = is.read(byteArray1);		// \r\n 포함, count1은 배열 읽은 수
		String str1 = new String(byteArray1, 0,  count1, Charset.defaultCharset());
		
		System.out.println(str1);
		System.out.println("베열 방의 총 개수(r과 n포함) : " + count1);
		System.out.println();
		System.out.println("------------------------------");
		
		// 3. n-byte 단위 읽기 (length만큼 읽어와서 byte[] 배열의 offset[index] 위치에 저장)
		byte[] byteArray2 = new byte[9];
		int offset = 3;
		int length = 6;
		int count2 = is.read(byteArray2, offset, length);
		
		System.out.println(new String(byteArray2, 0, offset + count2, Charset.defaultCharset()));
	}
}
