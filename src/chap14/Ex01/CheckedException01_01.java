package chap14.Ex01;

public class CheckedException01_01 {

	public static void main(String[] args) {
		
		try {
			System.out.println(10 / 0);		// ���α׷��� ������ ����Ǿ� ����
		} catch (ArithmeticException e) {		// ���ܿ� ���� ó��
			// e.printStackTrace();		// try{}���� ������ �߻��� ��쿡 �۵�
			// System.out.println("0�� ���� �� �����ϴ�.");
			// catch ����� ������ ���� �ʾƵ� ����ó���� �Ȱ��̴�.
		} finally {
			// try{} ������ ��� �۵�(O), ������ �־ (O)
			// try{}�� �۵��Ǹ� �׻� �۵�
			// ��ü�� ��� �� ��ü�� �޸𸮸� ������ �� => ex) sc.close(); ���� finally ������ �ۼ�
		}
		
		System.out.println("���α׷��� ���� ���� �մϴ�.");		// ���� ����
		

	}

}
