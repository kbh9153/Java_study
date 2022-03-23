package chap14.Ex04;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource01 {

	public static void main(String[] args) {
		// 1. 수동 리소스 해제
		System.out.println("문자를 입력하세요.");
		
		InputStreamReader isr2 = null;		// 사용 후 반드시 메모리에서 객체를 삭제. isr2.close()
		// System.in : Console에서 입력을 받도록 처리 => 단, 한번만 input(입력)받을 수 있음. 객체가 종료되면 반복하여 input 받지 못함
		
		try {
			isr2 = new InputStreamReader(System.in);
			char input = (char)isr2.read();		// 일반예외(checked 예외) => IOExcepiton : 입력 출시
			System.out.println("입력글자 = " + input);
		} catch (IOException e) {
			e.printStackTrace();		// try{} 블록에서 예외가 발생될 경우 자세한 정보 출력
		} finally {		// 객체를 사용 후 메모리 영역에서 삭제
			// 리소스 해제 : isr2.close()
			if (isr2 != null) {
				try {
					isr2.close();		// 일반예외 : IOException
				} catch (IOException e) {
					e.printStackTrace();
				}		
			}
		}
		
		// 2. 자동 리소스 해제 => Java 1.7 자동으로 리소스를 해제. 간결한 코드가 장점 (필요 조건이 있음)
			// 2-1. 사용하는 객체가 AutoCLoseable interface를 구현한 객체여야 함
			// 2-2. 반드시 객체에 close()가 존재해야함
			// 위의 2가지 조건을 만족할 때 자동 리소스 해제
			// try(자동으로 리소스를 해제할 객체 선언) {} catch{} finally{}
		
		// InputStreamReader : AutoClosealble interface를 구현하고 있음. close() 가지고 있음
		// Try with Resource : try (with resource : 객체 메모리 로드) {}
		try(InputStreamReader isr1 = new InputStreamReader(System.in);) {
			char input = (char) isr1.read();
			System.out.println("입력글자 = " + input);
		} catch(IOException e) {
			e.printStackTrace();
		} // finally 블록을 생략하더라도 객체를 자동으로 close()
	}

}
