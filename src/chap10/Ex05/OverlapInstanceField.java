package chap10.Ex05;

class Aa {		// �θ� class
	int m = 3;		// �ν��Ͻ� �ʵ�
	
	void print() {
		System.out.println("Aa class");
	}
}

class Bb extends Aa {
	int m = 4;		// �ν��Ͻ� �ʵ�
	
	@Override
	void print() {
		System.out.println("Bb class");
	}
}

class Cc extends Aa {
	int m = 5;		// �ν��Ͻ� �ʵ�
	
	@Override
	void print() {
		System.out.println("Cc class");
	}
	
}

public class OverlapInstanceField {

	public static void main(String[] args) {
		// 1. ��ü ����
		
		Aa aa = new Aa();
		Bb bb = new Bb();
		Aa ab = new Bb();
		
		Cc cc = new Cc();
		Aa ac = new Cc();
		
		// 2. �ν��Ͻ� �ʵ� ���
		
		System.out.println(aa.m);		// 3
		System.out.println(bb.m);		// 4
		System.out.println(ab.m);		// 3 => �ν��Ͻ� �ʵ�� �������̵����� ����
		
		System.out.println("--------------------------");
		
		System.out.println(cc.m);		// 5
		System.out.println(ac.m);		// 3 => �ν��Ͻ� �ʵ�� �������̵����� ����
		
		System.out.println("--------------------------");
		
		ab.print();
		ac.print();
		
		

	}

}
