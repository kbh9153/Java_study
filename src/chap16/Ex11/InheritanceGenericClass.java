package chap16.Ex11;

// Generic class�� ��� : �ڽ� class�� �θ� class�� Generic ����(K, V, T, E)���� ������ ���ų� �� ���ƾ� ��

class Parent<T> {
	T t;		// default

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

class Child1<T> extends Parent<T> {		// Generic class�� ��ӹ޴� �ڽ� class��
	
}

class Child2<T, V> extends Parent<T> {
	V v;

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}
}

public class InheritanceGenericClass {

	public static void main(String[] args) {
		// 1. �θ� Generic class ����
		
		// Parent<String> p = new Parent<String>();	// ��ü �ϼ��� ����
		// Parent<String> p1 = new Parent();		// �ڿ� ������ ȣ���� ���� ���� ����
		Parent<String> p = new Parent<>();
		
		p.setT("�θ� Generic class");
		System.out.println(p.getT());
		
		System.out.println("-------------------");
		
		Parent<Integer> li = new Parent();
		
		li.setT(74);
		System.out.println(li.getT());
		
		System.out.println("-------------------");
		
		// 2. �ڽ� class 1
		Child1<String> c1 = new Child1();
		
		c1.setT("�ڽ�1 Generic Class");		 // �θ𿡼� ��ӵ� method
		System.out.println(c1.getT());
		
		System.out.println("-------------------");
		
		// 3. �ڽ� class 2
		Child2<String, Integer> c2 = new Child2();
		
		c2.setT("�ڽ�2 Generic Class");		// �θ𿡼� ��ӵ� method
		c2.setV(69);						// �θ𿡼� ��ӵ� method
		
		System.out.println(c2.getT());		// �θ��� method
		System.out.println(c2.getV());		// �ڽ��� method
	}

}
