package chap06_07.Ex06;

/*
��ü�� �ʵ忡 ���� �Ҵ��ϴ� ��� : 3����
	1. �ʵ忡 ���� ���� �ο��ϴ� ���	=> ��ü�� ���� �� 
	2. setter�� ���ؼ� ��ü�� �ʵ忡 ���� �ο� (��Ʈ�� ����) => ��ü�� ���� �� 
	3. �����ڸ� ���ؼ� ��ü�� �ʵ� ���� �ο� (��Ʈ�� ����)	=> ��ü�� ������ �� �ʱ������ �ʵ忡 ���� �Ҵ�
*/

class Aa {		// 1. ��ü ���� �� ���� �ʵ忡 �� �Ҵ�
	String name;		// �̸�
	int age;			// ����
	String mail;		// ���� �ּ�
			
	
	void print() {
		System.out.println("name : " + name + ", age : " + age + ", mail : " + mail);
	}
}

class Bb {		// 2. setter�� ���ؼ� ��ü�� �ʵ忡 ���� �Ҵ�
	String name;		// �̸�
	int age;			// ����
	String mail;		// ���� �ּ�
	
	void set(String name, int age, String mail) {
		this.name = name;
		this.age = age;
		this.mail = mail;
	}
		
		void print() {
			System.out.println("name : " + name + ", age : " + age + ", mail : " + mail);
	}
}

class Cc {		// 3. �����ڸ� ���ؼ� ��ü�� �ʵ忡 ���� �Ҵ�
	String name;		// �̸�
	int age;			// ����
	String mail;		// ���� �ּ�
			
	Cc(String name, int age, String mail) {
		this.name = name;
		this.age = age;
		this.mail = mail;
	}
	
	void print() {
		System.out.println("name : " + name + ", age : " + age + ", mail : " + mail);
	}
}

public class FieldOfValue_01 {

	public static void main(String[] args) {
		// 1. ��ü�� �ʵ忡 ���� ���� �Ҵ�
		Aa aa = new Aa();
		
		aa.name = "ȫ�浿";
		aa.age = 30;
		aa.mail = "abc@gmail.com";
		
		aa.print();
		
		// 2. ��ü�� setter�� ����ؼ� �ʵ��� ���� �ο�
		Bb bb = new Bb();
		
		bb.set("ȫ�浿", 30, "abc@gmail.com");
		bb.print();
		
		// 3. �����ڸ� ����ؼ� �ʵ��� ���� �ο�
		Cc cc = new Cc("ȫ�浿", 30, "abc@gmail.com");
		
		cc.print();

		
	}

}
