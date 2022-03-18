package chap12.Ex01;

abstract class Abc {
	abstract void cry();
	abstract void fly();
}

class Cat extends Abc {
	@Override
	void cry() {
		System.out.println("고양이는 야옹");
		
	}
	
	@Override
	void fly() {
		System.out.println("고양이는 날려다 실패");
		
	}
}

class Eagle extends Abc {
	@Override
	void cry() {
		System.out.println("독수리는 끼요오오오오");
		
	}
	
	@Override
	void fly() {
		System.out.println("독수리는 날 수 있어요");
		
	}
}

public class Ex_AbstractClass {

	public static void main(String[] args) {
		// 1. 자식 class => Cat, Eagle class를 생성 후 출력
		Cat cat = new Cat();
		cat.cry();
		cat.fly();
		
		Eagle eagle = new Eagle();
		eagle.cry();
		eagle.fly();
		
		System.out.println("--------------------");
		
		// 2. 익명 class => Cat, Eagle class를 생성 후 출력
		Abc cat2 = new Abc() {
			void cry() {
				System.out.println("고양이는 야옹");
			}
			
			void fly() {
				System.out.println("고양이는 날려다 실패");
			}
		};
		
		cat2.cry();
		cat2.fly();
		
		Abc eagle2 = new Abc() {
			void cry() {
				System.out.println("독수리는 끼요오오오오");
			}
			
			void fly() {
				System.out.println("독수리는 날 수 있어요");
			}
		};
		
		eagle2.cry();
		eagle2.fly();
	}

}
