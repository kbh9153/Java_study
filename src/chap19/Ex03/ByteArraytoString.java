package chap19.Ex03;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class ByteArraytoString {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		// 1. String getBytes() : ���ڵ�. String => Byte[] (���� => byte ��ȯ �� �迭�� ����)
		
		byte[] array1 = "�ȳ�".getBytes();	// Charset ���� ����. �⺻���� ������ ���ڵ� Ÿ���� ����
		byte[] array2 = "��ť".getBytes(Charset.defaultCharset());	// ��ť => byte�� ��ȯ�Ͽ� �迭�� ����
		byte[] array3 = "����".getBytes(Charset.forName("MS949"));	// ���ܹ߻��� �� ����(���࿹��)
		byte[] array4 = "����".getBytes("UTF-8");		// �ٷ� ���ڵ� ���� ���� ��� ����ó�� �ʿ�(�Ϲݿ���)
		
		// 2. �� ���ڵ��� byte �� ���
		System.out.println(array1.length);	// MS949(�⺻����). �ѱ� ���ڴ� 2byte
		System.out.println(array2.length);	// MS949(�⺻����). �ѱ� ���ڴ� 2byte
		System.out.println(array3.length);	// MS949. �ѱ� ���ڴ� 2byte
		System.out.println(array4.length);	// UTF-8. �ѱ� ���ڴ� 3byte
		System.out.println();
		
		// 3. new String() : ���ڵ�. byte[] => String���� ��ȯ
		String str1 = new String(array1);
		String str2 = new String(array2, Charset.defaultCharset());
		// String str3 = new String(array3, Charset.forName("UTF-8"));		// ���ڵ��� ���ڵ���(MS949)�� Ÿ�԰� �ٸ��� ���ڰ� ����
		String str3 = new String(array3, Charset.forName("MS949"));		// ���ڵ��� ���ڵ����� Ÿ�԰� �ٸ��� ���ڰ� ����
		String str4 = new String(array4, Charset.forName("UTF-8"));
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println();
		
		// 4. �ѱ��� ������ ��� : ���ڵ� Ÿ�԰� ���ڵ� Ÿ���� �ٸ� ���
		String str5 = new String(array1, Charset.forName("UTF-8"));
		String str6 = new String(array1, Charset.forName("MS949"));
		String str7 = new String(array3, Charset.forName("UTF-8"));
		
		System.out.println(str5);
		System.out.println(str6);
		System.out.println(str7);	// array3 ���ڵ� Ÿ���� MS949. ���ڵ��� UTF-8�̱� ������ ���� ����
	}
}
