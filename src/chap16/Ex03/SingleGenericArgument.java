package chap16.Ex03;

/*
 * Object : 모든 객체를 저장할 수 있지만 다운캐스팅이 필요함. 캐스팅시 예외가 발생될 수 있음(약한 타입 체크)
 * Generic class : 하나의 class에서 다양한 데이터 타입을 처리 가능
 * 	- Generic Type Variable : T (타입), K (Key), V (Value), N (Number), E (Element)
 * 		1) A ~ Z 임의로 넣을 수 있음
 * 		2) wrapper class : 기본 타입을 객체화 시켜 놓은 class
 * 			※ int(기본타입) -> Integer(객체형 타입), boolean -> Boolean, Char -> Character, double -> Double, float -> Float
 * 			※ byte -> Byte, short -> Short, long -> Long
 * 			※ 특정 타입을 사용하지 않을 경우 Void 사용
 */
	

// Generic class
class MyClass<T> {
	private T t;
	
	public T get() {		// getter. 필드의 값을 가져오기
		return t;
	}
	
	public void set(T t) {		// setter. 필드값을 할당
		this.t = t;
	}
}

public class SingleGenericArgument {

	public static void main(String[] args) {
		// 1. Generic class 객체 생성 <String>을 입력
		MyClass<String> mc1 = new MyClass<String>();
		mc1.set("안녕");
		System.out.println(mc1.get());
		
		// 2. Generic class 객체 생성 <Integer>을 입력
		MyClass<Integer> mc2 = new MyClass<Integer>();		// <Integer> : wrapper class
		mc2.set(37);
		System.out.println(mc2.get());
		
		// 3. Generic class 객체 생성 <Double> 입력
		MyClass<Double> mc3 = new MyClass();		// 생성자의 자료형은 생략 가능
		mc3.set(73.4);
		System.out.println(mc3.get());
		
		// 4. 강한 타입 체크 (컴파일 단계에서 오류를 출력 해줌)
		MyClass<Boolean> mc4 = new MyClass<Boolean>();
		mc4.set(true);
		mc4.set(false);
		// mc4.set("안녕");		// 강한 타입 체크, 실행시에 오류를 방지 시켜줌
	}

}
