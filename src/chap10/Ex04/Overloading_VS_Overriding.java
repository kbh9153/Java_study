package chap10.Ex04;

// Method Overloading vs method Overriding

/*
 * 1. Method Overloading : ������ method �̸����� (�Ű����� Ÿ��, �Ű����� �� �� Signature)�� ���� �ش� method�� ȣ��
 * 		=> ��Ӱ��� ������ ����. �����ڿ� ���� ���..
 * 
 * 2. Method Overriding : �ݵ�� ��� ���迡���� ��� ����
 * 		=> �θ��� method�� �ڽ� method���� (����)���Ӱ� �����ؼ� ���
 * 		* �������
 * 			1) ��Ӱ���
 * 			2) method�� signature(method �̸�, �Ű����� ����, �Ű����� Ÿ��)�� ���ƾ� ��
 * 			3) �ڽ� method���� �θ� method�� ���� �����ڰ� ���ų� ���� �������� ������ �� ���� �������� ��
 */

class Ab {
	void print1() {		// overriding
		System.out.println("Ab class�� print1()");
	}
	
	void print2() {		// overloading
		System.out.println("Ab class�� pring2()");
	}
}

class Bc extends Ab {
	@Override
	
	void print1() {
		System.out.println("Bc class�� print1");
	}
	
	void print2(int a) {	// overloading
		System.out.println("Bc class�� print2");
	}
}

public class Overloading_VS_Overriding {

	public static void main(String[] args) {
		// 1. Ab Ÿ�� ����
		
		Ab aa = new Ab();		
		aa.print1();		// Ab class�� print1 ȣ��
		aa.print2();		// Ab class�� print2 ȣ��
		
		System.out.println("-----------------------------");

		// 2. Bc Ÿ�� ���� + ������ Bb ȣ��
		
		Bc bb = new Bc();
		bb.print1();		// Bc class�� print1 ȣ��
		bb.print2();		// Ab class�� print2() ȣ�� : �θ� class�� method ȣ��
		bb.print2(3);		// Bc class�� print2(3) ȣ�� : �ڽ� class�� method ȣ��
		
		System.out.println("-----------------------------");
		
		// 3. Ab Ÿ������ ���� + ������ Bc ȣ��
		
		Ab cc = new Bc();
		cc.print1();		// method overloading�� ���ؼ� �Ǿ������Ƿ� ���� ���ε��� ���ؼ� Bc�� print1()�� ȣ��
		cc.print2();		// Ab class�� method�� ȣ���� ����
	}

}
