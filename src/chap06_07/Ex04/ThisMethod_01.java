package chap06_07.Ex04;

/*
 * this�� Ű����� ���Ǵ� ���
 * 1. this.m : method ������ �������� m�� �ƴ� �ʵ��� m��
 * 2. this.init() : �ڽ� ��ü�� method��
 * 
 * this�� method�� ���Ǵ� ���
 * 1. this(); : ������ �ȿ��� �ٸ� �����ڸ� ȣ���� �� ���
 * 		=> �ݵ�� ������ ������ ù�ٿ� ��ġ�ؾ���
 * 		=> method ���ο����� ����� �� ���� (������ ���ο����� ��� ����)
 */

class Abc {
	Abc() {		// �������� �Ű�������(())�� ���� ������
		System.out.println("ù��° �������Դϴ�.");
	};
	
	Abc(int a) {
		this();		// �Ű������� ���� �����ڸ� ȣ�� => ����) �������� ù�ٿ� �;���
		System.out.println("�ι�° �������Դϴ�.");
		System.out.println(a);
	}
	
	Abc(int a, String b) {
		this(30);		// this(30) : �Ű������� ���� 1���� ���� ������ ȣ��
		System.out.println("����° �������Դϴ�.");
		System.out.println(a + "\n" + b);
	}
	
	/*
	void abc() {
		this();		// this(); : method �ȿ����� this(); ���Ұ� => ���� �߻� 
	}
	*/
}

public class ThisMethod_01 {

	public static void main(String[] args) {
		// 1. ��ü ����
		Abc aa = new Abc();		// �Ű������� ���� ������ ȣ��
		System.out.println("--------------------------------");
		
		Abc bb = new Abc(7);
		System.out.println("--------------------------------");
		
		Abc cc = new Abc(3, "hello java");

	}

}
