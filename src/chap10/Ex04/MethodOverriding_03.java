package chap10.Ex04;

// Method Overriding�� ���� �����ڿ��� ����
	// �ڽ��� class���� �θ��� method�� �������� ��� �����ڴ� �θ�� ���ų� �о�� ��

class Aaa {
	protected void abc() {
		
	}
}

class B1 extends Aaa {
	@Override
	
	public void abc() {
		
	}
}

class B2 extends Aaa {
	@Override
	
	protected void abc() {
		
	}
}

class B3 extends Aaa {
//	@Override
	
//	void abc() {		// ���� �߻� : �� method�� ���� �������� ������ overriding�� method�� ���� �������� �������� ���� ����
//		
//}

}

class B4 extends Aaa {
	// @Override
	
//	private void abd() {		// ���� �߻� : �� method�� ���� �������� ������ overriding�� method�� ���� �������� �������� ���� ���� 
//		
//	}

}

public class MethodOverriding_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
