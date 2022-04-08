package chap19.Ex03;

import java.nio.charset.Charset;	// Charset Ŭ����

public class CreateChasetObject {

	public static void main(String[] args) {
		// ���� ���ڵ� ������ �����ϴ� ���
		// 1. Charset.defaultCharset()
		
		Charset cs1 = Charset.defaultCharset();		// ���� �޼ҵ�. �ý����� �⺻ ������ charset�� �ε�
		System.out.println(cs1);		// MS949 => X-windows-949 (MS949�� Ȯ�����)
		
		// 2. Charset.forName("MS949") => ���� ���ڵ� ���� �Ҵ��ؼ� ���
		Charset cs2 = Charset.forName("MS949");
		System.out.println(cs2);
		
		Charset cs3 = Charset.forName("UTF-8");
		System.out.println(cs3);
		
		Charset cs4 = Charset.forName("EUC_KR");	// => �������� �ʴ� ���ڵ��� ������ ���� �߻�. ���� ���� ó�� �ʿ�
		System.out.println(cs4);
		
		System.out.println();
		
		System.out.println(Charset.isSupported("MS949"));	// ���ڵ� ���� ����
		System.out.println(Charset.isSupported("UTF-8"));
		System.out.println(Charset.isSupported("EUC_KR"));
		System.out.println(Charset.isSupported("UTF-167"));
	}
}
