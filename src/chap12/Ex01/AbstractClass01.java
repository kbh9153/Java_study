package chap12.Ex01;

class AA {		// 일반 class : 객체 생성시 객체명은 stack 영역. 필드명와 메소드명은 heap 메모리 영역에 저장
					// heap : 반드시 초기화된 값을 가짐
					// 필드 : heap 메모리 영역에 필드명과 값을 가지고 있음
					// 인스턴스 메소드 : class 메모리 영역의 인스턴스 영역에 메소드의 구현코드를 저장
					// heap 메모리 영역에는 구현부의 위치를 나타내는 포인터 정보만 가짐
	int a ;
	double b;
	char c ;		// char는 값이 할당되지 않으면 공백을 출력
	boolean d ;
	byte e;
	float f;
	String g;		// 참조 변수
	
	void cry() {}
	
	@Override
		public String toString() {
			return a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f + ", "  + g;
		}
}

// 1. 추상 class를 객체화해서 출력하는 방법1
	// => 상속을 통해서 자식 class를 생성 후 자식 class에서 추상 method를 재정의하고 자식 class를 객체화
	// => 많은 객체를 생성하는 경우 사용
	
// 2. 추상 class를 객체화해서 출력하는 방법2
	// => 자식 class 생성없이 main method에서 익명 객체를 생성해서 출력하는 방법
	// => 자식 객체를 생성할 필요없이 임시로 사용할 경우 사용

abstract class A {		// 추상 class : 미완성 method를 포함하므로 객체 생성이 불가
	abstract void abc();		// 추상 method : 미완성 method. 구현부가 존재하지 않는 method
}

class B extends A {		// 추상 class를 구현한 객체 : 빈번하게 사용할 경우
	@Override
	void abc() {
		System.out.println("방법 1 : 자식 class 생성 및 추상 class 구현");
		
	}
	
}

public class AbstractClass01 {

	public static void main(String[] args) {
		// 1. AA class는 객체화가 가능함
		
		AA aa = new AA();		// 필드 : 자동 초기화, 일반 메소드 (구현부가 존재하는 메소드) 
		System.out.println(aa);		// 객체를 생성하려면 heap 공간에 값이 반드시 들어가 있어야함
		
		// 2. 추상 메소드는 객체 생성 불가 : 메소드가 미완성 메소드이기 때문에 객체 생성이 불가함
		// A a = new A();		// 객체 생성이 불가, 추상 메소드를 포함하고 있기 때문
		
		// 3. 추상 class가 구현된 자식 class 생성, 객체를 여러개를 생생할 때 
		A a1 = new B();
		A a2 = new B();
		A a3 = new B();
		
		// 4. method 호출
		a1.abc();		// A의 abc() method 호출
		a2.abc();
		a3.abc();
		
	}
	

}
