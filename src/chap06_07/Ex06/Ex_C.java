package chap06_07.Ex06;

import chap06_07.Ex05.C;

public class Ex_C {

	public static void main(String[] args) {
		// �ٸ� package�� ����. public�� ����. model, color �޸𸮷� ���� �Ұ�
		// model�� color�� setter
		
		C g80 = new C();		// �ٸ� package�̹Ƿ� import �ʿ�
		
		
		// company, model, color�� �ٸ� package���� ���� �Ұ�
		g80.maxspeed = 380;
		g80.set("G80", "Black");		// setter�� ���ؼ� �޸��� ���� �ο�
//		g80.setColor("Black");
//		g80.setModel("G80");
		
		g80.print();
		
	}

}
