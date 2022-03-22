package chap13.Ex10.Ex01;

class A {
	B b;		/* 
				 * B : interface Ÿ��, b : ���� ���� (���� �Ҵ��ϴ� ���)
				 * b : null
				 * 	1. ��ü ���� �� ���� �Ҵ�
				 * 	2. �����ڸ� ���ؼ� ���� �Ҵ�
				 * 	3. setter�� ���ؼ� ���� �Ҵ�
				 */  
				
	A () {};	// �⺻ ������
	
	A (B b) {
		this.b = b;
	}
	
	public void setB(B b) {
		this.b = b;
	}

	interface B {
		void paly();
		void stop();
	}
	
	void abc() {		// play() ������, stop() ������
		b.paly();
		b.stop();
	}
	
}

public class InnerInterface01_01 {

	public static void main(String[] args) {
		A aa = new A();		// A a
		
		aa.setB(new A.B() {
			@Override
			public void stop() {
				System.out.println("����ּ��� ����ּ��� ����ּ���");
			}
			
			@Override
			public void paly() {
				System.out.println("�������?");
			}
		}
	);
	aa.abc();
	
	System.out.println("------------------------");
	
	// 1. ��ü ���� �� �ʵ��� ���� �Ҵ�
	A aaa = new A();
	
	aaa.b = (A.B) new A.B() {		// interface : A.B
		@Override
		public void paly() {
			System.out.println("�������?");
		}
		
		@Override
		public void stop() {
			System.out.println("����ּ��� ����ּ��� ����ּ���");
		}
	};
	aaa.abc();
	
	System.out.println("------------------------");
	
	// 2. �����ڸ� �̿��ؼ� ���� �Ҵ�
	A aaaa = new A(new A.B() {		// ������ ���ο� A.B Ÿ���� ��ü ���� �� ����
		@Override
		public void stop() {
			System.out.println("����ּ��� ����ּ��� ����ּ���");
		}
		
		@Override
		public void paly() {
			System.out.println("�������?");
		}
	}
	
);
	aaaa.abc();
	
	}

}
