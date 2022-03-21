package chap13.Ex04;

// 지역 Innerclass : class의 method 내부에 선언된 class
	// method 내부의 필드는 final 키워드가 생략됨

class A {
	int a = 3;		// 필드 변수 : heap 메모리 공간에 값을 저장 (반드시 초기화가 강제로 진행)
					// 필드의 초기값을 할당 후 값을 수정할 때는 객체화 후 수정이 가능
					// 생성자나 setter를 통해서 초기값을 할당 후 객체를 생성
	
	A () {};
	
	A(int a) {
		this.a = a;
	}
	
	public void setA(int a) {		// setter를 통해서 필드의 값을 초기화
		this.a = a;
	}



	void aaa() {		// 지역 변수 : method 내부의 변수. 스택 메모리에 저장
		int a = 3; 		// 지역 변수. 초기값 3 할당
		a = 4;			// a 변수의 값을 4로 변경
		a = 10;			// a 변수의 값을 10으로 변경
		
		int b;
		
		System.out.println(a);
		// System.out.println(b);		// b 지역 변수는 초기값을 할당하지 않아 오류 발생(초기값 할당 X = heap 메모리 공간이 초기화 X)
	}
	
	void abc() {
		int b = 5;		// 지역변수 : method 내부에 선언된 변수 (final이 컴파일러에 의해서 할당)
						// 자동으로 final 키워드가 컴파일러에 의해서 자동으로 할당
		class B {		// 지역 inner class
			void bcd() {
				System.out.println(a);		// 필드
				System.out.println(b);		// 지역변수 : final이 생략됨. 값 수정 불가
				
				a = 5;
				// b = 7;		// 지역 class 내부에 선언된 지역변수는 자동으로 final 키워드가 컴파일러에 의해서 할당
			}
		}
	}
}

public class InnerClass04 {
	
	public static void main(String[] args) {
		// 1. 객체를 생성 후 method 호출
		A aa = new A();
		aa.abc();
	}

}
