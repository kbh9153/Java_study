package chap13.Ex09.Ex01;

interface A {
	void cry();
	void fly();
}

class C {
	void abc(A a) {
		a.cry();
		a.fly();
	}
}

public class Anonymous04_01 {

	public static void main(String[] args) {
		C c = new C();
		// 1. class X + 참조 변수 O
		A a = new A() {		// 참조 변수 a 생성
			@Override
			public void cry() {
				System.out.println("개는 멍멍");
			}
			
			@Override
			public void fly() {
				System.out.println("개는 날지 못합니다");
			}
		};
		
		c.abc(a);
		
		System.out.println("----------------------");
		
		// 2. class X + 참조 변수 X
		c.abc(new A() {
			@Override
			public void cry() {
				System.out.println("고양이는 야옹");
			}
			
			@Override
			public void fly() {
				System.out.println("고양이도 날지 못합니다");
			}
		});
	}

}
