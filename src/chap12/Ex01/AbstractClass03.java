package chap12.Ex01;

abstract class D {		// class 내부에 추상 method가 올 경우 abstract 키워드를 필히 작성하여야 함
							// => 추상 method를 작성시 자식 class에서 반드시 오류없이 method를 재정의되는 것을 보장
	abstract void print();		// 추상 method. 구현부가 없이 선언만 된 method
}

class E extends D {		// 자식 class는 추상 class의 method를 재정의해야함
	@Override
	void print() {
		System.out.println("E class의 print()");
		
	}
}

public class AbstractClass03 {

	public static void main(String[] args) {
		// 1. 객체화해서 출력 (객체 3개 생성 후 print() method 출력. 타입은 D로 생성)
		D d = new E();
		D dd = new E();
		D ddd = new E();
		
		d.print();
		dd.print();
		ddd.print();
		
		System.out.println("----------------------------");
		
		// 2. 익명 class (print() method 3번 출력)
		D d1 = new D() {		// 자식 class 생성자를 호출해서 부모 타입으로 생성
			@Override
			void print() {
				System.out.println("익명 class 1");
			}
		};
		
		D d2 = new D() {
			@Override
			void print() {
				System.out.println("익명 class 2");
			}
		};
		
		D d3 = new D() {
			@Override
			void print() {
				System.out.println("익명 class 3");
			}
		};
		
		d1.print();
		d2.print();
		d3.print();

	}

}
