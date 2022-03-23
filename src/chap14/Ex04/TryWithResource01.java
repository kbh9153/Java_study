package chap14.Ex04;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource01 {

	public static void main(String[] args) {
		// 1. ���� ���ҽ� ����
		System.out.println("���ڸ� �Է��ϼ���.");
		
		InputStreamReader isr2 = null;		// ��� �� �ݵ�� �޸𸮿��� ��ü�� ����. isr2.close()
		// System.in : Console���� �Է��� �޵��� ó�� => ��, �ѹ��� input(�Է�)���� �� ����. ��ü�� ����Ǹ� �ݺ��Ͽ� input ���� ����
		
		try {
			isr2 = new InputStreamReader(System.in);
			char input = (char)isr2.read();		// �Ϲݿ���(checked ����) => IOExcepiton : �Է� ���
			System.out.println("�Է±��� = " + input);
		} catch (IOException e) {
			e.printStackTrace();		// try{} ��Ͽ��� ���ܰ� �߻��� ��� �ڼ��� ���� ���
		} finally {		// ��ü�� ��� �� �޸� �������� ����
			// ���ҽ� ���� : isr2.close()
			if (isr2 != null) {
				try {
					isr2.close();		// �Ϲݿ��� : IOException
				} catch (IOException e) {
					e.printStackTrace();
				}		
			}
		}
		
		// 2. �ڵ� ���ҽ� ���� => Java 1.7 �ڵ����� ���ҽ��� ����. ������ �ڵ尡 ���� (�ʿ� ������ ����)
			// 2-1. ����ϴ� ��ü�� AutoCLoseable interface�� ������ ��ü���� ��
			// 2-2. �ݵ�� ��ü�� close()�� �����ؾ���
			// ���� 2���� ������ ������ �� �ڵ� ���ҽ� ����
			// try(�ڵ����� ���ҽ��� ������ ��ü ����) {} catch{} finally{}
		
		// InputStreamReader : AutoClosealble interface�� �����ϰ� ����. close() ������ ����
		// Try with Resource : try (with resource : ��ü �޸� �ε�) {}
		try(InputStreamReader isr1 = new InputStreamReader(System.in);) {
			char input = (char) isr1.read();
			System.out.println("�Է±��� = " + input);
		} catch(IOException e) {
			e.printStackTrace();
		} // finally ����� �����ϴ��� ��ü�� �ڵ����� close()
	}

}
