package chap06_07.Ex06;

class Abc {		// 외부 클래스 : public 제어자를 사용 못함. default
					// => public class는 class 파일 내 한번만 사용 가능. public이 붙은 class가 파일명과 동일하기 때문
					// class에 사용 가능한 접근 제어자 : public, default
					// 접근 제어자가 붙을 수 있는 키워드 : class 앞, 필드 앞, method 앞, 생성자 앞
					// 반드시 젭근 제어자가 할당되어 있음. 생략되어 있으면 default가 생략된 것
					// 접근 제어자
						// 1. public : 다른 package에서 접근 가능
						// 2. protected : 다른 package에서 접근 가능 (상속 구현이 되어있어야 가능)
						// 3. default : 같은 package에서 접근 가능. 같은 package에 존재하는 class는 import없이 사용 가능
						// 4. private : 같은 class 내부에서만 사용 가능
	
	public int a = 10;
	protected int b = 20;
	int c = 30;
	private int d = 40;
	
	// Abc() {} => 기본 생성자 : 변수의 초기값을 부여해서 객체를 생성
	
	public void print1() {
		System.out.println("다른 package에서 접근 가능 : public");
	}
	
	protected void print2() {
		System.out.println("다른 package에서 접근 가능(상속관계가 구성되어 있을 때 : protected");
	}
	
	void print3() {
		System.out.println("같은 package에서 접근 가능 : default");
	}
	
	private void pritn4() {
		System.out.println("같은 class에서만 접근 가능 : private");
	}
}

public class Ex06_All {

	public static void main(String[] args) {
		Abc abc1 = new Abc();		// 객체화. 기본 생성자 호출
		// Abc : class 이름, abc1 : 메모리에 로드할 객체명, new : 객체를 heap 메모리 영역에 생성, Abc() : 생성자 호출 
			// Abc() : 기본 생성자 => 생략 가능
				// 생성자 : 1. class이름과 동일한 method, return 타입이 없는 method 생성자
		
		// 같은 package 안에서 필드 호출
		abc1.a = 100;	// public
		abc1.b = 200;	// protected
		abc1.c = 300;	// default
		// abc1.d = 400;	// private : 다른 class에서 접근 불가
		
		// 같은 package 안에서 method 호출
		abc1.print1();		// public
		abc1.print2();		// protected
		abc1.print3();		// default
		// abc1.print4();	// private
	}

}
