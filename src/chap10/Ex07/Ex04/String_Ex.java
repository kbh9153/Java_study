package chap10.Ex07.Ex04;

class A {
	String name;
	A (String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}

public class String_Ex {

	public static void main(String[] args) {
		String string0 = new String("�ȳ�");
		
		String string1 = "�ȳ�";		// String�� ���� ����.
		
		System.out.println(string0);		// String�� ��ü�� ��½� �ڵ������� toString() ������ ��
		System.out.println(string1);

		A a = new A("�ȳ�");
		System.out.println(a);
	}

}
