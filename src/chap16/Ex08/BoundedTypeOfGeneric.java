package chap16.Ex08;

class A {}
class B extends A {}
class C extends B {}

// Generic Type Class : ���׸� Ÿ�Կ� ������ ��ü�� ����
class D<T extends B> {		// T : Class B, class C�� �� �� ����
							// <T extends B> �ǹ� : T Ÿ�Կ� ������ ����
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

public class BoundedTypeOfGeneric {

	public static void main(String[] args) {
		// D<A> d1 = new D<A>();		// A ��ü�� �Ұ��� : <T>�� �� ��ü�� ����. B class, C class�� Ÿ�� ������ ����
		D<B> d2 = new D<B>();
		D<C> d3 = new D<C>();
		
		D d4 = new D();		// D(B) D(C)�� ���� => Ÿ���� �������� �ʰ� ��ü ������ �ֻ��� Ÿ������ ������
							// D<B> d4 = new D<B>(); �� ����
	
		d2.setT(new B());		// B ��ü ����
		d2.setT(new C());		// C ��ü ����
		// d2.setT(new A());		// ���� �߻�
		
		//	d3.setT(new B());		// ���� �߻�
		d3.setT(new C());
		// d3.setT(new A())			// ���� �߻�
		
		// d4.setT(num A());		// ���� �߻�
		d4.setT(new B());
		d4.setT(new C());
	}

}
