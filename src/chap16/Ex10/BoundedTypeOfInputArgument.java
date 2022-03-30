package chap16.Ex10;

// Generic method���� �Ű��������� ���� ����

class A {}
class B extends A {}
class C extends B {}
class D extends C {}
// class E {}

class Goods<T> {		// Generic class
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

class Test {	// �Ϲ� method. �Ű������� ������ Ÿ���� Generic Ÿ��
	void method1(Goods<A> g) {}		// g�� �Ű������� A class Ÿ�Ը� ����
	void method2(Goods<?> g) {}		// g�� �Ű������� ��� class�� ����(A, B, C, D �� E class�� ����)
	void method3(Goods<? extends B> g) {}		// g�� �Ű������� B, C, D class Ÿ�Ը� ����
	void method4(Goods<? super B> g) {}		// g�� �Ű������� A, B class Ÿ�Ը� ����
}

public class BoundedTypeOfInputArgument {

	public static void main(String[] args) {
		Test t = new Test();
		
		// 1. method1 :
		t.method1(new Goods<A>());		// ���� �۵�
		// t.method1(Goods<B>());		// ����
		// t.method1(Goods<C>());		// ����
		// t.method1(Goods<D>());		// ����
		
		// 2. method2 : (Goods<?> g) => A, B, C, D, E ����
		t.method2(new Goods<A>());		// ���� �۵�
		t.method2(new Goods<B>());		// ���� �۵�
		t.method2(new Goods<C>());		// ���� �۵�
		t.method2(new Goods<D>());		// ���� �۵�
		// t.method2(new Goods<E>());		// ���� �۵�
		
		// 3. method3 : (Goods<? extends B> g) => B, C, D ����
		// t.method3(new Goods<A>());		// ����
		t.method3(new Goods<B>());		// ���� �۵�
		t.method3(new Goods<C>());		// ���� �۵�
		t.method3(new Goods<D>());		// ���� �۵�
		
		// 4. method4 : (Goods<? super B> g) => A, B ����
		t.method4(new Goods<A>());
		t.method4(new Goods<B>());
		// t.method4(new Goods<C>());
		// t.method4(new Goods<D>());
	}

}
