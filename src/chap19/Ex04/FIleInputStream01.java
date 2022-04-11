package chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FIleInputStream01 {

	public static void main(String[] args) throws IOException {
		// ���� �۾� ���� ��ġ Ȯ��
		System.out.println(System.getProperty("user.dir"));
		
		// 1. �Է� ���� ����
		// ������ ����
		File inFile1 = new File("C:\\kosmo\\02_java\\java_01\\src\\chap19\\files\\FileInputStrea01.txt");
		
		// ����� ���� : ���� �۾� ����(C:\\kosmo\\02_java\\java_01)�� �������� ����
		File inFile2 = new File("src\\chap19\\files\\FileInputStrea01.txt");
		
		// InputStream ��ü�� �����ؾ� ������ ������ �о�� �� ����
		InputStream is = new FileInputStream(inFile2);		// InputStream�� �߻� Ŭ����. ���� ��ü ������ �� ������ Ÿ�� ������ ������
		
		// ������ ������ ���
		
		/*
		 * UTF-8 : ���� 1byte, �ѱ� 3byte ó��
		 * MS949 : ���� 1byte, �ѱ� 2byte ó��
		 * EUC_KR : ���� 1byte, �ѱ��� 2byte ó��
		 * UTF-16 : ����, �ѱ� 2byte, ù��° BOM(�ĺ��� �ڵ�) 2byte
		 * 	- UNIX : \n
		 * 	- Windows : \r\n => \r�� �����ص� ��. �ܼ��̳� �޸��忡�� enter : \r\n
		 * 	- MAC : \r
		 */
		
		
		// 1byte �����͸� �о char�� ��ȯ �� ���
		System.out.print(is.read());	// read() �޼ҵ�� 1byte�� �о��
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		
		// String�� ���� ������ �޸𸮿��� ������. ���� �б� ���ؼ��� ���ο� String�� �����ؾ���
		
		System.out.println();
		System.out.println();
		
		// int read() : 1byte�� �о ���� ������ ��� ����� ����. �о�� �����Ͱ� �������� ���� ��� ������ -1 ����
		InputStream is1 = new FileInputStream(inFile2);
		
		int data;
		
		while ((data = is1.read()) != -1) {		// ������ ������ ��� ��ȯ (-1 : ���� ���̻� �������� ������ -1)
			System.out.print((char)data);
		}
		
		// �߿� : .read()�� 1byte �� �о��
		// 
		// FileInputStream�� ó������ index 0������ �о��. �߰��� ������ �濡�� �о�� �� ����
			// FileRandomAccess�� ����ؼ� ������ index���� �о��
		
		System.out.println();
		System.out.println();
		
		// available() : String�� ���� byte ���� ���
		
		InputStream is2 = new FileInputStream(inFile2);
		
		while ((data = is2.read()) != -1) {		// ������ ������ ��� ��ȯ
			System.out.println("���� ������ : " + (char)data + ", ���� ����Ʈ �� : " + is2.available());
		}
		
		is.close();
		is1.close();
		is2.close();
		
	}
}
