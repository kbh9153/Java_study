package chap19.Ex07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * �߰� ����� �����ϴ� ��Ʈ�� : ��� ��Ʈ���� �����ؾ���. �ܵ����� ����� �� ����
 * BufferedInputStream : InputStream�� ���͸� �����ؼ� �б� ������ ���� ������ �� ��Ʈ��. �ܵ����� ��� �Ұ���. ��ݽ�Ʈ���� �߰� ���
 * BufferedOutputStream : OutputStream�� ���͸� �����ؼ� ���� ������ ���� ������ �� ��Ʈ��. �ܵ����� ��� �Ұ���. ��ݽ�Ʈ���� �߰� ���
 */

public class BufferedInput_BufferedOutputStream {

	public static void main(String[] args) {
		// �� ������ ����, Buffered�� ������� �ʰ� ó���ϴ� ��� �ӵ� vs Buffered�� ����ϴ� ��� �ӵ�
		File orgFile = new File("src\\chap19\\Ex07\\mycat_origin.jpg");		// ���� ����
		File copyFile1 = new File("src\\chap19\\Ex07\\mycat_copy1.jpg");		// Buffered�� ������� �ʰ� ó��
		File copyFile2 = new File("src\\chap19\\Ex07\\mycat_copy2.jpg");		// Buffered�� ����Ͽ� ó��
		
		// ���� ������ �ϱ����� ���� ����
		long start, end, time1, time2;	// time1 : Bufferd(x), time2 : Buffered(o)
		
		// 1. Buffered�� ������� �ʰ� ó���ϴ� ��� (BufferedInputStream, BufferOutStream)
		start = System.nanoTime();	// ���� �ð�
		
		try (InputStream is = new FileInputStream(orgFile);		// Auto close()
			OutputStream os = new FileOutputStream(copyFile1);	// Auto close()
				) {
			// ������ ���� �ڵ� ����
			int data;
			while ((data = is.read()) != -1) {	// is���� 1byte �о => -1 : ���� �����Ͱ� ������ ����������
				os.write(data);					// os�� 1byte ����
			}
			
		} catch (IOException e) {}
		end = System.nanoTime();
		time1 = end - start;
		System.out.println("Without BufferedXXXStream : " + time1);		// ���۸� ������� �ʰ� ����. copy1.jpg
		
		// 2. Buffered�� ����ϸ鼭 ó���ϴ� ��� (BufferedInputStream, BufferedOutStream)
		start = System.nanoTime();
		
		try (InputStream is = new FileInputStream(orgFile);		// ��� ��Ʈ��
			BufferedInputStream bis = new BufferedInputStream(is);		// �߰� ����� �����ϴ� ��Ʈ��. ���� ��� (Buffer �����)
			OutputStream os = new FileOutputStream(copyFile2);		// ��� ��Ʈ��
			BufferedOutputStream bos = new BufferedOutputStream(os);	// �߰� ����� �����ϴ� ��Ʈ�� (����)		
			// is, bis, os, bos => Auto close()
				) {
			// ������ ���� �ڵ� ����
			int data;
			while ((data = bis.read()) != -1) {		// ���۸� ����ؼ� �б�
				bos.write(data);					// ���۸� ����ؼ� ����
			}
		} catch (IOException e) {}
		end = System.nanoTime();
		time2 = end - start;
		System.out.println("With BufferedXXXStream : " + time2);
		
		// Buffered ����� ��� (time2), Buffered ������� �ʴ� ��� (time1)
		System.out.println();
		System.out.println("�ӵ� ����(���) : " + (double)(time1 / time2) + " ��");
	}
}
