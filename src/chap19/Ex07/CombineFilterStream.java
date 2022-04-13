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
 * �ϳ��� ��� ��Ʈ���� Filter ��Ʈ���� ������ ȥ���Ͽ� ��� ����
 * 	- ���� �������� ó���ϴ� ��Ʈ���� �޼ҵ� ��뿩�ο� ���� ������ ���� �� ����
 * 
 * ��ݽ�Ʈ�� 1 : FileOutputStream : ��� ��Ʈ��. ���Ͽ� ����
 * FilterStream : BufferedOutputStream : ���۸� ����ؼ� ������ ��ġ (�޸� ���)			 
 * FilterStream : DataOutputStream : �پ��� ���� ������� ó��
 */

public class CombineFilterStream {

	public static void main(String[] args) {
		// 1. ���� ����
		File dataFile = new File("src\\chap19\\Ex07\\file2.data");
		
		// 2. ������ ����
		try (OutputStream os = new FileOutputStream(dataFile);		// ��� ��Ʈ��
			BufferedOutputStream bos = new BufferedOutputStream(os);	// Filter ��Ʈ�� : �߰� ��� ����, �ܵ� ��� �Ұ�
			DataOutputStream dos = new DataOutputStream(bos);) {		// Filter ��Ʈ�� : �߰� ��� ����, �ܵ� ��� �Ұ�
			
			dos.writeInt(37);
			dos.writeDouble(5.3);
			dos.writeChar('C');
			dos.writeUTF("�ڹ�");
			dos.flush(); 
			
		} catch (Exception e) {}
		
		// 3. ������ �б�
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
