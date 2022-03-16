package chap10.Ex05;

class AAA {
	static int m = 3;		// static �ʵ�� �������̵����� ����
}

class BBB extends AAA {
	static int m = 4;
}

class CCC extends AAA {
	static int m = 5;
}

public class OverlapStaticField {

	public static void main(String[] args) {
		// 1. ��ü �������� ȣ�� (class �̸����� ȣ��) => << ���� ���� >>
		
		System.out.println(AAA.m);		// 3
		System.out.println(BBB.m);		// 4
		System.out.println(CCC.m);		// 5
		
		System.out.println("-----------------------");
		
		// 2. ��ü ���� �� ȣ��
		
		AAA aaa = new AAA();
		BBB bbb = new BBB();
		CCC ccc = new CCC();
		AAA ab = new BBB();
		AAA ac = new CCC();
		
		System.out.println(aaa.m);		// 3
		System.out.println(bbb.m);		// 4
		System.out.println(ccc.m);		// 5
		System.out.println(ab.m);		// 3 => static �ʵ� : �������̵� ���� ����
		System.out.println(ac.m);		// 3
		
		System.out.println("-----------------------");

	}

}
