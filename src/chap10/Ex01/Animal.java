package chap10.Ex01;

class Dog_sub extends Dog {
	int dog_sub;
	void dog_sub() {
		System.out.println("Dog�� �ڽ� class�Դϴ�.");
	}
}

class Tiger extends Animal {
	int tiger;
	
	void tigerEat() {
		System.out.println("ȣ���̴� ���ļ��Դϴ�.");
	}
}

class Dog extends Animal {
	int dog;
	
	void dogEat() {
		System.out.println("���� ��ļ��Դϴ�.");
	}
}

class Eagle extends Animal {
	int eagle;
	
	void eagleFly() {
		System.out.println("�������� �ͱݷ��̸� ���̼��Դϴ�.");
	}
}

public class Animal {
	String name;		// ������ �̸�
	int age;			// ������ ����
	String color;		// ������ ����
	
	void eat() {
		System.out.println("��� ������ ������ �Խ��ϴ�.");
	}
	
	void sleep() {
		System.out.println("��� ������ ���� ��ϴ�.");
	}

	public static void main(String[] args) {
		// ��ĳ������ ���������� ó���ϱ� ������ ���־��� ȿ������ ���α׷��� ó���� ����
			// ������ : �������̵�(���)�� �̿��� ��ӿ��� �ϳ��� method�� ���� ������ ó�� ����
		
		// 1. Animal class ��üȭ
		Animal a1 = new Animal();		// Animal class ��üȭ => �ڽ��� �ʵ�� method ���� ����
		
		// 2. Dog class�� Dog Ÿ������ ��üȭ
		Dog d1 = new Dog();		// (Dog �� Animal)Animal, Dog�� �ʵ�� method ���� ����
		
		// 3. Dog�� Animal Ÿ������ ��ĳ����
		Animal a2 = new Dog();		// Dog�� Animal, Dog�� �����͸� ������� ����
										// => a2�� Animal�� �ʵ�� method�� ���� ����
		
		// 4. Dog_sub�� Animal Ÿ������ ��ĳ����
		Animal a3 = new Dog_sub();		// Dog_sub�� Animal, Dog, Dog_sub�� �����͸� ������� ����
							// => a3�� Animal�� �ʵ�� method�� ���� ����
		a3.name = "�����ڱ�";
		// a3.dog = 5;		// Dog class���� ���� �Ұ� => ���� �߻�
		
		// 5. Dog_sub�� Dog ������ Ÿ������ ��ĳ����
		Dog d2 = new Dog_sub();		// Dog_sub�� Animal, Dog, Dog_sub�� �����͸� ������� ����
										// => Animal�� Dog�� �ʵ�� method�� ���� ����
		d2.name = "��Ʈ����";		// Animal class�� �ʵ�
		d2.dog = 3;		// Dog
		// d2.dog_sub = 3;		// Dog_sub�� ���� �Ұ� => ���� �߻�
		
		
		// Dog_sub �� Dog �� Animal 
		// 6. Dog_sub�� Dog_sub ������ Ÿ������ ��üȭ
		Dog_sub ds1 = new Dog_sub();
			// ds1�� Animal, Dog, Dog_sub ������ ��� �� ������ ���� => ��� class�� �ʵ�� method ���� ����
			ds1.name = "������";		// Animal class�� �ʵ�
			ds1.age = 4;		// Animal
			ds1.dog = 3;		// Dog
			ds1.dogEat();
			ds1.dog_sub = 7;	// Dog_sub
			ds1.dog_sub();
			
		// ��ӿ��� ��ĳ����, �ٿ� ĳ����
			
			
		// ��ĳ���� : �ڽ� Ÿ���� ������ Ÿ���� �θ� ������ Ÿ������ ��ȯ
			// => �θ� Ÿ���� �ʵ�� method�� ���� ����
			// => ���� Ÿ�� ��ȯ���� �ڵ����� ��ĳ���õ�
			// ds1�� Dog_sub�� ������ Ÿ���� ������ ���� (Animal, Dog, Dog_sub�� ��� �ʵ�� method�� ���� ����)
			
			Dog ds1_c1 = ds1;		// ds1(Dog_sub ������ Ÿ��)�� Dog Ÿ������ ��ĳ����
										// => Animal, Dog, Dog_sub �����͸� ������ ������ Dog �����Ϳ��� ���� ����
			
			Dog ds2_c1 = (Dog) ds1;		// ���� Ÿ�� ��ȯ 
				
			Animal ds1_c2 = ds1;	// ds1(Dog ������ Ÿ��)�� Animal Ÿ������ ��ĳ����
										// => Animal, Dog �����͸� ������ ������ Animal �����Ϳ��� ���� ����
			
			// ds1 : Dog_sub (Animal, Dog, Dog_sub)
			// ds1_c1 : Dog	(Animal, Dog)
			// ds1_c2 : Animal (Animal)
			
		// �ٿ�ĳ���� : �θ� ������ Ÿ���� �ٽ� �ڽ� ������ Ÿ������ ��ȯ
			// => ������ Ÿ�� ��ȯ�� �ʿ�
			// a3�� Animal, Dog, Dog_sub �� Animal Ÿ�Ը� ����ϵ��� ��ĳ���õǾ� ����
			
			Dog a3_down1 = (Dog) a3;		// a3[Animal] -> a3_down1[Dog] => �ٿ� ĳ����
			Dog_sub a3_down2 = (Dog_sub) a3;		// a3[Animal] -> a3_down2[Dog_sub] => �ٿ� ĳ����
	}
	
	
	
	

}
