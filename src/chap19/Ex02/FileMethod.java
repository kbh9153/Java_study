package chap19.Ex02;

import java.io.File;

public class FileMethod {

	public static void main(String[] args) {
		// 1. C:\�� �۾� ���� ����
		File tempDir = new File("C:\\kosmo\\02_java\\temp01");
		if (!tempDir.exists()) {tempDir.mkdir();}
		
		// 2. ���� ��ü ���� (C:/Windows)
		File file = new File("C:/Windows");
		
		// 3. ���� ��ü�� ���� �޼ҵ� ���
		System.out.println("���� ��� ��� : " + file.getAbsolutePath());
		System.out.println("������������ Ȯ�� : " + file.isDirectory());
		System.out.println("������������ Ȯ�� : " + file.isFile());
		System.out.println("����/���� �̸� ��� : " + file.getName());	// ����, ���� �̸� ���
		System.out.println("�θ� ������ ��� : " + file.getParent());	// �θ� ������ ���
		
		File newFile1 = new File("C:\\kosmo\\02_java\\temp01\\abc");
		System.out.println(newFile1.mkdir());	// ������ ���� �� ������ ���������� true, �������� ���� ��� false
		System.out.println(newFile1.exists());
		
		File newFile2 = new File("C:\\kosmo\\02_java\\temp01\\abc\\bcd\\cde");
		System.out.println(newFile2.mkdir());		// false. ���� �������� �ѹ��� ���� �ȵ�
		System.out.println(newFile2.mkdirs());		// true. ���� �������� �ѹ��� ����
		
		File newFile3 = new File("C:\\kosmo\\02_java\\temp01\\def\\hij\\kim");
		System.out.println(newFile3.mkdirs());
		
		// 4. File ��ü�� ����ؼ� ���� ������ ���� ����
		File[] fname = file.listFiles();	// file : "C:\Windows" ������ ��� ������ ������ �̸��� File �迭�� ����
		
		for (File k : fname) {
			System.out.println((k.isDirectory() ? "���� : " : "���� : ") + k.getName());
		}
	}
}
