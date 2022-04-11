package chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class FileInputStream_02 {

	public static void main(String[] args) throws IOException {
		// 1. �Է� ���� ����
		File inFile = new File("src\\chap19\\files\\FileInputStrea01.txt");
		
		// 2-1. byte ���� �б� (�� byte�� �о ó��)
		InputStream is1 = null;		// ��ü ����, Finally ��Ͽ��� close
		
		try {
			is1 = new FileInputStream(inFile);
			
			int data1 = 0;
			while ((data1 = is1.read()) != -1) {	// ������ �����Ƿ� read() �޼ҵ常 ���, �ѱ��� ��� read(byte �迭 ���)
				System.out.print((char)data1);
			}
		} catch (IOException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
		} finally {
			try {
				if (is1 != null) {	// null�� �� close()�� ȣ���ϸ� IOException �߻�
					is1.close();
				}
			} catch (IOException e) {
				
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("<< try(with resource){}�� �����ϱ� >>");
		
		try {
			InputStream is2 = new FileInputStream(inFile);
			// try resource : ��ü ���� => close()�� �ڵ����� ���� => FileInputStream clos
			int data2 = 0;
			while ((data2 = is2.read()) != -1) {	// ������ �����Ƿ� read() �޼ҵ常 ���, �ѱ��� ��� read(byte �迭 ���)
				System.out.print((char)data2);
			}
		} catch (IOException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
		}
		
		// 3-1. n-byte ������ �б�(byte[])�� ó�� ��ġ�������� ���� ������ ���� : ���� ����Ʈ�� ���ÿ� �о ó�� ����\
		
		System.out.println();
		System.out.println();
		System.out.println("----------------------");
		
		InputStream is3 = new FileInputStream(inFile);
		byte[] byteArray1 = new byte[9];	// �� ũ�� 9
		int count1;
		while((count1 = is3.read(byteArray1)) != -1) {	// -1 : ������ ���� ����������
			// is3.read() : 1byte�� ����
			// is3.read(byteArray1) : 9byte�� ���� (= �� ũ��)
			// count : 9, 9, 2 ���� ���� -1�� �Ǹ鼭 while �� ����
			for (int i = 0; i < count1; i++) {
				System.out.print((char)byteArray1[i]);
			}
			System.out.println(" : count1 = " + count1);
			
			/*
			System.out.println();
			System.out.println("----------------------");
			
			String str1 = new String(byteArray1, Charset.forName("MS949"));
			System.out.println(str1);
			*/
		}
		is3.close();
		
		System.out.println();
		System.out.println("----------------------");
		
		// 3-2. n-byte ������ �о�鿩 �ѱ� ó��(�迭 ������ �о �ѱ� ó��)
		InputStream is4 = new FileInputStream(inFile);
		
		byte[] byteArray2 = new byte[100];
		int count2;
		
		while ((count2 = is4.read(byteArray2)) != -1) {
			System.out.println(new String(byteArray2, Charset.forName("MS949")));
		}
		
		System.out.println();
		System.out.println("----------------------");
		
		// 3-3. n-byte ������ �о ����. offset, length ���
		InputStream is5 = new FileInputStream(inFile);
		byte[] byteArray4 = new byte[9];
		
		int offset = 3;
		int length = 6;
		int count4 = is5.read(byteArray4, offset, length);	// length��ŭ �տ��� �о�ͼ� byteArray4�� offset ��ġ�� �����ض�
		
		for (int i = 0; i < offset + count4; i++) {
			System.out.print((char)byteArray4[i]);
		}
		
		is5.close();
	}
}
