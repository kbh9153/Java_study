package chap14.Ex01;

public class CheckedException01_01 {

	public static void main(String[] args) {
		
		try {
			System.out.println(10 / 0);		// 프로그램이 비정상 종료되어 버림
		} catch (ArithmeticException e) {		// 예외에 대한 처리
			// e.printStackTrace();		// try{}에서 오류가 발생할 경우에 작동
			// System.out.println("0을 넣을 수 없습니다.");
			// catch 블록의 설정을 하지 않아도 예외처리가 된것이다.
		} finally {
			// try{} 오류가 없어도 작동(O), 오류가 있어도 (O)
			// try{}가 작동되면 항상 작동
			// 객체를 사용 후 객체의 메모리를 제거할 때 => ex) sc.close(); 등을 finally 구간에 작성
		}
		
		System.out.println("프로그램을 정상 종료 합니다.");		// 정상 종료
		

	}

}
