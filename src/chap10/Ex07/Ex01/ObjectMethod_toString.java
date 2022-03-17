package chap10.Ex07.Ex01;

// Object class�� toString method : ��ü�� ����� �� Object toString() ȣ��
	// => toString() : package �̸�.class �̸�@�ؽ��ڵ�
	// => �ؽ��ڵ� : ��ü�� ����Ű�� �ִ� heap �޸� ������ ������ ��ȣȭ�� ��. 16����
	// => �������ؼ� ��� : ��ü�� ������ ��� (�ʵ尪, method ȣ��)

class A {
	int m = 3;
	int n = 4;
}

class B {		// extends Object
	int a = 3;
	int b = 4;
	
	@Override
	public String toString() {
		return "a : " + a + ", b : " + b;
	}
}

public class ObjectMethod_toString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println(a);		// chap10.Ex07.Ex01.A@32d2fa64 => package �̸�.class �̸�@�ؽ��ڵ�
		System.out.println(a.toString());
		System.out.printf("%x\n", a.hashCode());		// %x : 16������ �ǹ�
		System.out.println(a.hashCode());		// 10������ ���
		
		
		B b = new B();
		
		System.out.println(b);		// toString()�� �������ؼ� ��ü�� �ʵ� ������ ���
		
	}

}
