package chap12.Ex04;

// Interface ��ӽ� �ڽ� class ���� ������ ���� *** �߿� ***
	// Interface�� method�� ������ �� �ݵ�� public�� ����ؾ� ��
interface A {
	public abstract void abc();
}

class F implements A {		// F class�� �ϼ��� method�� �����Ǿ� �־�� ��
	@Override
	public void abc() {
		
	}
	
}

interface B {
	void abc();
}

class C implements A {
	public void abc() {		// A interface�� abc()�� overriding�ؼ� ������ method
						// �ڽ��� �θ𺸴� ������������ ������ ���ų� �� �о�� �� => ���� ��� ���� �߻�
		
	}
}

class D implements B {
	public void abc() {		// Interface�� method�� ������ ���� �ݵ�� ���� ������ �� public �ۼ�
		
	}
}

class E implements B {
	@Override
	public void abc() {
		// TODO Auto-generated method stub
		
	}
}

public class Interface04 {

	public static void main(String[] args) {
		
	}

}
