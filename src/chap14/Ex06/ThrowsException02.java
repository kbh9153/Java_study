package chap14.Ex06;

/*
 * 일반 예외 (Checked Exception) : 컴파일 단계에서 예외
 * 	1. 직접 처리
 * 	2. throws 전가 (미루다)
 */

// main method에 throws 방식으로 예외를 전가시키는 경우 => Exception이 발생될 경우 throws된 예외를 처리하는 것이 아니라 오류 정보를 출력 후 종료되어버림


public class ThrowsException02 {

	public static void main(String[] args) throws ClassNotFoundException {
		// 정상적으로 파일(java.lang.Object)이 존재. ClassNotFoundException 발생 X
		Class cls = Class.forName("java.lang.Object");
		
		// 파일(java.lang.Object37)이 존재하지 않음. ClassNotFoundException 발생 O
		Class cls2 = Class.forName("java.lang.Object37");

	}

}
