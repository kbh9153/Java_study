package chap19.Ex06;

import java.io.IOException;
import java.io.OutputStream;

public class ConsoleOutputObject01 {

	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;		// System.out : 콘솔에 출력
		// 1. 1byte 출력
		os.write('J');
		os.write('A');
		os.write('V');
		os.write('A');
		os.write('\r');
		os.write('\n');		// 버퍼에서만 저장되어 있음
		
		os.flush();		// 버퍼의 내용을 콘솔에 출력
		// os.close();
		
		// 2. n-byte 출력
		byte[] byteArray1 = "Hello".getBytes();
		os.write(byteArray1);
		os.write('\n');		// \r 먼저 \n 순서 주의!
		os.flush();
		
		// 3. n-byte 출력
		byte[] byteArray2 = "Better the last smile than the first".getBytes();
		os.write(byteArray2, 7, 8);		// write(byte 배열, offset, length)
		os.flush();
		
		os.close();
	}

}
