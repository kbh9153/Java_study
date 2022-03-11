package chap10.Ex03;

// instanceof : ��ü ������ ĳ���� ���� ���θ� Ȯ���� �� �ֵ��� �ϴ� Ű����
	// ��ĳ������ ��ü ���ο� � Ÿ���� �����ϴ��� True, False�� return
	// �ٿ� ĳ���� �� �ش� Ÿ�� Ȯ���� ���� ��� (��Ÿ�� ������ �߻� ����)

class A {
	int m;
	
	void a() {
		System.out.println("m : " + m);
	}
}

class B extends A {
	int n;
	
	void b() {
		System.out.println("n : " + n);
	}
}

public class InstanceOf {

	public static void main(String[] args) {
		// 1. instanceof ���� => ��ü�� instanceof Ÿ��
		A aa = new A();		// aa�� A Ÿ�Ը� ����
		A ab = new B();		// ab�� A, BŸ���� �����ϰ� A�� ���� ����
		
		System.out.println(aa instanceof A);		// true
		System.out.println(aa instanceof B);		// false
		System.out.println(ab instanceof A);		// true
		System.out.println(ab instanceof B);		// true

		if (aa instanceof B) {		// aa ��ü�� B Ÿ���� ���ԵǾ� ���� ��� B => A �ٿ� ĳ���� ����
			B b = (B) aa;		// ��Ÿ�ӽ� ������ ������ ����
			System.out.println("aa�� B Ÿ������ ĳ���� �߽��ϴ�.");
		} else {
			System.out.println("aa�� B Ÿ������ ĳ���� �Ұ��մϴ�");
		}
		
		if (ab instanceof B) {		// ab�� BŸ���� �����ϴ� ��� �ٿ� ĳ���� ����
			B b = (B) ab;
			System.out.println("ab�� B Ÿ������ ĳ���� �߽��ϴ�.");
		} else {
			System.out.println("ab�� B Ÿ������ ĳ���� �Ұ��մϴ�.");
		}
		
		if ("�ȳ�" instanceof String) {		// ��ü�� ������ Ÿ���� Ȯ��
			System.out.println("\"�ȳ�\"�� String �Դϴ�.");
		} else {
			System.out.println("\"�ȳ�\"�� String�� �ƴմϴ�.");
		}
		
	}

}
