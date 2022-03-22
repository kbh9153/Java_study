package chap13.Ex10.Ex01;

class A {
	B b;		/* 
				 * B : interface 타입, b : 참조 변수 (값을 할당하는 방법)
				 * b : null
				 * 	1. 객체 생성 후 값을 할당
				 * 	2. 생성자를 통해서 값을 할당
				 * 	3. setter를 통해서 값을 할당
				 */  
				
	A () {};	// 기본 생성자
	
	A (B b) {
		this.b = b;
	}
	
	public void setB(B b) {
		this.b = b;
	}

	interface B {
		void paly();
		void stop();
	}
	
	void abc() {		// play() 재정의, stop() 재정의
		b.paly();
		b.stop();
	}
	
}

public class InnerInterface01_01 {

	public static void main(String[] args) {
		A aa = new A();		// A a
		
		aa.setB(new A.B() {
			@Override
			public void stop() {
				System.out.println("살려주세용 살려주세용 살려주세용");
			}
			
			@Override
			public void paly() {
				System.out.println("누구쎄용?");
			}
		}
	);
	aa.abc();
	
	System.out.println("------------------------");
	
	// 1. 객체 생성 후 필드의 값을 할당
	A aaa = new A();
	
	aaa.b = (A.B) new A.B() {		// interface : A.B
		@Override
		public void paly() {
			System.out.println("누구쎄용?");
		}
		
		@Override
		public void stop() {
			System.out.println("살려주세용 살려주세용 살려주세용");
		}
	};
	aaa.abc();
	
	System.out.println("------------------------");
	
	// 2. 생성자를 이용해서 값을 할당
	A aaaa = new A(new A.B() {		// 생성자 내부에 A.B 타입의 객체 생성 후 주입
		@Override
		public void stop() {
			System.out.println("살려주세용 살려주세용 살려주세용");
		}
		
		@Override
		public void paly() {
			System.out.println("누구쎄용?");
		}
	}
	
);
	aaaa.abc();
	
	}

}
