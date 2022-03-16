package chap10.Ex06.Ex01;

// super 키워드 : 부모 class 지칭. method 내부에서 사용. 생성자 내부에서도 사용

// super() : 생성자 내부에서만 사용. 부모 생성자를 호출할 때 사용 (상속 관계 O)
	// => 반드시 첫 라인에 위치해야함

// this 키워드 : 자신의 객체를 지칭. method 내부에서 사용. 생성자 내부에서도 사용. 필드 이름 앞. method 이름 앞

// this() : 생성자 내부에서만 사용. 다른 생성자를 호출할 때 사용 (상속 관
	// => 반드시 첫 라인에 위치해야함

class AAA {
	AAA() {
		System.out.println("AAA 생성자");
	}
}

class BBB extends AAA {
	BBB() {
//		super();
		System.out.println("BBB 생성자");
	}
}

class CCC {
	CCC() {};
	
	CCC(int a) {
		System.out.println("CCC 생성자 : " + a);
	}
}

class DDD extends CCC {
	DDD() {
		super();
	}
	
	DDD(int a) {
		super(3);
		System.out.println("DDD 생성자 정수 1개 : " + a);
	}
}

public class SuperMethod01 {

	public static void main(String[] args) {
		// 1. 객체 생성
		
		AAA aaa = new AAA();		// 기본 생성자 호출
		
		System.out.println("------------------------");
		
		
		BBB bbb = new BBB();		// 기본 생성자 호출
		
		System.out.println("------------------------");
		
		DDD ddd = new DDD(5);
		
		
		/*
		System.out.println("------------------------");
		
		DDD eee = new DDD(5);
		*/


	}

}
