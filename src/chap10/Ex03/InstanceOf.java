package chap10.Ex03;

// instanceof : 객체 내부의 캐스팅 가능 여부를 확인할 수 있도록 하는 키워드
	// 업캐스팅한 객체 내부에 어떤 타입이 존재하는지 True, False로 return
	// 다운 캐스팅 시 해당 타입 확인을 위해 사용 (런타임 오류가 발생 방지)

class A {
	int m;
	
	void a() {
		System.out.println("m : " + m);
	}
}

class B extends A {
	int n;
	
	void b() {
		System.out.println("n : " + n);
	}
}

public class InstanceOf {

	public static void main(String[] args) {
		// 1. instanceof 문법 => 객체명 instanceof 타입
		A aa = new A();		// aa는 A 타입만 가짐
		A ab = new B();		// ab는 A, B타입을 포함하고 A만 접근 가능
		
		System.out.println(aa instanceof A);		// true
		System.out.println(aa instanceof B);		// false
		System.out.println(ab instanceof A);		// true
		System.out.println(ab instanceof B);		// true

		if (aa instanceof B) {		// aa 객체에 B 타입이 포함되어 있을 경우 B => A 다운 캐스팅 진행
			B b = (B) aa;		// 런타임시 오류를 방지할 목적
			System.out.println("aa를 B 타입으로 캐스팅 했습니다.");
		} else {
			System.out.println("aa는 B 타입으로 캐스팅 불가합니다");
		}
		
		if (ab instanceof B) {		// ab에 B타입이 존재하는 경우 다운 캐스팅 진행
			B b = (B) ab;
			System.out.println("ab를 B 타입으로 캐스팅 했습니다.");
		} else {
			System.out.println("ab는 B 타입으로 캐스팅 불가합니다.");
		}
		
		if ("안녕" instanceof String) {		// 객체의 데이터 타입을 확인
			System.out.println("\"안녕\"은 String 입니다.");
		} else {
			System.out.println("\"안녕\"은 String이 아닙니다.");
		}
		
	}

}
