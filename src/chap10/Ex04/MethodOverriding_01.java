package chap10.Ex04;

// method overriding

class Animal {
	void cry() {
		
	}
}

class Bird extends Animal {
	@Override
	
	void cry() {
		System.out.println("±±");
	}
}

class Cat extends Animal {
	@Override
	
	void cry() {
		System.out.println("�ɳɳɳ�");
	}
}

class Dog extends Animal {
	@Override
	
	void cry() {
		System.out.println("��");
	}
}

public class MethodOverriding_01 {

	public static void main(String[] args) {
		// 1. ������ Ÿ������ ���� + ������ Ÿ������ ����
		
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
		
		aa.cry();		// Animal class�� cry method ȣ��
		bb.cry();		// Bird class�� cry method ȣ��
		cc.cry();		// Cat class�� cry method ȣ��
		dd.cry();		// Dog class�� cry method ȣ��
		
		System.out.println("-------------------------------");

		// 2. Animal Ÿ������ ���� + �ڽ� Ÿ������ ���� => ���� Binding(����)�� ���ؼ� �θ��� method�� ȣ���� ��� �ڽ��� overloading�� method�� binding�� 
		
		Animal ab = new Bird();		 // ab�� Animal, Bird Ÿ���� ������ ����. Animal class�� �ʵ�� method�� ����
		Animal ac = new Cat();		// ac�� Animal, Cat Ÿ���� ������ ����. Animal class�� �ʵ�� method�� ����
		Animal ad = new Dog();		// ad�� Animal, Dog Ÿ���� ������ ����. Animal class�� �ʵ�� method�� ����
		
		ab.cry();		// Animal�� cry method ȣ���� ��� => ���� Binding�� ���ؼ� Bird class�� cry method�� ȣ��(Overriding)
		ac.cry();		// Animal�� cry method ȣ���� ��� => ���� Binding�� ���ؼ� Cat class�� cry method�� ȣ��(Overriding)
		ad.cry();		// Animal�� cry method ȣ���� ��� => ���� Binding�� ���ؼ� Dog class�� cry method�� ȣ��(Overriding)
		
		System.out.println("----------Enhanced FOr---------");
		
		// 3. ��ü �迭�� ����
		
		Animal[] animal = {ab, ac, ad};
	// ��üŸ�Թ迭  �迭�̸�   {��ü, ��ü, ��ü};
		
		for (Animal k : animal) {
			k.cry();
		}
		
		System.out.println("-------------For-------------");
		
		for (int i = 0; i < animal.length; i++) {
			animal[i].cry();
		}
	}

}
