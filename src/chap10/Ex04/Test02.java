package chap10.Ex04;

class Animal3 extends Object {			// �θ� class
										// extends Object => ��� class�� Object class�� ����� (�⺻������ �����Ǿ� ����)
	String name;
	int age;
	
	void cry() {
		System.out.println("������ ��ϴ�.");
	}

	@Override		// Object class�� toString method�� ��ü ��ü�� ����� �� 
	public String toString() {			// ��ü�� �ּҸ� ����� [ ��ĳ����.Ŭ������@��ü �޸��� �ؽ��ڵ� ]
		return "�̸� : " + name + ", ���� : " + age + "�Դϴ�.";
	}
	
}

class Tiger3 extends Animal3 {
	
	Tiger3() {};		// �⺻ ������ : ������ �ʱⰪ�� �Ҵ����� �ʰ� �ʱ�ȭ
						// �ٸ� �����ڰ� ��ü ���� ������ ��� �⺻ �����ڸ� �ܺο��� ȣ��� �����Ǿ� ������ �ȵ�
	
	Tiger3(String a, int b) {		// ������ : ��ü ������ �޸𸮿� �ʱⰪ�� �Ҵ��� �� ���
		super.name = a;				// �θ�(super) class�� �޸�, this : �����ڽ��� ��ü
		super.age = b;
	}

	@Override
	void cry() {
		// super.cry();		// super : �θ� class�� �ǹ� => ��Ӱ����� ���� ���
							// this : �ڱ��ڽ��� ��ü �ǹ�
		System.out.println("ȣ���̴� ����");
	}
	
}

class Cat3 extends Animal3 {		
	Cat3() {};		// �⺻ ������
	
	Cat3(String a, int b) {		// ������
		super.name = a;
		super.age = b;
	}

	@Override
	void cry() {
		//super.cry();
		System.out.println("����̴� �Ŀ�");
	}
	
	
}

class Dog3 extends Animal3 {
	Dog3() {};		// �⺻ ������
	
	Dog3 (String a, int b) {	// ������
		super.name = a;
		super.age = b;
	}

	@Override
	void cry() {
		super.cry();
		System.out.println("���� �۸�");
	}
	
}

public class Test02 {

	public static void main(String[] args) {
		
		Animal3 a3 = new Animal3();		// a3 ��ü ����
		
		System.out.println(a3);		// ��ü ��ü�� ����� ���, Object class�� toString method ȣ��
									// Object.toString() : ��ü �޸� �ּ��� �ؽ��ڵ带 ��� => chap10.Ex04.Animal3@32d2fa64 [ ��ĳ����.��ü��@��ü �޸��� �ؽ��ڵ� ]
		
		System.out.println(a3.toString());

		// ��ü ��ü�� ����ϸ� Object class�� toString method�� ȣ��
		
		Animal3 t3 = new Tiger3();		// Tiger3�� Animal3�� ��ĳ����
		Animal3 c3 = new Cat3();		// Cat3�� Animal3�� ��ĳ����
		Animal3 d3 = new Dog3(); 
		
		t3.cry();		// �θ��� cry()�� ȣ���� ��� �������̵��� Tiger3�� cry() ȣ��
		c3.cry();
		d3.cry();
		
		System.out.println("---------------------------------");
		
		Animal3[] arr = {t3, c3, d3};
//		Animal3[] arr = new Animal3[] {t3, c3, d3};
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].cry();
		}
		
		System.out.println("---------------------------------");
		
		for (Animal3 k : arr) {
			k.cry();
		}
		
		System.out.println("---------------------------------");
		
		
		Animal3 aa3 = new Tiger3("ȣ����", 5);
		Animal3 cc3 = new Cat3("�����", 3);
		Animal3 dd3 = new Dog3("��", 10);
		
		System.out.println(aa3);		// ��ü ��ü�� ��½� �⺻�����δ� ��ü�� �޸� �ؽ��ڵ带 �����
										// Object�� toString() method�� ������
		System.out.println(cc3);
		System.out.println(dd3);
		
		System.out.println("---------------------------------");
		
		Animal3[] arr2 = {aa3, cc3, dd3};
		
		for (int j = 0; j < arr2.length; j++) {
			System.out.println(arr2[j]);
		}
		
		System.out.println("---------------------------------");
		
		for (Animal3 a : arr2) {
			System.out.println(a);
		}
	}

}
