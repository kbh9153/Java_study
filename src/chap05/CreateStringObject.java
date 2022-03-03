package chap05;

public class CreateStringObject {

	public static void main(String[] args) {
		
		// 1. String 객체 생성 1 : new 키를 사용해서 객체 생성 : Heep 영역 별도의 공간에 값을 저장
		// RAM(메모리)의 값을 절대 공유하지 않는다.
		
		String str1 = new String("안녕");		
		String str11 = new String("안녕");		// str1과 str11은 값이 같지만, 별도의 메모리 공간을 갖는다.
		System.out.println(str1);			
		/*
		 * new 키는 객체를 생성하라는 의미 (Heep 메모리에 저장해라)	
		 * String은 객체를 출력했을때 객체의 값이 출력	
		 * 다른 객체변수들은 heep영역의 메모리주소를 출력
		 * 	객체변수의 값을 출력할때는 객체명.toString() 재정의							
		*/
		
		if (str1 == str11) {					// 참조 자료형일 때, ==은 메모리 주소를 비교하는 것이다.
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		System.out.println("====================");
		
		// 2. 리터럴 값을 바로 할당 : 같은 값일 경우, RAM(메모리)를 공유
		String str2 = "안녕하세요.";		// 변수의 값을 통칭해서 리터널이라고 한다.
		String str22 = "안녕하세요.";		// str2와 str22는 값이 같으므로, 동일한 메모리 공간을 갖는다.
		
		if (str2 == str22) {					// 참조 자료형일 때, ==은 메모리 주소를 비교하는 것이다.
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
