package chap19.Ex06;

import java.io.IOException;
import java.io.InputStream;

/*
 * System.in : Console���� input�� �޴� Java���� ������ �ִ� ��ü. InputStream
 * 	- Windows : Console���� Enter => \n\r
 * 	- Mac : Console���� Enter => \n
 * System.oput : Console�� ����� �ϴ� ��ü. OutputStream
 */

public class ConsoleInputObject01 {

	public static void main(String[] args) throws IOException {
		// ��Ʈ���� �ѹ� ����ϸ� ������ �Ұ���
		
		// 1. Console���� input �ޱ����� ��ü ����
		InputStream is1 = System.in;		// is1�� �ֿܼ��� ��ǲ�޾Ƽ� ó���ϴ� ��ü
		System.out.println("���� �Է��ϼ���.");
		
		int data1;
		while ((data1 = is1.read()) != '\r') {	// ����� ������. 1byte �о int data ������ �Ҵ�
			System.out.println("���� ������ : " + (char)data1 + ", ���� ����Ʈ �� : " + is1.available());
		}
		
		System.out.println(data1);	// 13
		System.out.println(is1.read());		// 10
		
		System.out.println("==============================");

		
		
	}
}
