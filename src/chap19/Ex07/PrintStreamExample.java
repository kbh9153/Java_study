package chap19.Ex07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/*
 * PrintStream : Filter Stream (�߰������ �����ϴ� Stream), ��� ��Ʈ�� �ʼ�
 * 	- �پ��� ������� ��¿� Ưȭ�� ��Ʈ��. flush()�� ȣ������ �ʾƵ� �ڵ����� flush()
 * 	- println(), print(), printf()
 * 	- ���� ���, �ܼ� ��� ����
 */

public class PrintStreamExample {

	public static void main(String[] args) {
		// 1. File ��ü ����
		File outFile1 = new File("src\\chap19\\Ex07\\printStream01");
		
		// 2. printStream (FileOutputStream(File)) => ���Ͽ� ���
		try (OutputStream os1 = new FileOutputStream(outFile1);
			PrintStream ps = new PrintStream(os1);) {		// Filter ��Ʈ��(�߰� ����� ����), ��� ��Ʈ���� �ʼ�
			
			ps.println(5.3);	// double ��� => ��� �� ���� ���� O
			ps.print(3 + "�ȳ�" + 12345 + "\n");		// ��� �� ���� ���� X
			ps.printf("%d �� ȣ��Ǿ����ϴ�. \n", 7);		// "%d" : �������� ȣ��
			ps.printf("%s %f", "�ȳ�", 5.8);		// "%s" : ���ڿ�, "%f" : �Ǽ� 
			
			// ps.flush() => �ڵ����� ȣ��
		} catch (Exception e) {}
		
		// 3. PrintStream (File) => ���Ͽ� ���
		File outFile2 = new File("src\\chap19\\Ex07\\printStream02");
		
		try (PrintStream ps = new PrintStream(outFile2);) {
			
			ps.println(5.3);	// double ��� => ��� �� ���� ���� O
			ps.print(3 + "�ȳ�" + 12345 + "\n");		// ��� �� ���� ���� X
			ps.printf("%d �� ȣ��Ǿ����ϴ�. \n", 7);		// "%d" : �������� ȣ��
			ps.printf("%s %f", "�ȳ�", 5.8);		// "%s" : ���ڿ�, "%f" : �Ǽ� 
		} catch (FileNotFoundException e) {}
		
		// 4. OutputStream = System.out;	=> �ֿܼ� ���
		
		try (OutputStream os2 = System.out;
			PrintStream ps = new PrintStream(os2);) {
			
			ps.println(5.3);	// double ��� => ��� �� ���� ���� O
			ps.print(3 + "�ȳ�" + 12345 + "\n");		// ��� �� ���� ���� X
			ps.printf("%d �� ȣ��Ǿ����ϴ�. \n", 7);		// "%d" : �������� ȣ��
			ps.printf("%s %f", "�ȳ�", 5.8);		// "%s" : ���ڿ�, "%f" : �Ǽ� 
		} catch (Exception e) {}
		
		
		System.out.println("------------------------------");
		
		// 5. PrintStream ps = System.out;
		try (PrintStream ps = System.out;) {
			
			ps.println(5.3);	// double ��� => ��� �� ���� ���� O
			ps.print(3 + "�ȳ�" + 12345 + "\n");		// ��� �� ���� ���� X
			ps.printf("%d �� ȣ��Ǿ����ϴ�. \n", 7);		// "%d" : �������� ȣ��
			ps.printf("%s %f", "�ȳ�", 5.8);		// "%s" : ���ڿ�, "%f" : �Ǽ� 
			} catch (Exception e) {}
		
		
	}
}
