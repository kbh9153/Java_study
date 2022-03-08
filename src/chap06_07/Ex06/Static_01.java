package chap06_07.Ex06;

class Aaa {
	int m = 3;			// 인스턴스 필드 => static이 붙지 않은 필드 (객체를 생성 후에 사용 가능)
	static int n = 4;		// 스태틱 필드 => static이 붙은 필드 (객체 생성없이 사용 가능, 객체 생성 후에도 사용 가능)
								// => 모든 객체가 공유하는 필드
	
	void print1() {		// method (instance method) : 객체를 생성 후 호출 가능
		System.out.println("instance method 출력 : " + " m => " + m + "\n" + "static method 출력 : n => " + n);
		
	}
	
	static void print2() {		// method (static method) : 객체 생성없이 호출 가능, 객체 생성 후에도 호출 가능
								// static method는 객체 생성없이 호출이 되므로 instance 필득가 올 수 없음
		System.out.println("static method 출력 : n => " + n);
	}
}

public class Static_01 {

	public static void main(String[] args) {
		// 1. 객체 생성 후 필드와 method 호출	(instance 필드, static 필드, instance method, static method 모두 호출 가능)
		Aaa aaa = new Aaa();
		aaa.m = 7;		// instance 필드 호출
		aaa.n = 3;		// static 필드 호출
		aaa.print1(); 	// instance method 호출
		
		System.out.println("---------------------------------");
		
		aaa.print2();	// static method 호출
		
		// 2. 객체 생성없이 필드와 method 호출 (static 필드, static method 호출 가능)
		Aaa.n = 100;		// static 필드 : class 명으로 호출
		
		System.out.println("---------------------------------");
		
		Aaa.print2();		// static method : class 명으로 호출
		
		Aaa bbb = new Aaa();
		System.out.println(bbb.n);		// 100
		
		Aaa ccc = new Aaa();
		System.out.println(ccc.n);		// 100
		
		Aaa ddd = new Aaa();
		System.out.println(ddd.n);		// 100
		
		Aaa eee = new Aaa();
		System.out.println(eee.n);		// 100
		
		eee.n = 300;
		System.out.println("-------<< static이 적용된 필드는 모든 객체에서 값이 공유됨 >>-------");
		System.out.println(aaa.n);
		System.out.println(bbb.n);
		System.out.println(ccc.n);
		System.out.println(ddd.n);
		System.out.println(eee.n);
		
		System.out.println("-------<< static이 적용된 필드는 모든 객체에서 값이 공유됨 >>-------");
		Aaa.n = 370;
		
		System.out.println(aaa.n);
	}

}
