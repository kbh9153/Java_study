package chap19.Ex06;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class ConsoleInputObject03 {
	
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;		// is 콘솔을 통해서 인풋 받음
			
		// InputStream is2 = System.in;		// System.in은 한 페이지에서 한번만 만들 수 있음
		
		// 1. 1byte 단위 읽기
		int data;
		while ((data = is.read()) != '\r') {	// \r 까지 
			System.out.print((char)data);
		}
		is.read();		// 10 (\n ASCII CODE) 버퍼에 \n 이 남아있음. 버퍼에서 \n을 처리해줘야 다음 read()에 \n 들어가지 않음. 처리하지 않으면 다음 read()에 \n이 들어감
		
		System.out.println();
		System.out.println();
		System.out.println("===============================");
		
		// 2. n-byte 읽기 (byte[]의 처음 위치에서 읽은 데이터 저장)
		byte[] byteArray1 = new byte[100];
		int count1 = is.read(byteArray1);		// 콘솔에서 배열에 저장될 때 \r\n까지 들어감
			// count1 배열에서 읽은 값의 개수를 저장
		
		for (int i = 0; i < count1; i++) {
			System.out.print((char)byteArray1[i] + "(" + byteArray1[i] + ")");
			System.out.println(" : count1 = " + count1);
		}
		System.out.println("===============================");
		
		int count2;
		count2 = is.read(byteArray1);		// 배열 내부에 \r\n이 들어감
		System.out.println(new String(byteArray1, 0, count2));
		
		/*
		while ((count2 = is.read(byteArray1)) != '\r') {		// is.read(배열)이 들어갈 경우 배열을 읽은 횟수가 count2로 할당되어 \r을 찾을 수 없기 때문에 무한루프가 진행
			System.out.println(new String(byteArray1));
		}
		*/
		// is.read(); // => 버퍼에서 뺴지않아야 함. 배열 내부에 \r\n 들어가서 
		
		System.out.println("===============================");
		
		// 3. n-byte 단위로 읽고 length만큼 읽어와서 byte[] offset 위치에서 저장
		byte[] byteArray2 = new byte[8];
		int offset = 3;
		int length = 5;
		int count3 = is.read(byteArray2, offset, length);
		
		for (int i = 0; i < offset + length; i++) {
			System.out.print((char)byteArray2[i]);
		}
		
		is.close();		// 제일 마지막에 처리해줘야함. 중간에 close()할 경우 다시 호출이 불가능
		
	}
}
