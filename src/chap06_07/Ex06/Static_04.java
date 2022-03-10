package chap06_07.Ex06;

class Cde {
	String name;		// �ʵ� (instance �ʵ�) : static�� ����. ��üȭ�� �ʼ�
	int age;
	
	static String email;	// �ʵ� (static �ʵ�) : ���� �ʵ�. ��ü �������� ��� ���� (class �̸�, �ʵ� �̸�) + ��ü ���� �� ���
	static int num;
}

public class Static_04 {

	public static void main(String[] args) {
		Cde cde1 = new Cde();		// ��üȭ
		
		// instance �ʵ� : ��üȭ �ؾ����� ��� ����
		cde1.name = "ȫ�浿";
		cde1.age = 30;
		
		// static(����) �ʵ� : ��üȭ �ؼ��� ��� ����
		cde1.email = "abc@gmail.com";
		cde1.num = 7;
		
		// static(����) �ʵ� : ��ü �������� ��� ���� << ��� ���� >>
			// static �޸� ���� : ��� ��ü���� �����ϴ� ����
		Cde.email = "abc123@gmail.com";
		Cde.num = 3;
		
		// instance �ʵ� : heap �޸� ������ ����� 
		
		Cde cde2 = new Cde();
		Cde cde3 = new Cde();
		Cde cde4 = new Cde();
		
		cde2.name = "������";
		cde2.age = 50;
		
		cde3.name = "�������";
		cde3.age  = 60;
		
		cde4.name = "�Ż��Ӵ�";
		cde4.age = 40;
		
		// instance �ʵ� �� ���
		System.out.println(cde2.name + ", " + cde2.age);
		System.out.println(cde3.name + ", " + cde3.age);
		System.out.println(cde4.name + ", " + cde4.age);
		
		// static ������ ���� �����Ϸ��� ��� ��ü ���� ����
		
		cde2.email = "abc@naver.com";
		cde2.num = 55;
		
		System.out.println(cde2.email + ", " + cde2.num);
		System.out.println(cde3.email + ", " + cde2.num);
		System.out.println(cde4.email + ", " + cde2.num);
	}
		

}
