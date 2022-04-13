package chap19.Ex06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* 
 * �ֿܼ��� �ѱ��� ��ǲ���� ���� input.txt�� ���� ��, Characterset : Default
 * intput.txt ���Ͽ��� ���� �о �ֿܼ� ���
 * 
 * ��Ʈ :
 * 	1. System.in : �ֿܼ��� ��ǲ
 * 	2. FileOutputStream : ��ǲ ���� ���� ���Ͽ� ����
 * 	3. FileInputStream : ����� ������ ������ �о��
 * 	4. System.out : �ֿܼ� ���
 */

public class Ex06_ConsoleInputOutputObject {
	
	public static void main(String[] args) throws IOException {
		File file = new File("src\\chap19\\Ex06\\input.txt");
		
		// 1. �ֿܼ��� �ѱ۷� ��ǲ ����. (System.in) => byte[] �迭�� �����ؼ� ó�� : �ѱ��� ó��
		InputStream is = System.in;
		System.out.println("�ѱ��� �Է��ϼ���.");
		
		byte[] byteArray1 = new byte[100];
		is.read(byteArray1);
		// read()�� 1byte �� ó�� => �ѱ� ó�� �Ұ���. read(byte[]) : �ѱ�ó��
		
		// 2. ��ǲ ���� �ѱ��� ���Ͽ� ���� (FileOutputStream
		OutputStream os = new FileOutputStream(file);
		
		os.write(byteArray1);		// ����(RAM)�� ������ 
		os.close();		// ���ۿ� ���� ������ ���Ͽ� ����
		
		
		// 3. ����� ���Ͽ��� ���� �о�� (FileIntputStream)
		InputStream is1 = new FileInputStream(file);
		
		is1.read(byteArray1);
		// read()�� 1byte �� ó�� => �ѱ� ó�� �Ұ���. read(byte[]) : �ѱ�ó��
		
		// 4. �о�� �迭�� �ֿܼ� ��� (System.out)
		OutputStream os1 = System.out;	// �ֿܼ� ��� : byte[]
		
		System.out.println();
		System.out.println("�Է��Ͻ� ���� : ");
		
		os1.write(byteArray1);
		os1.flush();
		
		is.close();
		is1.close();
		os1.close();
		
	}
}
