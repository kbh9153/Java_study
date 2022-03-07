package chap06_07.Ex03;

class Car {
	String company;		// �ʵ��� company�� �˷��ִ� this, heap �޸𸮿� ����
	String model;		// �ν��Ͻ�(= ��ü) : ��üȭ�� ���� �� ��� ������ �ʵ�
	String color;		// �ʵ�� : �ʵ��� �� => heap ������ ����
	double maxSpeed;
	
	Car() {};		// �⺻ ������
	
	Car(String company, String model, String color, double max) {
		this.company = company;		// this Ű�� ��ü�� �ʵ��� ������ ���Ѵ�
		this.model = model;			// 3�� ����(���� : ��ǲ�Ǵ� ����)�� ��� ������ ��� ��ü�� �ʵ��� ������ �˷��ִ� ����
		this.color = color;
		maxSpeed = max;		// this Ű���尡 ������ ����
	}
	
	void work() {		// method(�ν��Ͻ� method) : heap �޸� ������ method ��� �����͸� ����
		System.out.println("company : " + company + "\n" + "model : " + model + "\n" + "color: " + color + "\n" + "maxSpeed : " + maxSpeed);
		// method ��ü ������ class ������ method �޸� ������ ����
	}
	
}

public class Q1 {

	public static void main(String[] args) {
		// �����ڸ� ���ؼ� �⺻ ���� �Ҵ� �� �޸��� ������ work() method�� ����ؼ� ���
		
		Car g80 = new Car("GENESIS", "g80", "black", 380);
		g80.work();
		
		System.out.println();
		
		Car taycan = new Car("Porsche", "Taycan", "Blue", 500);
		taycan.work();
		
	}

}
