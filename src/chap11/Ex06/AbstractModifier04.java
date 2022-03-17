package chap11.Ex06;

abstract class Animal {
	String name;
	int age;
	
	abstract void cry(); 
	abstract void run(); 
	
	@Override
	public String toString() {
		return "�̸� : " + name + "\n" + "���� : " + age;
	}
}

class Cat extends Animal {
	Cat(String name, int age) {
		super.name = name;
		super.age = age;
	}
	
	@Override
	void cry() {
		System.out.println("cry : �߿�");
	}
	
	@Override
	void run() {
		System.out.println("run : ��Ǫ��");
	}
	
}

class Tiger extends Animal {
	Tiger(String name, int age) {
		super.name = name;
		super.age = age;
	}
	
	@Override
	void cry() {
		System.out.println("cry : ����");
	}
	
	@Override
	void run() {
		System.out.println("run : öǪ��");
		
	}
	
}

class Eagle extends Animal {
	Eagle(String name, int age) {
		super.name = name;
		super.age = age;
	}
	
	@Override
	void cry() {
		System.out.println("cry : ���������");
	}
	
	@Override
	void run() {
		System.out.println("run : ���ƴٴ�");
	}
	
}

public class AbstractModifier04 {
	public static void main(String[] args) {
		Animal a1 = new Cat("�����", 10);
		Animal a2 = new Tiger("ȣ����", 20);
		Animal a3 = new Eagle("������", 30);
		
		// 1. Animal �迭 ��ü�� ���� ��
		Animal[] arr = {a1, a2, a3};
		
		
		// 2. For ���� ����ؼ� ��ü�� ��½� �̸��� ���̸� ���, cry(), run() method ���
		System.out.println("----- << for �� ��� >> -----\n");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			arr[i].cry();
			arr[i].run();
			System.out.println("---------------------------");
		}
		
		System.out.println();
		
		// 3. Enhanced For ���� ����ؼ� ���
		System.out.println("----- << Enhanced for �� ��� >> -----\n");
		for (Animal k : arr) {
			System.out.println(k);
			k.cry();
			k.run();
			System.out.println("---------------------------");
		}
	}
}
