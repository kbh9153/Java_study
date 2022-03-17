package chap11.Ex05;

/*
 * �߻� class�� ����ؼ� ��� �����ϴ� ���
 * 
 */

abstract class Animal {
	abstract void cry();		// �߻� method : ���� �Ǿ��ְ� �����ΰ� ���� method
}

class Cat extends Animal {
	@Override
	void cry() {
		System.out.println("�߿�");
	}
}		

class Dog extends Animal {
	@Override
	void cry() {
		System.out.println("�۸�");
	}
}

public class AbstractModifier03 {

	public static void main(String[] args) {
		Animal a1 = new Cat();		// �߻� class�� Ÿ�����δ� ������ �� ����
		Animal a2 = new Dog();
		
		a1.cry();
		a2.cry();
		
		// �߻� class�� ��üȭ �Ұ���
		// Animal a3 = new Animal();		// �߻� class�� ��üȭ �Ұ���
	}

}
