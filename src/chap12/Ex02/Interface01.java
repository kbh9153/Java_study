package chap12.Ex02;

// Interface : 외부와 내부를 연결시켜주는 접점
	// ex 1. TV(서비스) - 콘센트(인터페이스) - 가전제품(사용자)
	// ex 2. TV(서비스) - 리모콘(인터페이스) - 사람(사용자)
	// ex 3. 서비스 및 기능(서비스) - API(인터페이스) - 고객(사용자)

// 객체 생성불가. 타입은 설정 가능
// 모든 필드는 반드시 public static final 작성
// 모든 method는 반드시 public abstract 기재 (생략시 자동추가 => Java 1.8), default method 제외 

interface A {
	public static final int A = 3;		// Interface의 필드 정식 표현
	public abstract void abc();			// Interface의 method의 정식 표현
}

interface B {
	int A = 3;		// Interface 필드 정식 표현 중 public static final 생략
	void abc();		// Interface method 정식 표현 중 public abstract 생략 = 추상 method
}

abstract class C {		// 추상 class의 abstract가 생략되면 오류 발생 => 생략은 Interface만 가능
	abstract void abc();		// 추상 method의 abstract가 생략되면 오류 발생 => 생략은 Interface만 가능
}

public class Interface01 {

	public static void main(String[] args) {
		// Interface는 객체 생성 불가. 구현되지 않는 method가 포함되어 있기 때문
		// A a = new A();		// A가 Interface이므로 객체 생성 불가
		
		// 1. Interface의 static 필드의 값을 출력
		System.out.println(A.A);		// Interface의 필드 출력. A => static
		System.out.println(B.A);
		
		// 2. final이 적용되어 있기 때문에 값 수정 불가
		// A.A = 5;		// final이 설정되어 있어 값 수정 불가
		// B.A = 6;		// final이 설정되어 있어 값 수정 불가
	}

}
