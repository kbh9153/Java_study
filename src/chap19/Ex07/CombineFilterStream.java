package chap19.Ex07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* 
 * 하나의 기반 스트림에 Filter 스트림을 여러개 혼합하여 사용 가능
 * 	- 제일 마지막에 처리하는 스트림의 메소드 사용여부에 따라 순서를 정할 수 있음
 * 
 * 기반스트림 1 : FileOutputStream : 기반 스트림. 파일에 쓰기
 * FilterStream : BufferedOutputStream : 버퍼를 사용해서 빠르게 저치 (메모리 사용)			 
 * FilterStream : DataOutputStream : 다양한 포맷 방식으로 처리
 */

public class CombineFilterStream {

	public static void main(String[] args) {
		// 1. 파일 생성
		File dataFile = new File("src\\chap19\\Ex07\\file2.data");
		
		// 2. 데이터 쓰기
		try (OutputStream os = new FileOutputStream(dataFile);		// 기반 스트림
			BufferedOutputStream bos = new BufferedOutputStream(os);	// Filter 스트림 : 추가 기능 제공, 단독 사용 불가
			DataOutputStream dos = new DataOutputStream(bos);) {		// Filter 스트림 : 추가 기능 제공, 단독 사용 불가
			
			dos.writeInt(37);
			dos.writeDouble(5.3);
			dos.writeChar('C');
			dos.writeUTF("자바");
			dos.flush(); 
			
		} catch (Exception e) {}
		
		// 3. 데이터 읽기
		try (InputStream is = new FileInputStream(dataFile);
			BufferedInputStream bis = new BufferedInputStream(is);
			DataInputStream dis = new DataInputStream(bis);) {
			
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		} catch (Exception e) {}
	}
	
}
