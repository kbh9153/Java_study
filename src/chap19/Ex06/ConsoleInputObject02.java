package chap19.Ex06;

import java.io.IOException;
import java.io.InputStream;

/*
 * System.in : Console에서 input을 받는 Java에서 제공해 주는 객체. InputStream
 * 	- Windows : Console에서 Enter => \n\r
 * 	- Mac : Console에서 Enter => \n
 * System.oput : Console로 출력을 하는 객체. OutputStream
 */

public class ConsoleInputObject02 {

	public static void main(String[] args) throws IOException {
		// 스트림은 한번 사용하면 재사용이 불가능
		
		// 1. Console에서 input 받기위한 객체 생성
		InputStream is1 = System.in;		// is1는 콘솔에서 인풋받아서 처리하는 객체
		System.out.println("값을 입력하세요.");
		
		int data1;
		// while ((data1 = is1.read()) != -1) {		 // -1 : 처음부터 끝까지
		while ((data1 = is1.read()) != '\n') {
			System.out.print((char)data1);
		}
		System.out.println();
		
		System.out.println(data1);	// 13 (\r ASCII code)
		System.out.println(is1.read());		// 10 (\n ASCII code)
		
		System.out.println("==============================");

		
		
	}
}
