package chap19.Ex06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// 콘솔에서 한글을 인풋받은 값을 input.txt에 저장 후, Characterset : Default
// intput.txt 파일에서 값을 읽어서 콘솔에 출력

public class Ex06_ConsoleInputOutputObject {
	
	public static void main(String[] args) throws IOException {
		// Input
		File file = new File("src\\chap19\\Ex06\\input.txt");
		
		OutputStream os = new FileOutputStream(file);
		
		InputStream is = System.in;
		System.out.println("한글을 입력하세요.");
		
		byte[] byteArray1 = new byte[100];
		is.read(byteArray1);
		
		os.write(byteArray1); 
		os.close();
		
		is.close();
		
		// Output
		File file2 = new File("src\\chap19\\Ex06\\input.txt");
		InputStream is1 = new FileInputStream(file2);
		
		OutputStream os1 = System.out;
		
		byte[] byteArray2 = new byte[100];
		
		is1.read(byteArray2);
		
		os1.write(byteArray2);
		os1.flush();
		os1.close();

		is1.close();
		
	}
}
