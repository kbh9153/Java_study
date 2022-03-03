package chap06_07.Ex01;

/*
 * 클래스(class) : 객체를 생산하기 위한 틀(템플릿), 설계도, 붕어빵 틀 등에 비유
 * 객체(object) : class를 복사하여 메모리에서 작동되는 코드
 * 객체 = 인스턴스(instance)
 * 인스턴스화(객체화) 시킨다 라는 의미 => 메인 method에서 객체를 인스턴스화를 시켜줘야함
 * 	=> ex. A a = new A(); ==> 클래스를 객체화 시켜서 메모리에 로드
 */

class A {		// 외부 class ( = outerclass ). 객체화 전까지는 class 메모리에 저장
	int m = 3;		// 필드(=변수) : class 블록에서 선언된 변수
					// 필드는 인스턴스화(객체화) 시켜야 사용 가능
					// 필드는 heap 메모리에 저장
	void print() {		// method : 함수 (절차지향에서는 function(=함수), 객체지향에서는 method라고 칭함)
						// print : 함수명
						// void : 함수 실행코드의 return 값이 없다는 뜻
		System.out.println("객체 생성 및 활용");
	}
}

class B {		// 외부 class ( = outerclass )
	String name = "홍길동";
	int age = 24;
	String phone = "010-1111-2222";
	
	void printName() {
		System.out.println(name);
	}
	
	void printAge() {
		System.out.println(age);
	}
	
	void printPhone() {
		System.out.println(phone);
	}
}

public class CreateObjectAndUsingOfMeber {	// public class (java 파일명과 같아야함)
		
	public static void main(String[] args) {	// main method
		// 지역변수 : method내 선언된 변수
		
		A a = new A();		// A(클래스명) a(A 클래스를 복사해 담은 변수명) = new A(A 클래스 변수값으로 담음)();
							// Class를 객체화 => 메모리에 로드시킴(heap 메모리에 담음)
		System.out.println(a.m);
		a.print();
		
		System.out.println("==========================");
		
		A b = new A();		// class A를 객체화시켜서 메모리에 로드
		
		System.out.println(b.m);
		b.print();
		
		System.out.println("==========================");
		
		A c = new A();
		
		System.out.println(c.m);
		c.print();
		
		System.out.println("==========================");
		
		B bb = new B();		// B class bb라는 이름으로 객체화
		
		bb.printName();		// bb 객체의 메소드를 호출
		bb.printAge();
		bb.printPhone();
		System.out.println("나이 : " + bb.age);
		
		B cc = new B();
		cc.printName();
		cc.printAge();
		cc.printPhone();
		
	}

}
