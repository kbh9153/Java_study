package chap19.Ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * InputStream : �߻� Ŭ���� => FileInputStream ������ Ŭ���� (�б�)
 * OutputStream : �߻� Ŭ���� => FileOutputStream  ������ Ŭ���� (����)
 * FileInputStream : byte() ���� ������ �б�
 * FIleOutputStream : byte() ���� ������ ����
 * 
 * Windows �ܼ�, �޸��� Enter�� ������ : \r\n (\r�� ���� ����)
 * Mac : \n
 */

public class FileOutputStream01 {

	public static void main(String[] args) throws IOException {
		// 1. �Է� ���� ���� (�������� ����)
		File outFile = new File("src/chap19/Ex05/FileOutput1.txt");
		
		// 2. 1byte�� ����
		OutputStream os1 = new FileOutputStream(outFile);
			// FileOutputStream�� �������� �ʴ� ������ ������ ����� ������
			// FileInputSream ��ο� ������ �����ؾߵ�. ���ܹ߻�
		
		os1.write('J');
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.write('\r');	// 13 ���� => ���� ����
		os1.write('\n');	// 10 ����
		
		// �߿� : write() �޼ҵ�� ����(= �޸�)�� ����. ���ۿ� ������ ���Ͽ� ���� => ��������
		// 		 flush() : ���ۿ� ����� ������ ���Ͽ� ������ ������ �� ���
		
		os1.flush();	// ���۰� �� ���� �ʴ��� ������ ���Ͽ� ���⸦ ������ => ���� ����. write�� ����ϸ� flush() ����� ���� ����
		os1.close();	// close() ȣ��� flush() ���� �۵���
		
		// 2. n-byte ���� ���� (byte[] �� offset���� length ���� byte ������ ����
		OutputStream os2 = new FileOutputStream(outFile);	// �����
							// FileOutputStream(File o, Boolean append) => append : true(�̾��) / false( �����) * false�� �⺻��
		byte[] byteArray1 = "Hello!".getBytes();	// String -> byte�� ��ȯ : getBytes() �޼ҵ� ���
		
		os2.write(byteArray1);
		os2.write('\n');	// \r�� ���� ����, \n�� �־ Window 10 �̻󿡼� enter ó��
		
		os2.flush();
		os2.close();
		
		// 3. n-byte ���� ���� (byte[]�� offset���� length���� byte ������ ����
		OutputStream os3 = new FileOutputStream(outFile, true);		// �̾��
		byte[] byteArray2 = "Better the last smile than the first laughter".getBytes();
		
		os3.write(byteArray2, 7, 8);	// 7byte���� ���� �����Ͽ� 8byte �о�ͼ� ����
										// read�� ���� �ݴ�� ó��
		os3.flush();
		os3.close();
	}
	
}
