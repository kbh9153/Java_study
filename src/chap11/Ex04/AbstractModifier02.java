package chap11.Ex04;

/*
 * �߻� class�� ������� �ʴ� ��� �߻��ϴ� ��Ȳ
 * 	1. �ڽ� class���� method overriding�� overriding�� ��Ÿ�� ���� �߸� ������ �� ����
 */

class Animal {
	void cry() {};		// ������ cry() method�� �������ְ� ������ �������� ����
}

class Cat extends Animal {
//	void cRy() {		// ��Ÿ�� ���� overriding�� �ƴ� �ڽ� class���� ���ο� method�� ������
	@Override
	void cry() {
		System.out.println("�߿�");
	}
}

class Dog extends Animal {
//	void Cry() {		// ��Ÿ�� ���� overriding�� �ƴ� �ڽ� class���� ���ο� method�� ������
	@Override
	void cry() {
		System.out.println("�۸�");
	}
}
public class AbstractModifier02 {

	public static void main(String[] args) {
		// 1. ��ü ����
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		
		// 2. method ȣ��
		a1.cry();
		a2.cry();

	}

}
