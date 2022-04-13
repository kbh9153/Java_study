package chap19.Ex06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* 
 * 콘솔에서 한글을 인풋받은 값을 input.txt에 저장 후, Characterset : Default
 * intput.txt 파일에서 값을 읽어서 콘솔에 출력
 * 
 * 힌트 :
 * 	1. System.in : 콘솔에서 인풋
 * 	2. FileOutputStream : 인풋 받은 값을 파일에 저장
 * 	3. FileInputStream : 저장된 파일의 내용을 읽어옴
 * 	4. System.out : 콘솔에 출력
 */

public class Ex06_ConsoleInputOutputObject {
	
	public static void main(String[] args) throws IOException {
		File file = new File("src\\chap19\\Ex06\\input.txt");
		
		// 1. 콘솔에서 한글로 인풋 받음. (System.in) => byte[] 배열을 생성해서 처리 : 한글을 처리
		InputStream is = System.in;
		System.out.println("한글을 입력하세요.");
		
		byte[] byteArray1 = new byte[100];
		is.read(byteArray1);
		// read()는 1byte 씩 처리 => 한글 처리 불가능. read(byte[]) : 한글처리
		
		// 2. 인풋 받은 한글을 파일에 저장 (FileOutputStream
		OutputStream os = new FileOutputStream(file);
		
		os.write(byteArray1);		// 버퍼(RAM)에 쓰여짐 
		os.close();		// 버퍼에 쓰인 내용을 파일에 쓰기
		
		
		// 3. 저장된 파일에서 값을 읽어옴 (FileIntputStream)
		InputStream is1 = new FileInputStream(file);
		
		is1.read(byteArray1);
		// read()는 1byte 씩 처리 => 한글 처리 불가능. read(byte[]) : 한글처리
		
		// 4. 읽어온 배열을 콘솔에 출력 (System.out)
		OutputStream os1 = System.out;	// 콘솔에 출력 : byte[]
		
		System.out.println();
		System.out.println("입력하신 내용 : ");
		
		os1.write(byteArray1);
		os1.flush();
		
		is.close();
		is1.close();
		os1.close();
		
	}
}
