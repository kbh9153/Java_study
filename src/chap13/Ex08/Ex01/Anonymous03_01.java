package chap13.Ex08.Ex01;

/*
 * 3. method의 매개변수로 전달 : 빈번하게 사용하는 경우
 * 	3-1 : 객체 생성 후 매개변수로 전달 (class 이름 O + 참조변수 O)
 * 	3-2 : 객체 생성 후 매개변수로 전달 (class 이름 O + 참조변수 X)
 */

interface A {		// Interface, 추상 method를 정의
	void cry();		// 추상 method. 구현부가 없음. public abstract가 생략되어 있음
	void fly();
}

class B implements A {		// B는 A Interface를 구현한 class
	@Override
	public void cry() {
		System.out.println("멍멍 : 매개변수 전달");
	}
	
	@Override
	public void fly() {
		System.out.println("날지 못합니다 : 매개변수 전달");
	}
}

class C {		// C 객체의 abc method를 호출시 A 타입을 매개변수로 받음
	void abc(A a) {		// 하위 자식 class가 매개변수로 들어올 경우 A 타입으로 자동으로 업캐스팅
		a.cry();
		a.fly();
	}
}

public class Anonymous03_01 {

	public static void main(String[] args) {
		// 1. class O + 참조변수 O
		
		C c = new C();
		A a = new B();		// B를 객체화해서 A 타입으로 생성. a : 참조 변수
		
		c.abc(a);
		
		System.out.println("----------------------");
		
		// 2. class O + 참조변수 X
		
		c.abc(new B());
	}

}
