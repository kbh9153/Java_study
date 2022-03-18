package chap12.Ex01;

abstract class Abc {
	abstract void cry();
	abstract void fly();
}

class Cat extends Abc {
	@Override
	void cry() {
		System.out.println("����̴� �߿�");
		
	}
	
	@Override
	void fly() {
		System.out.println("����̴� ������ ����");
		
	}
}

class Eagle extends Abc {
	@Override
	void cry() {
		System.out.println("�������� �����������");
		
	}
	
	@Override
	void fly() {
		System.out.println("�������� �� �� �־��");
		
	}
}

public class Ex_AbstractClass {

	public static void main(String[] args) {
		// 1. �ڽ� class => Cat, Eagle class�� ���� �� ���
		Cat cat = new Cat();
		cat.cry();
		cat.fly();
		
		Eagle eagle = new Eagle();
		eagle.cry();
		eagle.fly();
		
		System.out.println("--------------------");
		
		// 2. �͸� class => Cat, Eagle class�� ���� �� ���
		Abc cat2 = new Abc() {
			void cry() {
				System.out.println("����̴� �߿�");
			}
			
			void fly() {
				System.out.println("����̴� ������ ����");
			}
		};
		
		cat2.cry();
		cat2.fly();
		
		Abc eagle2 = new Abc() {
			void cry() {
				System.out.println("�������� �����������");
			}
			
			void fly() {
				System.out.println("�������� �� �� �־��");
			}
		};
		
		eagle2.cry();
		eagle2.fly();
	}

}
