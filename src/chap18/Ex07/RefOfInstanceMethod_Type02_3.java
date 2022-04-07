package chap18.Ex07;

interface A {
	int abc(String str);
}

public class RefOfInstanceMethod_Type02_3 {

	public static void main(String[] args) {
		// 1. �ν��Ͻ� �޼ҵ� ���� Type 2 : ���� �޼ҵ� ����
		// 1. �͸��̳�Ŭ����
		A a1 = new A() {
			@Override
			public int abc(String str) {
				return str.length();
			}
		};
		
		// 2. ���ٽ�
		A a2 = (String str) -> {return str.length();};
		
		// 3. �ν��Ͻ� �޼ҵ� ����
		A a3 = String::length;		// String::length => ��ü��::�޼ҵ�ȣ��
		
		System.out.println(a1.abc("�������?"));
		System.out.println(a2.abc("�����"));
		System.out.println(a3.abc("����ּ��������ּ������ּ���"));
	}
}
