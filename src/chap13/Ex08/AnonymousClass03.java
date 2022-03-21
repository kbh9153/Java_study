package chap13.Ex08;

// class 정의 및 참조 변수를 사용/미사용의 경우 매개 변수로 객체를 전달

interface A {
	public abstract void abc();
}

// 1. 자식 class를 직접 생성
class B implements A {
	@Override
	public void abc() {
		System.out.println("매개변수 전달");
	}
}

class C {		// cde method에 인풋값으로 A 타입의 객체 a를 받음
	void cde(A a) {		// cde method를 호출하면서 매개변수로 A 타입의 객체를 전송 
		a.abc();
	}
}

public class AnonymousClass03 {

	public static void main(String[] args) {
		// 1번 방법 : class 이름 + 참조 변수명
		C c = new C();
		
		A a = new B();		// class 이름(A), 참조 변수(a) 생성
		
		c.cde(a);		// 매개변수에 객체 a를 생성 후 전송
		
		System.out.println("------------------------------ ");
		
		// 2번 방법 : class 이름 O + 참조변수명 X 
		c.cde(new B());

	}

}
