package chap06_07.Ex05;

public class C {		// �ٸ� package���� import ����
	// �ʵ忡 �ο��Ǵ� ���� ������
	
	private String company = "HYUNDAI";		// ȸ��� =>  private�� ���� �ܺο��� ���� �Ұ� 
	String model;		// �� => ���� ������ : default
	protected String color;		// ����
	public int maxspeed;		// �ִ� �ӷ�
	
	public void set(String model, String color) {
		this.model = model;
		this.color = color;
	}

//	public void setModel(String model) {		// public �ܺ� package�� class���� ���� ����
//		this.model = model;
//	}
//
//	public void setColor(String color) {
//		this.color = color;
//	}

	public void print() {
		System.out.println("Company : " + company + "\n" + "Model : " + model + "\n" + "Color : " + color + "\n" + "Maxspeed : " + maxspeed);
	}
}
