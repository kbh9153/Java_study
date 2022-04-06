package chap12.Ex01;

abstract class D {		// class ���ο� �߻� method�� �� ��� abstract Ű���带 ���� �ۼ��Ͽ��� ��
							// => �߻� method�� �ۼ��� �ڽ� class���� �ݵ�� �������� method�� �����ǵǴ� ���� ����
	abstract void print();		// �߻� method. �����ΰ� ���� ���� �� method
}

class E extends D {		// �ڽ� class�� �߻� class�� method�� �������ؾ���
	@Override
	void print() {
		System.out.println("E class�� print()");
		
	}
}

public class AbstractClass03 {

	public static void main(String[] args) {
		// 1. ��üȭ�ؼ� ��� (��ü 3�� ���� �� print() method ���. Ÿ���� D�� ����)
		D d = new E();
		D dd = new E();
		D ddd = new E();
		
		d.print();
		dd.print();
		ddd.print();
		
		System.out.println("----------------------------");
		
		// 2. �͸� class (print() method 3�� ���)
		D d1 = new D() {		// �ڽ� class �����ڸ� ȣ���ؼ� �θ� Ÿ������ ����
			@Override
			void print() {
				System.out.println("�͸� class 1");
			}
		};
		
		D d2 = new D() {
			@Override
			void print() {
				System.out.println("�͸� class 2");
			}
		};
		
		D d3 = new D() {
			@Override
			void print() {
				System.out.println("�͸� class 3");
			}
		};
		
		d1.print();
		d2.print();
		d3.print();

	}

}
