package chap13.Ex10;

class Button {
	OnClickListener ocl;		// OnClickListener : ��üŸ��, ocl : ���� ����
	
	
	// setter�� ���ؼ� OnClickListener�� ���� ���� ocl�� ��ü �ּҸ� ����
	void setOnClickListener(OnClickListener ocl) {		
		this.ocl = ocl;		// ocl �⺻ �� null
	}
	
	// interface�� �����ϰ� ������ �ڽ� class�� �������� ����
	// ȣ���ϴ� ������ onClick() method�� �������ؼ� ȣ��
	interface OnClickListener {		// InnerInterface, static, button, onClickListener
									// method ���� �Ǿ��ִ� ����. �������� Overriding�ؼ� ������
		void onClick();		// ocl : �������� : null => setOnClickListener	
	}
	
	void click() {		// �������� �� ocl�� onCLick()�� ȣ��
		ocl.onClick();
		// System.out.println(ocl);
	}
}

public class ButtonAPIExample {

	public static void main(String[] args) {
		// ������ 1 : Ŭ���� �������
		Button btn1 = new Button();		// botton ��ü ����
		
		// A.B ab = new A.B() {innerinterface B�� method�� ������ �ڵ�}
		
		btn1.setOnClickListener(new Button.OnClickListener() {		// OnClickListener ��üŸ������ ��ü �����Ͽ� �Ű������� ����
			@Override
			public void onClick() {
				System.out.println("������ 1. ���� ���");
			}
		}
	); 		
		btn1.click();
		
		System.out.println("----------------");
		
		// ������ 2 : Ŭ���� ���̹� ����
		Button btn2 = new Button();
		
		// setOnClickListener method�� �Ű������� OnClickListener�� ���� �͸�ü�� ���� �� OnClickListener
		btn2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("������ 2. ���̹� ����");
			}
		}
	);
		
		btn2.click();
	}

}
