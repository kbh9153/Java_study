package chap12.Ex03;

interface A {}

interface B {}

// 1. ���� Interface ���
class C implements A {}		// C class�� A Interface�� ����(���)

// 2. ���� Interface ���
class D implements A, B {}		// Interface�� ���� ����(���)�� ����

// 3. class�� Interface�� �ѹ��� ��� (extends�� implements�� ������ ���� �Ұ�)
	// => class�� ���� ����� �Ұ�. Interface�� ���� ����� ����
	// => class�� �Ϲ� class�� �߻� class�� �ǹ�
class E extends C implements A, B {}

public class Interface03 {
	public static void main(String[] args) {
		
	}
}
