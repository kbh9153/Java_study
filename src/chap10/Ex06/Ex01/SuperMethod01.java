package chap10.Ex06.Ex01;

// super Ű���� : �θ� class ��Ī. method ���ο��� ���. ������ ���ο����� ���

// super() : ������ ���ο����� ���. �θ� �����ڸ� ȣ���� �� ��� (��� ���� O)
	// => �ݵ�� ù ���ο� ��ġ�ؾ���

// this Ű���� : �ڽ��� ��ü�� ��Ī. method ���ο��� ���. ������ ���ο����� ���. �ʵ� �̸� ��. method �̸� ��

// this() : ������ ���ο����� ���. �ٸ� �����ڸ� ȣ���� �� ��� (��� ��
	// => �ݵ�� ù ���ο� ��ġ�ؾ���

class AAA {
	AAA() {
		System.out.println("AAA ������");
	}
}

class BBB extends AAA {
	BBB() {
//		super();
		System.out.println("BBB ������");
	}
}

class CCC {
	CCC() {};
	
	CCC(int a) {
		System.out.println("CCC ������ : " + a);
	}
}

class DDD extends CCC {
	DDD() {
		super();
	}
	
	DDD(int a) {
		super(3);
		System.out.println("DDD ������ ���� 1�� : " + a);
	}
}

public class SuperMethod01 {

	public static void main(String[] args) {
		// 1. ��ü ����
		
		AAA aaa = new AAA();		// �⺻ ������ ȣ��
		
		System.out.println("------------------------");
		
		
		BBB bbb = new BBB();		// �⺻ ������ ȣ��
		
		System.out.println("------------------------");
		
		DDD ddd = new DDD(5);
		
		
		/*
		System.out.println("------------------------");
		
		DDD eee = new DDD(5);
		*/


	}

}
