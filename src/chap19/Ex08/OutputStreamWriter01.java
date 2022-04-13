package chap19.Ex08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/*
 * InputStreamReader : byte => char, charset(MS949, UTF-8)�� �����Ͽ� �б� ����
 * OutputStreamWriter : byte => char, charset(MS949, UTF-8)�� �����Ͽ� ���� ����
 */

public class OutputStreamWriter01 {

	public static void main(String[] args) {
		// 1. FileWriter�� ���ؼ� ����Ʈ ���� (default : "MS949")
		File osw1 = new File("src/chap19/Ex08/osw1.txt");	// MS949
		
		try (Writer writer = new FileWriter(osw1);) {
			writer.write("OutputStreamWriter1 ���� �����Դϴ�.\n".toCharArray());	// String�� char[] �迭�� ����
			writer.write("�ѱ۰� ������ ��� ���ԵǾ� �ֽ��ϴ�.");	// String
			writer.write('\n');		// char ����
			writer.write("Goodbye\n\n");
			writer.flush();
		} catch (Exception e) {}
		
		// 2. FileWriter�� ��� (Default : MS949 => UTF-8 ���� ����)
		File osw2 = new File("src/chap19/Ex08/osw2.txt");	// UTF-8
		
		try (OutputStream os = new FileOutputStream(osw2);
			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");) {
			// OutputStreamWriter : byte => char ��ȯ ��� ����
			
			osw.write("OutputStreamWriter1 ���� �����Դϴ�.\n".toCharArray());	// String�� char[] �迭�� ����
			osw.write("�ѱ۰� ������ ��� ���ԵǾ� �ֽ��ϴ�.");	// String
			osw.write('\n');		// char ����
			osw.write("Goodbye\n\n");
			osw.flush();
		} catch (Exception e) {}
	}
}
