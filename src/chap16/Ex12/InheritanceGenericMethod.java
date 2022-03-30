package chap16.Ex12;

// Generic method의 상속 : 일반 class 내부의 Generic method

class Parent {		// 일반 class(Generic method를 포함한 class)
	
	// Number : Boolean, Charactor를 제외한 Wrapper(기본 데이터 타입을 객체형으로 변환) 타입의 class가 올 수 있음
		// => Wrapper(Byte, Short, Integer, Long, Float, Double)
	<T extends Number> void print(T t) {		// Generic method
		System.out.println(t);
	}
}

class Child extends Parent {		// Generic method 상속은 일반 상속과 같음
	
}

public class InheritanceGenericMethod {

	public static void main(String[] args) {
		// 1. 부모 class의 Generic method 사용
		Parent p = new Parent();
		
//		p.<Byte>print(2);
		p.<Integer>print(74);
		p.<Double>print(100.235);
		// p.<String>print("hello world");		// 오류 발생. Number 타입만 출력가능
		p.print(300);		// 매개변수에 들어가는
		
		// 2. 자식 class에서 Generic method 사용
		Child c = new Child();
		c.<Integer>print(200);
		c.<Double>print(100.2345);
		// c.<String>print("hello");
	}

}
