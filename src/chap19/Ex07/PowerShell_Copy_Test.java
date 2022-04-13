package chap19.Ex07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class PowerShell_Copy_Test {

	public static void main(String[] args) {
		// 두 파일을 복사, Buffered를 사용하지 않고 처리하는 경우 속도 vs Buffered를 사용하는 경우 속도
		File orgFile = new File("D:\\kbh\\PowerShell-7_origin.msi"); // 원본 파일
		File copyFile1 = new File("D:\\kbh\\PowerShell-7_copy1.msi"); // Buffered를 사용하지 않고 처리
		File copyFile2 = new File("D:\\kbh\\PowerShell-7_copy2.msi"); // Buffered를 사용하여 처리

		// 성능 측정을 하기위한 변수 선언
		long start, end, time1, time2; // time1 : Bufferd(x), time2 : Buffered(o)

		// 1. Buffered를 사용하지 않고 처리하는 경우 (BufferedInputStream, BufferOutStream)
		start = System.nanoTime(); // 시작 시간

		try (InputStream is = new FileInputStream(orgFile); // Auto close()
				OutputStream os = new FileOutputStream(copyFile1); // Auto close()
		) {
			// 데이터 복사 코드 생성
			int data;
			while ((data = is.read()) != -1) { // is에서 1byte 읽어서 => -1 : 읽을 데이터가 없어질 마지막까지
				os.write(data); // os에 1byte 쓰기
			}

		} catch (IOException e) {
		}
		end = System.nanoTime();
		time1 = end - start;
		System.out.println("Without BufferedXXXStream : " + time1); // 버퍼를 사용하지 않고 복사. copy1.jpg

		// 2. Buffered를 사용하면서 처리하는 경우 (BufferedInputStream, BufferedOutStream)
		start = System.nanoTime();

		try (InputStream is = new FileInputStream(orgFile); // 기반 스트림
				BufferedInputStream bis = new BufferedInputStream(is); // 추가 기능을 제공하는 스트림. 성능 향상 (Buffer 사용함)
				OutputStream os = new FileOutputStream(copyFile2); // 기반 스트림
				BufferedOutputStream bos = new BufferedOutputStream(os); // 추가 기능을 제공하는 스트림 (필터)
		// is, bis, os, bos => Auto close()
		) {
			// 데이터 복사 코드 생성
			int data;
			while ((data = bis.read()) != -1) { // 버퍼를 사용해서 읽기
				bos.write(data); // 버퍼를 사용해서 쓰기
			}
		} catch (IOException e) {
		}
		end = System.nanoTime();
		time2 = end - start;
		System.out.println("With BufferedXXXStream : " + time2);

		// Buffered 사용한 경우 (time2), Buffered 사용하지 않는 경우 (time1)
		System.out.println();
		System.out.println("속도 차이(배수) : " + (double) (time1 / time2) + " 배");
		/*
		 * Without BufferedXXXStream : 300340398000
		 * With BufferedXXXStream : 2931872300
		 * 
		 * 속도 차이(배수) : 102.0 배
		 */
		

		
	}
}
