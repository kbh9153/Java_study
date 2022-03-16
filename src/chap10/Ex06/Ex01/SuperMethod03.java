package chap10.Ex06.Ex01;

// this()와 super()의 혼용 => 생성자 호출. 생성자 내부에서 사용. 첫 라인에 와야함
	// this() : 자신 객체의 생성자 호출
	// super() : 부모 객체의 생성자 호출

class AAAA {
	AAAA() {
		this(3);		// 자신의 객체 중 매개변수 1개인 생성자를 호출
		System.out.println("AAAA 생성자 1");
	}
	
	AAAA(int a) {
		System.out.println("AAAA 생성자 2");
	}
}

class BBBB extends AAAA {
	BBBB() {
		this(3);
		System.out.println("BBBB 생성자 1");
	}
	
	BBBB(int a) {
		System.out.println("BBBB 생성자 2");
	}
}

public class SuperMethod03 {

	public static void main(String[] args) {
		// 1. 객체 생성
		
		AAAA aaaa = new AAAA();
		
		System.out.println("-------------------");
		
		AAAA aaaa2 = new AAAA(3);
		
		System.out.println("-------------------");
		
		// 2. 자식의 객체 생성
		
		BBBB bbbb1 = new BBBB();
	}

}
