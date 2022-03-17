package chap11.Ex03;

/*
 * abstract(�߻�) method : ���࿵���� ���� method. ���� �Ǿ� �ִ� method
 * 	�߻� class�� ��üȭ �� �� ����. Ÿ������ ������ ���� ����
 * 	=> �ڽ� class���� ������ �� �����θ� �����ؾ���
 * 	=> method�� �⺻ ���� : void print() {};
 * �߻� method�� ���� : abstract void print();
 * �߻� class : abstract class A { �߻� method�� �ϳ� �̻� ���� } 
 * 	=> �߻� class�� �ڽ� class���� method�� �������ؼ� �����θ� ����
 * 
 * 						<< �ǹ� ��� ����>>
 * 	1. ������ �߻� method�� �������� => ȸ�翡�� �����ؾ��� ��� method�� ����
 * 	2. ������ �������� �߻� method�� overriding�ؼ� �����θ� ����� ��
 * 	3. ���� class���� method overriding�� ������ �����ϱ� ���� ��� 
 */

abstract class A {		// �߻� class : �߻� method�� �ϳ��� �����ϸ� �ݵ�� �߻� class�� �־�� ��
	abstract void print();		// �߻� method : ���࿵���� ���� method
	abstract void cry();
}

class B extends A {		// ��ũ��Ʈ class : �߻� class���� ������ method�� ��� ������ class
	@Override
	void print() {
		System.out.println("��ũ��Ʈ class : �߻� class�� �߻� method�� ��� ������ class");
	}
	
	@Override
	void cry() {
		System.out.println("�߿�");
		
	}
}

abstract class C extends A {		// �θ��� �߻� method �� �Ϻθ� ������ ��� : �߻� class
	@Override
	void print() {
		// TODO Auto-generated method stub
		
	}
}

class D extends C {		// ��ũ��Ʈ class : �θ��� ��� �߻� method�� ���������� ������ class
	@Override
	void cry() {
		// TODO Auto-generated method stub
		
	}
}

public class AbstractModifier01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
