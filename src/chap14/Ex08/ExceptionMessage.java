package chap14.Ex08;

public class ExceptionMessage {

	public static void main(String[] args) {
		// 1. 예외 객체 생성시 메세지 전달 하지 않는 경우
		try	{
			throw new Exception();		// 예외 강제 발생, Exception의 기본 생성자 호출 시 메세지 X
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("---------------");
		
		// 2. 예외 객체 생성시 메세지 전달하는 경우
		try {
			throw new Exception("예외 메세지 출력");		// Exception 객체 생성자에 String 값을 넣어주면 catch 블록에서 예외 메세지를 출력 가능
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
