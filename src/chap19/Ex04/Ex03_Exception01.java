package chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/*
 * 1. is1 => InputStream ��ü (�����η� ���� - ms949.txt) ����ó��
 * 2. is2 => InputStream ��ü (����η� ���� - utf-8.txt) ����ó�� (try ~ with resource�� ����ó��)
 * 		close() �޼ҵ带 �ڵ����� ó��
 */

public class Ex03_Exception01 {

	public static void main(String[] args) {
		File file1 = new File("D:/kbh/02_java/src/chap19/Ex04/exception_ms949.txt");
		
		InputStream is1 = null;
		int data1 = 0;
		
		byte[] array1 = null;
		int index1 = 0;
		
		try {
			is1 = new FileInputStream(file1);
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		
		try {
			array1 = new byte[is1.available()];
			
			while ((data1 = is1.read()) != -1) {
			array1[index1] = (byte)data1;
			index1++;
			}
			
			String str1 = new String(array1, Charset.forName("MS949"));
			System.out.println(str1);
		} catch (IOException e) {
			System.out.println("������ ���� �� �����ϴ�.");
		} finally {
			try {
				if (is1 != null) {
					is1.close();
				}
			} catch (IOException e) {
				System.out.println("���ܰ� �߻��Ͽ����ϴ�.");
			}
		}
		
		System.out.println();
		System.out.println("========================");
		System.out.println(System.getProperty("user.dir"));
		System.out.println("========================");
		System.out.println();
				
		File file2 = new File("src/chap19/Ex04/exception_utf8.txt");
		
		InputStream is2 = null;
		byte[] array2 = null;
		int data2 = 0;
		int index2 = 0;
		
		try {
			is2 = new FileInputStream(file2);
			// try (with resource : ��ü ����, RAM�� ���)
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		
		try {
			array2 = new byte[is2.available()];
			while ((data2 = is2.read()) != -1) {
			array2[index2] = (byte)data2;
			index2++;
			}
			
			String str2 = new String(array2, Charset.forName("UTF-8"));
			// �ѱ�ó�� : new String (byte �迭, offset, length, "encoding")
			System.out.println(str2);
		} catch (IOException e) {
			System.out.println("������ �о�� �� �����ϴ�.");
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
