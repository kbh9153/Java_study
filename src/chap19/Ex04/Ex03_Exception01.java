package chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/*
 * 1. is1 => InputStream 객체 (절대경로로 접근 - ms949.txt) 예외처리
 * 2. is2 => InputStream 객체 (상대경로로 접근 - utf-8.txt) 예외처리 (try ~ with resource로 예외처리)
 * 		close() 메소드를 자동으로 처리
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
			System.out.println("파일이 존재하지 않습니다.");
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
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {
			try {
				if (is1 != null) {
					is1.close();
				}
			} catch (IOException e) {
				System.out.println("예외가 발생하였습니다.");
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
			// try (with resource : 객체 생성, RAM을 사용)
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}
		
		try {
			array2 = new byte[is2.available()];
			while ((data2 = is2.read()) != -1) {
			array2[index2] = (byte)data2;
			index2++;
			}
			
			String str2 = new String(array2, Charset.forName("UTF-8"));
			// 한글처리 : new String (byte 배열, offset, length, "encoding")
			System.out.println(str2);
		} catch (IOException e) {
			System.out.println("파일을 읽어올 수 없습니다.");
		} finally {
			try {
				if (is2 != null) {
					is2.close();
				}
			} catch (IOException e) {
				System.out.println("예외가 발생하였습니다.");
			}
		}
		
		
	}

}
