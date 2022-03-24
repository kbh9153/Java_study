package chap14.Ex08;

import javax.swing.SpinnerNumberModel;

/*
 * method의 throws를 전가, 전가, 전가 main 전가
 * 	=> main method까지 예외가 전가된 경우에는 예외 결과창만 출력하고 프로그램 종료
 * 	=> main method는 예외 처리하지 않음
 */

class AA {
	public void abc() throws NumberFormatException {
		bcd();
	}
	
	public void bcd() throws NumberFormatException {
		cde();
	}
	
	public void cde() throws NumberFormatException {
		int num = Integer.parseInt("10A");		// Exception(NumberFormatException) 발생
	}
}

public class ExceptionMethod {

	public static void main(String[] args) throws NumberFormatException {
		// 1. 객체 생성
		AA aa = new AA();
		
		// 2. method 호출
		
		// aa.abc();
		
		try {
			aa.abc();		// 실행 예외 (컴파일 단계에서는 오류가 없음)
		} catch (NumberFormatException e) {
			System.out.println("예외 발생\n<< Exception Info >>");
			e.printStackTrace();		// 예외의 자세한 정보를 출력
		}		
		
		System.out.println("프로그램 종료");
	}

}
