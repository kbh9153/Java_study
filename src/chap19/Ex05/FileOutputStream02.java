package chap19.Ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

// FileOutputStream�� ����ؼ� �ѱ� ó��

public class FileOutputStream02 {
	
	public static void main(String[] args) throws IOException {
		// 1. ������ ���� ����
		File outFile = new File("src/chap19/Ex05/FileOutput2.txt");		// �⺻������ ��Ŭ������ default charactorSet���� ����
		
		// 2. n-byte ������ ���� ó�� (byte[]�� ó������ ������ ����)
		OutputStream os1 = new FileOutputStream(outFile);
		byte[] byteArray1 = "�ȳ��ϼ���".getBytes(Charset.forName("MS949"));	// String -> byte[]�� ���� (getBytes() �̿�)
			// MS949 : �ѱ��� �� ���ڿ� 2byte�� ó�� / UTF-8 : �ѱ��� �� ���ڿ� 3byte�� ó��
		
		os1.write(byteArray1);
		os1.write('\n');
		os1.flush();
		os1.close();
		
		// 3. n-byte ���� (byte[]�� offset���� length���� byte ������ ����)
		OutputStream os2 = new FileOutputStream(outFile, true);		// �̾ ����
//		byte[] byteArray2 = "�ݰ����ϴ�".getBytes(Charset.forName("MS949"));
		byte[] byteArray2 = "�ݰ����ϴ�".getBytes(Charset.defaultCharset());		// �⺻ charset���� ��������
		
		os2.write(byteArray2, 4, 2);	// 4byte���� ���� ���ڰ��� 2byte �о�ͼ� ����
		// write (byte �迭, offset, length)
		
		// ����, ����, Ư������ => ASCII �ڵ�� 1byte
		os2.flush();
		os2.close();
		
	}
}
