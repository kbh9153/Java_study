package chap06_07.Ex04;


// ����� this Ű���� �߰� : �ݵ�� this Ű���带 ����ؾ� �Ǵ� ���
class Aa {		
	int m;
	int n;
	
	void init (int m, int n) {		// this key�� ������� �ʴ� ��� : ���������� �ν�
		m = m;		// this Ű���尡 ���� ������ �ʵ��� m�� �ƴ϶� �������� m�� �ν�
		n = n;		// this Ű���尡 ���� ������ �ʵ��� n�� �ƴ϶� �������� n�� �ν�
	}
	
}

class Bb {		// this key�� ����ϴ� ���
	int m;
	int n;
	
	void init(int m, int n) {
		this.m = m;		// this Ű���带 ��������� ����Ͽ��� �ʵ��� m�� �ν�
		this.n = n;
	}
}

public class ThisKeyword_02 {

	public static void main(String[] args) {
		// 1. �ʵ��� ������������ ���� ��� (this Ű���带 ��� X => ���������� ����)
		Aa aa = new Aa();
		aa.init(5, 6);		// this�� ������� �ʾ� ���������� ����Ǿ� method ����� �޸𸮰��� �Ҹ��ؼ� 0, 0 ���
		System.out.println(aa.m);
		System.out.println(aa.n);
		
		System.out.println("--------------------------");
		
		// 2. �ʵ��� ������������ ���� ��� (this Ű���带 ��� O => �ʵ庯���� ����)
		Bb bb = new Bb();
		bb.init(5, 6);		// this�� ����Ͽ� �ʵ庯��(heap �޸� ���� ����)�� ����Ǿ� 5, 6 ���
		System.out.println(bb.m);
		System.out.println(bb.n);
		
		// 3. �ʵ��� ������������ �ٸ� ���

	}

}
