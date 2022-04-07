package chap18.Ex07;

interface A {
	int abc(String str);
}

public class RefOfInstanceMethod_Type02_3 {

	public static void main(String[] args) {
		// 1. 인스턴스 메소드 참조 Type 2 : 정적 메소드 참조
		// 1. 익명이너클래스
		A a1 = new A() {
			@Override
			public int abc(String str) {
				return str.length();
			}
		};
		
		// 2. 람다식
		A a2 = (String str) -> {return str.length();};
		
		// 3. 인스턴스 메소드 참조
		A a3 = String::length;		// String::length => 객체명::메소드호출
		
		System.out.println(a1.abc("누구쎄용?"));
		System.out.println(a2.abc("브딱이"));
		System.out.println(a3.abc("살려주세용살려요주세용살려주세용"));
	}
}
