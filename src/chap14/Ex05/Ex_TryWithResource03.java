package chap14.Ex05;

// �ڵ� ���ҽ�(��ü and �޸�) ����

// �ʵ��� �� �Ҵ�. ������ ȣ��� �ʵ��� ���� �ο�

class Abc implements AutoCloseable {
	String name;
	int studentID;
	int kor;
	int eng;
	int math;
	double avg;		// ��� ���
	
	Abc (String name, int studentID, int kor, int eng, int math) {
		this.name = name;
		this.studentID = studentID;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
//		this.avg = (double)(kor + eng + math) / 3;
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("�̸� : " + name);
		System.out.println("�й� : " + studentID);
		System.out.println("�������� : " + kor);
		System.out.println("�������� : " + eng);
		System.out.println("�������� : " + math);
		System.out.println("������� : " + (double)(kor + eng + math) / 3);
		
		if (name != null || kor != 0 || eng != 0 || math != 0 || avg != 0) {
			name = null;
			kor = 0;
			eng = 0;
			math = 0;
			avg = 0;
			System.out.println();
			System.out.println("���ҽ��� �����Ǿ����ϴ�.");
		
		}
	
	}

}	

public class Ex_TryWithResource03 {

	public static void main(String[] args) {
		// 1. ��ü�� ��� �ʵ带 �ʱ�ȭ�ϰ� �ڵ� close();
		try (Abc aa = new Abc("ȫ�浿", 20220323, 95, 98, 97);) {
			
		} catch (Exception e) {
			System.out.println("���� �߻�");
			e.printStackTrace();
		}
		
		System.out.println("----------------------------");
		
		// 2. ���� close(), finally ��Ͽ��� close() ȣ��
		Abc aaa = null;
		
		try {
			aaa = new Abc("�Ż��Ӵ�", 20220321, 91, 93, 95);
		} catch (Exception e) {
			System.out.println("���� �߻�");
		} finally {
			if (aaa.name != null) {
				try {
					aaa.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
