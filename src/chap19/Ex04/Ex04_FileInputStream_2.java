package chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

// FileInputStream
// is1 : MS949 �ѱ۷� �б� ó��, try (with resource), ���� ó��
// is2 : UTF-8 �ѱ� �б� ó��, try ����ó��

public class Ex04_FileInputStream_2 {

	public static void main(String[] args) {
		File inFIle = new File("src\\chap19\\Ex04\\files\\file_ms949.txt");
		
		System.out.println(System.getProperty("user.dir"));
		System.out.println();
		
		byte[] array1 = null;
		int index1 = 0;
				
		try (InputStream is1 = new FileInputStream(inFIle);) {
			int data1;
			
			array1 = new byte[is1.available()];
			while ((data1 = is1.read(array1)) != -1) {
				array1[index1] = (byte)data1;
				System.out.println(new String(array1, Charset.forName("MS949")));
				index1++;
			}
		} catch (IOException e) {
			System.out.println("������ �ҷ��� �� �����ϴ�.");
		}
		
		System.out.println("=================================");
		
		File inFIle2 = new File("src\\chap19\\Ex04\\files\\file_utf8.txt");
		
		InputStream is2 = null;
		byte[] array2 = null;
		int index2 = 0;
		
		try {
			is2 = new FileInputStream(inFIle2);
			int data2;
			array2 = new byte[is2.available()];
			
			while ((data2 = is2.read(array2)) != -1) {
				array2[index2] = (byte)data2;
				System.out.println(new String(array2, Charset.forName("UTF-8")));
				index2++;
			}
			
		} catch (IOException e) {
			System.out.println("������ �ҷ��� �� �����ϴ�.");
		} finally {
			try {
				if (is2 != null) {
					is2.close();
				}
			} catch (IOException e) {
				System.out.println("���ܰ� �߻��Ͽ����ϴ�.");
			}
		}

	}

}
