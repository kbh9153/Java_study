package chap16.Ex07;

/*
 * Generic Class : class를 선언할 때 타입 변수를 선언 => ex. <T> : Generic class를 정의, 객체를 생성시 T에 적용할 타입을 지정
 * Generic Method : 일반 class 내부의 method 선언시 Generic 타입 변수를 사용
 */

class GenericGeneralMethod {		// 일반 class
	public<T> T method1 (T t) {		// Generic method : 1개
		return t;
	}
	
	public<T> boolean method2 (T t1, T t2) {		// Generic method : 1개
		return t1.equals(t2);		// 두 값을 비교 true or false 반환
									// 기본 자료형일 떄 : 값을 비교
									// 참조 자료형일 때 : 값의 주소를 비교
									// String의 경우 : 값을 비교. Integer, Double equals가 재정의 되어 있음
	}
	
	public<K, V> void method3 (K k, V v) {		// Generic method : 2개
		System.out.println(k + " : " + v);
	}
	
	public<K, V> void method4 () {
		System.out.println("매개변수가 인풋 값으로 없는 경우 생략시 오류 발생");
	}
}

public class GenericMethod {

	public static void main(String[] args) {
		// 1. 일반 class 객체 생성 후 Generic method 호출
		GenericGeneralMethod ggm = new GenericGeneralMethod();
		String str1 = ggm.<String>method1("안녕");
		String str2 = ggm.method1("안녕");		// 타입을 알 수 있는 경우 생략 가능(매개변수로 값이 들어갈 때 생략 가능)
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("---------------");
		
		Integer i1 = ggm.<Integer>method1(7);
		Integer i2 = ggm.method1(4);
		
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println("---------------");
		
		Boolean b1 = ggm.<Boolean>method1(true);
		Boolean b2 = ggm.method1(false);
		
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println("---------------");
		
		Boolean d1 = ggm.<Double>method2(2.55, 2.55);		// return 타입은 Boolean
		Boolean d2 = ggm.<Double>method2(2.55, 2.45);		// return 타입은 Boolean
		
		System.out.println(d1);
		System.out.println(d2);
		
		System.out.println("---------------");
		
		ggm.<String, Integer>method3("국어", 90);
		ggm.method3("영어", 87);		// 매개변수로 인풋되는 데이터 타입을 알 수 있는 경우 생략 가능
		
		ggm.<Integer, String>method3(500,"서버 에러");
		ggm.method3(402, "파일을 찾을 수 없습니다.");
		
		System.out.println("---------------");
		
		ggm.method4();
	}

}
