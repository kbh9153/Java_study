package chap19.Ex06;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/*
 * �ܼ� ��ǲ�� �ѱ� ó�� : 1byte�� ������ �ѱ� ó���� �Ұ���. �迭�� �о�� �ѱ� ó���� ����
 * InputStream System.in
 */

public class ConsoleInputObject04 {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;		// System.in�� �� ���������� �ѹ��� ���� �� ����. close() ���� �������� ���
		
		// 2. n-byte �迭 �б� (byte[] ó�� ��ġ���� ���� ������ ����)
		byte[] byteArray1 = new byte[100];
		
		System.out.println("�ѱ��� �Է��ϼ���.");
		
		int count1 = is.read(byteArray1);		// \r\n ����, count1�� �迭 ���� ��
		String str1 = new String(byteArray1, 0,  count1, Charset.defaultCharset());
		
		System.out.println(str1);
		System.out.println("���� ���� �� ����(r�� n����) : " + count1);
		System.out.println();
		System.out.println("------------------------------");
		
		// 3. n-byte ���� �б� (length��ŭ �о�ͼ� byte[] �迭�� offset[index] ��ġ�� ����)
		byte[] byteArray2 = new byte[9];
		int offset = 3;
		int length = 6;
		int count2 = is.read(byteArray2, offset, length);
		
		System.out.println(new String(byteArray2, 0, offset + count2, Charset.defaultCharset()));
	}
}
