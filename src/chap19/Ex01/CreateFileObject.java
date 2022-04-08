package chap19.Ex01;

import java.io.File;	// ���ϰ� ������ �ٷ�� ��ü
import java.io.IOException;

// ���� : ��Ŭ�������� ������ ������ C:\ ��ġ�� �ٷ� �����ϸ� ���� ������ ���� ������ �߻��� �� ����
	// 1. ��Ŭ������ << ������ ���� >> ���� ����
	// 2. ���� ���ο� ������ ����

/*
 * File ��ü ���� ���� �ĺ��ڸ� ������ ���
 * 	1. OS�� Windows ��� : String path = "C:\\abc\\abc.txt" => "" ���� Ư�����ڸ� ó���ϱ� ���� ��ȣ. \�� ó���ϱ� ���� \\�� ���� �ι� �Է�
 *		=> Windows 10 �̻� : "C:/abc/abc.txt" macOS�� ���� / ��� ����
 * 	2. OS�� macOS ��� : String path = "C:/abc/abc.txt"
 * 	3. OS ȣȯ�� ���ؼ� ���������� ����� �� �ִ� �ڵ� �ۼ�
 * 		=> String path = "C:" + File.separator + "abc" + File.separator + "abc.txt" : \\�� /�� File.separator�� ��ü�Ͽ� �Է�
 * 
 */

public class CreateFileObject {

	public static void main(String[] args) throws IOException {
		// 1. File ��ü�� ����ؼ� ���� ����
		File tempDir = new File("C:\\kosmo\\02_java\\temp01");		// �����ڿ� ���� �����̳� ������ ��ġ���� ǥ���Ͽ� �Է�
		if (!tempDir.exists()) {	// �ش� ��ο� �����̳� ������ �����ϸ� true, false
			tempDir.mkdir();	// ���� ���� ���
		}
		
		System.out.println(tempDir.exists());	// ������ ��ο� �����ϸ� true, �������� ������ false
		
		// 2. File ��ü�� ����ؼ� ���� ����
		File newFile = new File("C:\\kosmo\\02_java\\temp01\\newfile.txt");		// C:\ ������ ������ ��� ���� ������ ���� ���� ���� => ��Ŭ������ ������ �������� ����
		if (!newFile.exists()) {
			// newFile.createNewFile();		// ������ ������ �� ���ܰ� �߻��� �� ����(���ѹ��� ��). ���� ó���� �ʿ�
			newFile.createNewFile();
		}
		System.out.println(newFile.exists());
		
		System.out.println();
		
		// 3. ���� ������
		File newFile2 = new File("C:\\kosmo\\02_java\\temp01\\newfile02.txt");
		File newFile3 = new File("C://kosmo/02_java/temp01/newfile03.txt");
		
		if (!newFile2.exists() && !newFile3.exists()) {
			newFile2.createNewFile();
			newFile3.createNewFile();
		}
		
		System.out.println(newFile2.exists());
		System.out.println(newFile3.exists());
		
		// ��� OS���� �������� �ĺ� ������ �ڵ�
		File newFile4 = new File("C:" + File.separator + "kosmo" + File.separator + "02_java" + File.separator + "temp01" + File.separator + "newfile04.txt");
		if (!newFile4.exists()) {newFile4.createNewFile();}

		// 4. ���� ��η� ó�� : �ٸ� �ý������� �ε��� ��� �� �ý��� ȯ�濡 �µ��� ������ �ʿ�
		File newFile5 = new File("C://kosmo/02_java/temp01/newfile03.txt");
		System.out.println(newFile5.getAbsolutePath());		// file ��ü�� ����� ������ �����θ� ���
		
		// 5. ��� ��η� ó�� => ����
		// ���� ���� �۾� ������ ��ġ�� �˾ƾ� ��
		System.out.println(System.getProperty("user.dir"));		// System.getProperty : ���� �۾� ������ ��ġ(��Ŭ���� ���� ���� ��ġ)	
		File newFile6 = new File("newFile06.txt");		// ��� ��η� ���
		if (!newFile6.exists()) {newFile6.createNewFile();}
		System.out.println(newFile6.getAbsolutePath());
		
	}
}
