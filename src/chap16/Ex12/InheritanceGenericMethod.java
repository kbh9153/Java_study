package chap16.Ex12;

// Generic method�� ��� : �Ϲ� class ������ Generic method

class Parent {		// �Ϲ� class(Generic method�� ������ class)
	
	// Number : Boolean, Charactor�� ������ Wrapper(�⺻ ������ Ÿ���� ��ü������ ��ȯ) Ÿ���� class�� �� �� ����
		// => Wrapper(Byte, Short, Integer, Long, Float, Double)
	<T extends Number> void print(T t) {		// Generic method
		System.out.println(t);
	}
}

class Child extends Parent {		// Generic method ����� �Ϲ� ��Ӱ� ����
	
}

public class InheritanceGenericMethod {

	public static void main(String[] args) {
		// 1. �θ� class�� Generic method ���
		Parent p = new Parent();
		
//		p.<Byte>print(2);
		p.<Integer>print(74);
		p.<Double>print(100.235);
		// p.<String>print("hello world");		// ���� �߻�. Number Ÿ�Ը� ��°���
		p.print(300);		// �Ű������� ����
		
		// 2. �ڽ� class���� Generic method ���
		Child c = new Child();
		c.<Integer>print(200);
		c.<Double>print(100.2345);
		// c.<String>print("hello");
	}

}
