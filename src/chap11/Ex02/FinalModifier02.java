package chap11.Ex02;

// final method�� final class�� Ư¡
	// final method : overriding �Ұ� => ���� �߿��� method�� �ڽĿ��� ���������� ���ϵ��� ����
	// final class : ����� �Ұ��� class

class A {
	void abc() {
		
	}
	
	final void bcd() {		// final�� �Ҵ�� method�� �ڽ� class���� overriding �Ұ�
		
	}
}

class B extends A {
	void abc() {}		// method overriding ����
	
	// void bcd() {}		// method overriding �Ұ���
}

final class C {}		// final�� �Ҵ�� class�� ����� �Ұ�
// class D extends C {}

public class FinalModifier02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
