package chap10.Ex04;

class Animal2 {
	void run() {
		System.out.println("sex");
	}
}

class Tiger extends Animal2 {		// ȣ���̴� �׹߷� �޸��ϴ�
	@Override
	
	void run() {
		System.out.println("ȣ���̴� �׹߷� �޸��ϴ�.");
	}
	
	void tigerEat() {
		System.out.println("ȣ���̴� ������ �Խ��ϴ�.");
	}
}

class Eagle extends Animal2 {		// �������� �ϴ��� ���ϴ�.
	@Override
	
	void run() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	
	void eagleEat() {
		System.out.println("�������� �ٸ� ���� ��� �Խ��ϴ�.");
	}
}

class Snake extends Animal2 {
	@Override
	
	void run() {
		System.out.println("���� ���ٴմϴ�.");
	}
	
}

public class MethodMoverriding_02 {

	public static void main(String[] args) {
		// 1. ��� ��ü�� Animal2 Ÿ������ ��ĳ�����ؼ� ����
		Animal2 at = new Tiger();
		Animal2 ae = new Eagle();
		Animal2 as = new Snake();
		
		// 2. Animal2 �迭�� �� ��ü�� ����
		Animal2[] array = {at, ae, as};
//		Animal2[] array = new Animal2[] {at, ae, as};
		
		// 3. for������ �迭�� ��ü�� ���
		for (int i = 0; i < array.length; i++) {
			array[i].run();
		}
		
		System.out.println("--------------------------");
		
		// 4. Enhanced for ���� ����ؼ� ��ü�� run() method ���
		for (Animal2 k : array) {
			k.run();
		}
		
		System.out.println("--------------------------");
		
		// 5. �ٿ�ĳ���� (instanceof ���) ���
		if (at instanceof Tiger) {
			Tiger tt = (Tiger) at;
			tt.tigerEat();
		} else {
			System.out.println("����� �� �����ϴ�.");
		}
		
		if (ae instanceof Eagle) {
			Eagle ee = (Eagle) ae;
			ee.eagleEat();
		} else {
			System.out.println("����� �� �����ϴ�.");
		}
		
	}

}
