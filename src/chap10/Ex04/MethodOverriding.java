package chap10.Ex04;

/*
 *  MethodOverriding ���� ����
 *   1. �ݵ�� ��� ���迡���� ���� ����
 *   2. �θ� class���� ����� method�� ���Ӱ� �����ؼ� ����ϴ� ��
 *   3. @Override ��� annotation(�ּ�)�� ����ϸ� method ������ �� ������ ���� �� ����
 *   4. Signature(Ư¡)�� ���ƾ� �� (method �̸�, �ް�����(����) Ÿ��, �Ű�����(����) ����)
 *   5. method�� ���� �������� ������ ���ų� �Ǵ� �о����
 */

class A {
	void print() {
		System.out.println("A class�Դϴ�.");
	}
}

class B extends A {
	@Override		// method overriding �� �ݵ�� �θ��� method�� �������ϵ��� ���� => ������ ��Ÿ�� ������ ���� ���� ��� ������ �߻���Ŵ
							// @Override annotation�� ������� ���� ��� : ��Ÿ�� �ְų� ���Ŀ� ���� ���� ��� => ������ method�� ����(������ �߻������� ����)
	void print() {
		System.out.println("B class�Դϴ�.");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// 1. A Ÿ��
		A aa = new A();
		aa.print();		// A class�� print() ���
		
		// 2. B Ÿ��
		B bb = new B();
		bb.print();		// B class�� print() ���
		
		// 3. A Ÿ�� ��ĳ����	<<=== B�� AŸ������ ��ĳ�����Ͽ����� ��ӹ��� AŸ���� B ������ ������(����� - override)�Ͽ� B ������ ���(������ Ÿ���� A) 
		A ab = new B();
		ab.print();		// B class�� print() ���
	}

}
