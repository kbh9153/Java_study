package chap19.Ex03;

import java.io.UnsupportedEncodingException;

/*
 * EUCKR - �ѱ� ǥ��, �ѱ� ǥ�� ���� ��ü�� ǥ�� �����Ѱ͸� �����Ǿ� ����. �� 11,000 �� 2,200�� ǥ�� ���� => 8,000�ڴ� ǥ�� �ȵ�
 * 	- ���� : 1byte
 * 	- �ѱ� : 2byte
 * MS949(=ANSI) - ����ũ�μ���Ʈ���� ������ �ѱ� ǥ�� ���. �� 11,000�� ��� ǥ�� ����. Windows OS�� MS949�� �⺻
 * 	- ���� : 1byte
 *  - �ѱ� : 2byte
 *  
 * UTF-8 : ��� ����(Web, FTP, Mail ...), git, macOS
 * 	- ���� : 1byte
 * 	- �ѱ� : 3byte
 * 
 * UTF-16 < �������� >
 * 	- ����, �ѱ� ��� 2byte�� ó��
 * 	- BOM : ��� ���� ����� �ĺ��ڵ�. 2byte�� ó��
 *		=> ��� ������ �� ó��
 * 
 * ���ڸ� �ش� ���ڵ� Ÿ���� ����Ʈ ��Ʈ������ ������ ���, �ش� ���ڵ� Ÿ������ ������ �ؾ� ���ڰ� ������ ����
 * 
 * ��Ŭ�������� ���ڵ� Ÿ�� ���� 3���� (�켱���� : 3 > 2 > 1)
 * 	1. ���� ���� :
 * 	2. ������Ʈ���� ���� :
 * 	3. ���Ͽ��� ���� :
 */


public class EUCKR_VS_MS949 {

	public static void main(String[] args) throws UnsupportedEncodingException {	// ��Ÿ�� �߻��� ��� ���ڵ��� �� ���� ���ܰ� �߻�
		// EUCKR vs MS949
		
		// 1. �����ڸ� byte�� �������� String���� ��ȯ
		byte[] b1 = "a".getBytes("EUC_KR");		// getBytes ó���� ���ܰ� �߻�. ���ڸ� byte�� ��ȯ
		// ���ڸ� ��Ʈ��ũ�� ������ �� byte ��Ʈ������ ��ȯ�ؼ� ����
		
		byte[] b2 = "a".getBytes("MS949");	// ���ڿ� => byte[]
		
		System.out.println(b1.length);		// 1
		System.out.println(b2.length);		// 1
		
		System.out.println(new String(b1, "EUC-KR"));	// byte[] => ���ڿ��� �ٲ�
		System.out.println(new String(b1, "MS949"));
		
		System.out.println();
		
		// 2. �ѱ��� byte�� �������� String���� ��������
		byte[] b3 = "��".getBytes("EUC_KR");
		byte[] b4 = "��".getBytes("MS949");
		
		System.out.println(b3.length);		// 2
		System.out.println(b4.length);		// 2
		System.out.println(new String(b3, "EUC_KR"));
		System.out.println(new String(b4, "MS949"));
		
		// 3. EUC_KR�� ���� ��� ������ �͸� ǥ��. �� 2,000��
		// MS949�� 11,000�� ��� ǥ�� ����
		byte[] b5 = "��".getBytes("EUC_KR");
		byte[] b6 = "��".getBytes("MS949");
		
		System.out.println(b5.length);
		System.out.println(b6.length);
		
		System.out.println(new String(b5, "EUC_KR"));
		System.out.println(new String(b6, "MS949"));
		
	}
}
