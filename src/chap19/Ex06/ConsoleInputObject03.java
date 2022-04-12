package chap19.Ex06;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class ConsoleInputObject03 {
	
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;		// is �ܼ��� ���ؼ� ��ǲ ����
			
		// InputStream is2 = System.in;		// System.in�� �� ���������� �ѹ��� ���� �� ����
		
		// 1. 1byte ���� �б�
		int data;
		while ((data = is.read()) != '\r') {	// \r ���� 
			System.out.print((char)data);
		}
		is.read();		// 10 (\n ASCII CODE) ���ۿ� \n �� ��������. ���ۿ��� \n�� ó������� ���� read()�� \n ���� ����. ó������ ������ ���� read()�� \n�� ��
		
		System.out.println();
		System.out.println();
		System.out.println("===============================");
		
		// 2. n-byte �б� (byte[]�� ó�� ��ġ���� ���� ������ ����)
		byte[] byteArray1 = new byte[100];
		int count1 = is.read(byteArray1);		// �ֿܼ��� �迭�� ����� �� \r\n���� ��
			// count1 �迭���� ���� ���� ������ ����
		
		for (int i = 0; i < count1; i++) {
			System.out.print((char)byteArray1[i] + "(" + byteArray1[i] + ")");
			System.out.println(" : count1 = " + count1);
		}
		System.out.println("===============================");
		
		int count2;
		count2 = is.read(byteArray1);		// �迭 ���ο� \r\n�� ��
		System.out.println(new String(byteArray1, 0, count2));
		
		/*
		while ((count2 = is.read(byteArray1)) != '\r') {		// is.read(�迭)�� �� ��� �迭�� ���� Ƚ���� count2�� �Ҵ�Ǿ� \r�� ã�� �� ���� ������ ���ѷ����� ����
			System.out.println(new String(byteArray1));
		}
		*/
		// is.read(); // => ���ۿ��� �����ʾƾ� ��. �迭 ���ο� \r\n ���� 
		
		System.out.println("===============================");
		
		// 3. n-byte ������ �а� length��ŭ �о�ͼ� byte[] offset ��ġ���� ����
		byte[] byteArray2 = new byte[8];
		int offset = 3;
		int length = 5;
		int count3 = is.read(byteArray2, offset, length);
		
		for (int i = 0; i < offset + length; i++) {
			System.out.print((char)byteArray2[i]);
		}
		
		is.close();		// ���� �������� ó���������. �߰��� close()�� ��� �ٽ� ȣ���� �Ұ���
		
	}
}
