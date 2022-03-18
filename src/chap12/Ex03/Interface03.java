package chap12.Ex03;

interface A {}

interface B {}

// 1. 단일 Interface 상속
class C implements A {}		// C class는 A Interface를 구현(상속)

// 2. 다중 Interface 상속
class D implements A, B {}		// Interface는 다중 구현(상속)이 가능

// 3. class와 Interface를 한번에 상속 (extends와 implements의 순서는 변경 불가)
	// => class는 다중 상속이 불가. Interface는 다중 상속이 가능
	// => class는 일반 class와 추상 class를 의미
class E extends C implements A, B {}

public class Interface03 {
	public static void main(String[] args) {
		
	}
}
