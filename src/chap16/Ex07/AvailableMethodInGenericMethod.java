package chap16.Ex07;

/*
 * Generic method ���ο��� ��� ������ method : Object class�� method�� ��� ����
 */

class A {
	public<T> void method(T t) {
		// System.out.println(t.length());		// t.length() : String class���� ���ڼ��� return ���� => ��� �Ұ�
		System.out.println(t.equals("�ȳ�"));		// t.equals�� Object class�� method�� ��� ����
	}
}

public class AvailableMethodInGenericMethod {

	public static void main(String[] args) {
		A a = new A();
		a.<String>method("�ȳ�");

	}

}
