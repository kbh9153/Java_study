package chap06_07.Ex06;

class Aaa {
	int m = 3;			// �ν��Ͻ� �ʵ� => static�� ���� ���� �ʵ� (��ü�� ���� �Ŀ� ��� ����)
	static int n = 4;		// ����ƽ �ʵ� => static�� ���� �ʵ� (��ü �������� ��� ����, ��ü ���� �Ŀ��� ��� ����)
								// => ��� ��ü�� �����ϴ� �ʵ�
	
	void print1() {		// method (instance method) : ��ü�� ���� �� ȣ�� ����
		System.out.println("instance method ��� : " + " m => " + m + "\n" + "static method ��� : n => " + n);
		
	}
	
	static void print2() {		// method (static method) : ��ü �������� ȣ�� ����, ��ü ���� �Ŀ��� ȣ�� ����
								// static method�� ��ü �������� ȣ���� �ǹǷ� instance �ʵ氡 �� �� ����
		System.out.println("static method ��� : n => " + n);
	}
}

public class Static_01 {

	public static void main(String[] args) {
		// 1. ��ü ���� �� �ʵ�� method ȣ��	(instance �ʵ�, static �ʵ�, instance method, static method ��� ȣ�� ����)
		Aaa aaa = new Aaa();
		aaa.m = 7;		// instance �ʵ� ȣ��
		aaa.n = 3;		// static �ʵ� ȣ��
		aaa.print1(); 	// instance method ȣ��
		
		System.out.println("---------------------------------");
		
		aaa.print2();	// static method ȣ��
		
		// 2. ��ü �������� �ʵ�� method ȣ�� (static �ʵ�, static method ȣ�� ����)
		Aaa.n = 100;		// static �ʵ� : class ������ ȣ��
		
		System.out.println("---------------------------------");
		
		Aaa.print2();		// static method : class ������ ȣ��
		
		Aaa bbb = new Aaa();
		System.out.println(bbb.n);		// 100
		
		Aaa ccc = new Aaa();
		System.out.println(ccc.n);		// 100
		
		Aaa ddd = new Aaa();
		System.out.println(ddd.n);		// 100
		
		Aaa eee = new Aaa();
		System.out.println(eee.n);		// 100
		
		eee.n = 300;
		System.out.println("-------<< static�� ����� �ʵ�� ��� ��ü���� ���� ������ >>-------");
		System.out.println(aaa.n);
		System.out.println(bbb.n);
		System.out.println(ccc.n);
		System.out.println(ddd.n);
		System.out.println(eee.n);
		
		System.out.println("-------<< static�� ����� �ʵ�� ��� ��ü���� ���� ������ >>-------");
		Aaa.n = 370;
		
		System.out.println(aaa.n);
	}

}
