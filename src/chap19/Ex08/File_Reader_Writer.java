package chap19.Ex08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

/*
 * Reader / Writer : char ���� �����. ���ڸ� ó���ϵ��� Ưȭ�� �߻� Ŭ����
 * 	- ���ڵ��� �Ű��� �� �ᵵ �ȴٴ� ����
 * 	- byte : 1byte
 * 	- char : 2byte (UTF-16(�ѱ�, ���� ��� 2byte)�� ó��)
 * 
 * FileReader : charset���� �ɼ��� ����. default charset ���
 * FileWriter : charset���� �ɼ��� ����. default charset ���
 */

public class File_Reader_Writer {

	public static void main(String[] args) {
		// 1. ���ϰ��� ����
		File rwFile = new File("src\\chap19\\Ex08\\rwFile.txt");
		
		try (Writer writer = new FileWriter(rwFile);) {		// Wirter : �߻� Ŭ����, FileWriter : Writer�� ������ �ڽ� Ŭ����
			// OutputStream : byte ���� ���, �߻�Ŭ����, FileOutputStream
			// Writer : char ���� ���, �߻�Ŭ����, FileWriter
			
			writer.write("�ȳ��ϼ���\n".toCharArray());		// String => Char �迭�� ����
			writer.write("Hello");		// String
			writer.write('A');
			writer.write('\r');
			writer.write('\n');
			writer.write("�ݰ����ϴ�", 2, 3);
			writer.flush();
		} catch (Exception e) {}
		
		// 2. FileReader�� �̿��� ���� �б� (Default MS949) => Charactorset ���� �ɼ��� ����
		try (Reader reader = new FileReader(rwFile);) {
			int data;
			while ((data = reader.read()) != -1) {
				System.out.println((char)data);
			}
		} catch (Exception e) {}
		
	}
}
