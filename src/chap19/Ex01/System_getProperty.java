package chap19.Ex01;

public class System_getProperty {

	public static void main(String[] args) {
		// System.getProperty() �޼ҵ��� ������ ������
		
		System.out.println(System.getProperty("user.dir"));		// ���� �۾� ���� ��ġ�� ���
		System.out.println(System.getProperty("java.version"));		// �ڹ� ���� ������ ���
		System.out.println(System.getProperty("java.vendor"));
		System.out.println(System.getProperty("java.vendor.url"));
		System.out.println(System.getProperty("java.home"));	// �ڹ� ��ġ Ȩ ����
		System.out.println(System.getProperty("java.class.path"));	// Ŭ���� ���� ��ġ�� ���
		System.out.println(System.getProperty("user.name"));		// �α׿� ���� ����
		System.out.println(System.getProperty("user.home"));		// �α׿� ������ Ȩ����
		System.out.println(System.getProperty("os.name"));		// os ����
		System.out.println(System.getProperty("os.arch"));		// os ��Ű��ó
		System.out.println(System.getProperty("os.version"));		// os ����
		System.out.println(System.getProperty("file.separator"));	// ����, ���� ������(= \, /)
		System.out.println(System.getProperty("path.separator"));
		System.out.println(System.getProperty("line.separator"));
		
		
		
	}
}
