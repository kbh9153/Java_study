package chap19.Ex08;

import java.io.InputStreamReader;

public class InputStreamReader02 {

	public static void main(String[] args) {
		// 1. 콘솔 입력 (MS949) : default charset, byte 스트림
		try {
			// InputStreamReader : byte => char로 변환
			// System.in : 콘솔 입력, byte
			
			// isr은 변환된 char 타입을 가지고 있음
			InputStreamReader isr = new InputStreamReader(System.in, "MS949");
			
			System.out.println("첫번째 입력 ↓");
			
			int data;
			while ((data = isr.read()) != '\r') {	// 콘솔의 경우에는 입력값이기 때문에 '\r'
				System.out.print((char)data);
			}
			System.out.println();
			System.out.println();
			System.out.println(isr.getEncoding());
			System.out.println("---------------------");
		} catch (Exception e) {}
		
		// 2. 콘솔 입력 (UTF-8)
		try (InputStreamReader isr2 = new InputStreamReader(System.in, "UTF-8");) {
			
			System.out.println("두번째 입력 ↓");
			
			int data;
			while ((data = isr2.read()) != '\r') {
				System.out.print((char)data);
			}
			System.out.println();
			System.out.println();
			System.out.println(isr2.getEncoding());
		} catch (Exception e) {}
	}
}
