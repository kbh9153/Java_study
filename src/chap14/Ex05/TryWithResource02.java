package chap14.Ex05;

// Resource : �޸𸮸� ����

/*
 * ���� ������ ��ü���� AutoCloseable�� ����غ���
 * 	try (��ü ��������) {} catch {} : �ڵ����� close() ��		// try (With Resource)
 * 		1. AutoCloseable interface�� close()�� method�� overriding �����ؾ���
 */

// java.lang.AutoCloseable : java.lang => import ���� ������� �ʾƵ� ��
// java.long.Object

/*
 *  ���ܸ� ó���ϴ� ���
 *  	1. try catch�� ����ؼ� ���� ó�� : �ڽ��� ���� ���ܸ� ó���ϰڴ�
 *  	2. throws�� ���ؼ� ���ܸ� ó���ϴ� ���	 : ���ܸ� ���� ó������ �ʰ� ȣ���ϴ� ������ ���ܸ� ó���ϵ��� ����
 *  		=> ���� ����. method ���� ����
 */

// throw : ���ڸ� ������ �߻���Ŵ
	

class A implements AutoCloseable {
	String resource;		// ����� ���� ���� ���� null
	
	A (String resource) {		// �������� �Ű������� String ���� �޾Ƽ� �޸𸮷� �ε�
		this.resource = resource;
	}
	
	@Override
	public void close() throws Exception {		// close() method�� �ڵ����� ȣ��
		System.out.println(resource);
		
		if (resource != null) {
			resource = null;
			System.out.println("���ҽ��� �����Ǿ����ϴ�.");
			System.out.println(resource);
		}
	}
}

public class TryWithResource02 {

	public static void main(String[] args) {
		// 1. �ڵ� ���ҽ� ���� ���
		try ( A a1 = new A("Ư�� ����");) {
			
		} catch (Exception e) {
			System.out.println("���ܰ� �߻��Ǿ����ϴ�.");
		} // finally ��Ͽ� a1.close() �ڵ����� ȣ��
		
		System.out.println("-------------------");
		
		// 2. ���� ���ҽ� ���� ���
		A a2 = null;
		
		try {
			a2 = new A("������ �ʱⰪ �Ҵ�");
		} catch (Exception e) {
			
		} finally {		// 
			if (a2.resource != null) {
				try {
					a2.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
