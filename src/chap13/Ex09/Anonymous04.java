package chap13.Ex09;

// 매개변수로 받아서 처리 : Interface를 구현한 class가 X

interface A {
	void abc();
}

class C {
	void cde(A a) {
		a.abc();
	}
}

public class Anonymous04 {

	public static void main(String[] args) {
		C c = new C();
		
		// 3. Interface를 구현한 class X + 참조변수를 생성 O
		A a = new A() {		// Interface를 구현한 자식 익명 객체 생성 후 타입을 A로 지정한 참조변수로 생성
			@Override
			public void abc() {
				System.out.println("클래스(X) + 참조변수(O)");
			}
		};
		
		c.cde(a);		// 참조 변수를 매개변수로 전달
		
		// 4. Interface를 구현한 class X + 참조변수를 생성 X => 가장 많이 사용 (임시로 한번만 사용할 때)
			// => 이벤트 처리 사용
		
		c.cde(new A() {
			@Override
			public void abc() {
				System.out.println("class (O) + 참조변수 (X)");
				
			}
		});

	}

}
