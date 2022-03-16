package chap10.Ex05;

class AAAA {
	static void print() {		// static method : 오버라이딩 되지 않음
		System.out.println("A class");
	}
}

class BBBB extends AAAA {
	static void print() {
		System.out.println("B class");
	}
}

class CCCC extends AAAA {
	static void print() {
		System.out.println("C class");
	}
}

public class OverlapStaticMethod {

	public static void main(String[] args) {
		// 1. 객체 생성없이 호출 => << 권장 구문 >>
		
		AAAA.print();
		BBBB.print();
		CCCC.print();
		
		System.out.println("-------------------");
		
		// 2. 객체 생성 후 호출
		
		AAAA aaaa = new AAAA();
		aaaa.print();		// A class
		
		BBBB bbbb = new BBBB();
		bbbb.print();		// B class
		
		AAAA aabb = new BBBB();
		aabb.print();		// A class => static method는 오버라이딩되지 않음
		

	}

}
