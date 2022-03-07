package chap06_07.Ex04;

// Aaa class는 하위의 생성자 여러개를 사용할 경우 this(); 없이 사용한 경우 : 중복된 값을 매번 입력
class Aaa {
	int m1, m2, m3, m4;		// 필드변수 4개 선언
	
	Aaa() {			// 매개변수가 없는 생성자 => 필드변수의 값을 초기화 후 값 설정
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	};
	
	Aaa(int a) {
		m1 = a;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	
	Aaa(int a, int b) {
		m1 = a;
		m2 = b;
		m3 = 3;
		m4 = 4;
	}
	
	void print() {		// 각 메모리의 값을 출력 ...
		System.out.println(m1 + " ");
		System.out.println(m2 + " ");
		System.out.println(m3 + " ");
		System.out.println(m4 + " ");
	}
	
}

//Aaa class는 하위의 생성자 여러개를 사용할 경우 this();를 사용한 경우 : 중복된 값을 제거
class Bbb {
int m1, m2, m3, m4;		// 필드변수 4개 선언
	
	Bbb() {			// 매개변수가 없는 생성자 => 필드변수의 값을 초기화 후 값 설정
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	};
	
	Bbb(int a) {
		this();		// 인풋값이 없는 생성자 호출
		m1 = a;
	}
	
	Bbb(int a, int b) {
		this(a);		// 인풋값이 1개인 생성자 호출
		m2 = b;
	}
	
	void print() {		// 각 메모리의 값을 출력 ...
		System.out.println(m1 + " ");
		System.out.println(m2 + " ");
		System.out.println(m3 + " ");
		System.out.println(m4 + " ");
	}
}

public class ThisMethod_02 {

	public static void main(String[] args) {
		// 1. 3가지 객체 생성 (this 미사용)
		Aaa a = new Aaa();		// 매개 변수가 없는 생성자 호출
		a.print();
		
		System.out.println();
		
		Aaa aa = new Aaa(10);		// 매개 변수가 1가지인 생성자 호출
		aa.print();
		
		System.out.println();		// 매개 변수가 2가지 생성자 호출
		
		Aaa aaa = new Aaa(10, 20);
		aaa.print();
		
		System.out.println("-------------------------");
		
		// 2. 3가지 객체 생성 (this 사용)
		Bbb b = new Bbb();		// 매개 변수가 없는 생성자 호출
		b.print();
		
		System.out.println();
		
		Bbb bb = new Bbb(30);		// 매개 변수가 1가지인 생성자 호출
		bb.print();
		
		System.out.println();		// 매개 변수가 2가지 생성자 호출
		
		Bbb bbb = new Bbb(30 ,40);
		bbb.print();
		
	}

}
