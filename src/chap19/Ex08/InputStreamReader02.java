package chap19.Ex08;

import java.io.InputStreamReader;

public class InputStreamReader02 {

	public static void main(String[] args) {
		// 1. �ܼ� �Է� (MS949) : default charset, byte ��Ʈ��
		try {
			// InputStreamReader : byte => char�� ��ȯ
			// System.in : �ܼ� �Է�, byte
			
			// isr�� ��ȯ�� char Ÿ���� ������ ����
			InputStreamReader isr = new InputStreamReader(System.in, "MS949");
			
			System.out.println("ù��° �Է� ��");
			
			int data;
			while ((data = isr.read()) != '\r') {	// �ܼ��� ��쿡�� �Է°��̱� ������ '\r'
				System.out.print((char)data);
			}
			System.out.println();
			System.out.println();
			System.out.println(isr.getEncoding());
			System.out.println("---------------------");
		} catch (Exception e) {}
		
		// 2. �ܼ� �Է� (UTF-8)
		try (InputStreamReader isr2 = new InputStreamReader(System.in, "UTF-8");) {
			
			System.out.println("�ι�° �Է� ��");
			
			int data;
			while ((data = isr2.read()) != '\r') {
				System.out.print((char)data);
			}
			System.out.println();
			System.out.println();
			System.out.println(isr2.getEncoding());
		} catch (Exception e) {}
	}
}
