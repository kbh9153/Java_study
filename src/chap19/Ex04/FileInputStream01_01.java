package chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream01_01 {
	
	public static void main(String[] args) {
		File inFile = new File("src\\chap19\\files\\FileInputStrea01.txt");
		
		// 예외 처리 : 2개의 예외에 대해서 각각 처리
		InputStream is = null;
		try {
			is = new FileInputStream(inFile);		// FileNotFoundException
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}
		
		int data = 0;
		try {
			while ((data = is.read()) != -1) {			// IOException
				System.out.print((char)data);
			}
		} catch (IOException e) {
			System.out.println("파일을 읽지 못하는 예외가 발생되었습니다.");
		}
		
		try {
			if (is != null) {
				is.close();
			}
		} catch (IOException e) {
			
		}
		
		System.out.println();
		
		// 예외 처리 : 2개의 예외에 대해서 한번에 처리
		InputStream is2 = null;
		int data2 = 0;
		
		try {
			is2 = new FileInputStream(inFile);
			
			while((data2 = is2.read()) != -1) {
				System.out.print((char)data2);
			}
		} catch (IOException e) {		// IOException > FileNotFouneException : IOException이 상위 예외이기 때문에 포괄적 처리가 가능
			System.out.println("예외가 발생했슘댱");
		} finally {
			try {
				if (is2 != null) {
					is2.close();
				}
			} catch (IOException e) {
				System.out.println("예외가 발생했슘댱");
			}
		}
		
		
	}
}
