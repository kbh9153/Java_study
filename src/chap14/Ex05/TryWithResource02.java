package chap14.Ex05;

// Resource : 메모리를 뜻함

/*
 * 직접 생성한 객체에서 AutoCloseable을 사용해보기
 * 	try (객체 생성구문) {} catch {} : 자동으로 close() 됨		// try (With Resource)
 * 		1. AutoCloseable interface의 close()를 method를 overriding 구현해야함
 */

// java.lang.AutoCloseable : java.lang => import 문을 사용하지 않아도 됨
// java.long.Object

/*
 *  예외를 처리하는 방법
 *  	1. try catch를 사용해서 예외 처리 : 자신이 직접 예외를 처리하겠다
 *  	2. throws를 통해서 예외를 처리하는 방법	 : 예외를 내가 처리하지 않고 호출하는 곳에서 예외를 처리하도록 보류
 *  		=> 예외 전가. method 예외 전가
 */

// throw : 예뢰를 강제로 발생시킴
	

class A implements AutoCloseable {
	String resource;		// 선언된 값이 없어 현재 null
	
	A (String resource) {		// 생성자의 매개변수로 String 값을 받아서 메모리로 로딩
		this.resource = resource;
	}
	
	@Override
	public void close() throws Exception {		// close() method가 자동으로 호출
		System.out.println(resource);
		
		if (resource != null) {
			resource = null;
			System.out.println("리소스가 해제되었습니다.");
			System.out.println(resource);
		}
	}
}

public class TryWithResource02 {

	public static void main(String[] args) {
		// 1. 자동 리소스 해제 사용
		try ( A a1 = new A("특정 파일");) {
			
		} catch (Exception e) {
			System.out.println("예외가 발생되었습니다.");
		} // finally 블록에 a1.close() 자동으로 호출
		
		System.out.println("-------------------");
		
		// 2. 수동 리소스 해제 사용
		A a2 = null;
		
		try {
			a2 = new A("생성자 초기값 할당");
		} catch (Exception e) {
			
		} finally {		// 
			if (a2.resource != null) {
				try {
					a2.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
