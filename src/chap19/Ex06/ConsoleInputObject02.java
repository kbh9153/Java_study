package chap19.Ex06;

import java.io.IOException;
import java.io.InputStream;

/*
 * System.in : Console���� input�� �޴� Java���� ������ �ִ� ��ü. InputStream
 * 	- Windows : Console���� Enter => \n\r
 * 	- Mac : Console���� Enter => \n
 * System.oput : Console�� ����� �ϴ� ��ü. OutputStream
 */

public class ConsoleInputObject02 {

	public static void main(String[] args) throws IOException {
		// ��Ʈ���� �ѹ� ����ϸ� ������ �Ұ���
		
		// 1. Console���� input �ޱ����� ��ü ����
		InputStream is1 = System.in;		// is1�� �ֿܼ��� ��ǲ�޾Ƽ� ó���ϴ� ��ü
		System.out.println("���� �Է��ϼ���.");
		
		int data1;
		// while ((data1 = is1.read()) != -1) {		 // -1 : ó������ ������
		while ((data1 = is1.read()) != '\n') {
			System.out.print((char)data1);
		}
		System.out.println();
		
		System.out.println(data1);	// 13 (\r ASCII code)
		System.out.println(is1.read());		// 10 (\n ASCII code)
		
		System.out.println("==============================");

		
		
	}
}
