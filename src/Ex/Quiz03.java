package Ex;

class Student {			// Java�� ���� ����� �Ұ�. �θ� class�� �Ѱ��� ����. Java�� ��� class�� Object�� �ڽ� class��
							// Object class���� ������ �ʵ峪 method�� ������ �� ����
	String name; 		// �л��̸�
	int studentID; 		// �й�
	int kor; 			// ��������
	int eng; 			// ��������
	int math;			 // ��������
	
	int sum; 			// ���� �հ�
	double avg;			 // ���� ���

	void hobby() {
		System.out.println("�� �л��� ��̴� �Դϴ�");
	}

	@Override
	public String toString() {		// Object class�� method, ��ü ��ü�� ����� �� [��Ű����.class�̸�@�޸� �ؽ��ڵ�]
		return "�̸� : " + name + "\n" + "�й� : " + studentID + "\n" + "�������� : " + kor + "\n" + "�������� : " + eng + "\n"
				+ "�������� : " + math + "\n" + "���� �հ� : " + sum + "\n" + "���� ��� : " + avg + "\n";
	}

}

class S_ö�� extends Student {
	S_ö��(String name, int StudentID, int kor, int eng, int math) {			// ������ 1. class �̸��� ����, 2. return Ÿ���� �������
		super.name = name;
		super.studentID = StudentID;
		super.kor = kor;
		super.eng = eng;
		super.math = math;
		
		// super.sum = kor + eng + math;
		// super.avg = (double) sum / 3;		// ����� ����� ���� (double)�� ĳ����
	}

	@Override
	void hobby() {
		System.out.println("ö���� ��̴� ���� �Դϴ�.");
	}

}

class S_���� extends Student {
	S_����(String name, int StudentID, int kor, int eng, int math) {
		super.name = name;
		super.studentID = StudentID;
		super.kor = kor;
		super.eng = eng;
		super.math = math;
		
		// super.sum = kor + eng + math;
		// super.avg = (double) sum / 3;		// ����� ����� ���� (double)�� ĳ����
	}

	@Override
	void hobby() {
		System.out.println("������ ��̴� �߰��� �Դϴ�.");
	}

}

class S_���� extends Student {
	S_����(String name, int StudentID, int kor, int eng, int math) {
		super.name = name;
		super.studentID = StudentID;
		super.kor = kor;
		super.eng = eng;
		super.math = math;
		
		// super.sum = kor + eng + math;
		// super.avg = (double) sum / 3;		// ����� ����� ���� (double)�� ĳ����
	}

	@Override
	void hobby() {
		System.out.println("������ ��̴� ��ȭ���� �Դϴ�.");
	}

}

public class Quiz03 {

	public static void main(String[] args) {
		   Student ö�� = new S_ö��("ö��", 20220314, 100, 95, 80);
		   Student ���� = new S_����("����", 20220314, 98, 95, 90);
		   Student ���� = new S_����("����", 20220314, 85, 91, 93);
		   
		   Student[] array = {ö��, ����, ����};
		   
		   for (int i = 0; i < array.length; i++) {
			   int count = array.length;
			   array[i].sum = array[i].kor + array[i].eng + array[i].math;
			   array[i].avg = (double) array[i].sum / count;
			   array[i].hobby();
			   System.out.println(array[i]);
		   }
		   
		   for (Student k : array) {
			   int count = array.length;
			   k.sum = k.kor + k.eng + k.math;
			   k.avg = (double) k.sum / count;
			   k.hobby();
			   System.out.println(k);
		   }
		   
	   }

}
