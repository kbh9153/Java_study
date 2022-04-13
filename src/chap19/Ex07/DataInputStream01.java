package chap19.Ex07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * InputStream : ��� ��Ʈ��
 * 	- int => 5555 (���ڷ� �ϳ��ϳ� ��ȯ) => 5555 (���� �ϳ��ϳ� �޾Ƽ� int Ÿ������ ������) => int
 * 
 * DataInputStream : �߰� ����� �����ϴ� ��Ʈ��, ��� ��Ʈ���� �ݵ�� ����, �ܵ����� ��� �Ұ���
 * 	- �پ��� ������ �����͸� ������ ������ �� ���
 * 	- int => int, double => double
 */

public class DataInputStream01 {
	
	public static void main(String[] args) {
		// ���� ����
		File dataFile = new File("src\\chap19\\Ex07\\file1.data");	// Ȯ���� ����! : ���̳ʸ� �����ͷ� ����
		
		// ������ ���� (DataOutputStream)
		try (OutputStream os = new FileOutputStream(dataFile);
			DataOutputStream dos = new DataOutputStream(os);) {		// �߰� ����� �����ϴ� ��Ʈ��. ��� ��Ʈ�� �ʼ�. ������ ���ο� ��� ��Ʈ�� ����
			
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("�ȳ��ϼ���");
			dos.flush();
		} catch (Exception e) {}	// Exception : ���� �ֻ���(���)�� ����ó��
		
		// ������ �б� (DataInputStream)
		try (InputStream is = new FileInputStream(dataFile);
			DataInputStream dis = new DataInputStream(is);) {
			
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		} catch (Exception e) {}
		
		
	}
}
