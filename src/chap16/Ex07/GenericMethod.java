package chap16.Ex07;

/*
 * Generic Class : class�� ������ �� Ÿ�� ������ ���� => ex. <T> : Generic class�� ����, ��ü�� ������ T�� ������ Ÿ���� ����
 * Generic Method : �Ϲ� class ������ method ����� Generic Ÿ�� ������ ���
 */

class GenericGeneralMethod {		// �Ϲ� class
	public<T> T method1 (T t) {		// Generic method : 1��
		return t;
	}
	
	public<T> boolean method2 (T t1, T t2) {		// Generic method : 1��
		return t1.equals(t2);		// �� ���� �� true or false ��ȯ
									// �⺻ �ڷ����� �� : ���� ��
									// ���� �ڷ����� �� : ���� �ּҸ� ��
									// String�� ��� : ���� ��. Integer, Double equals�� ������ �Ǿ� ����
	}
	
	public<K, V> void method3 (K k, V v) {		// Generic method : 2��
		System.out.println(k + " : " + v);
	}
	
	public<K, V> void method4 () {
		System.out.println("�Ű������� ��ǲ ������ ���� ��� ������ ���� �߻�");
	}
}

public class GenericMethod {

	public static void main(String[] args) {
		// 1. �Ϲ� class ��ü ���� �� Generic method ȣ��
		GenericGeneralMethod ggm = new GenericGeneralMethod();
		String str1 = ggm.<String>method1("�ȳ�");
		String str2 = ggm.method1("�ȳ�");		// Ÿ���� �� �� �ִ� ��� ���� ����(�Ű������� ���� �� �� ���� ����)
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("---------------");
		
		Integer i1 = ggm.<Integer>method1(7);
		Integer i2 = ggm.method1(4);
		
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println("---------------");
		
		Boolean b1 = ggm.<Boolean>method1(true);
		Boolean b2 = ggm.method1(false);
		
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println("---------------");
		
		Boolean d1 = ggm.<Double>method2(2.55, 2.55);		// return Ÿ���� Boolean
		Boolean d2 = ggm.<Double>method2(2.55, 2.45);		// return Ÿ���� Boolean
		
		System.out.println(d1);
		System.out.println(d2);
		
		System.out.println("---------------");
		
		ggm.<String, Integer>method3("����", 90);
		ggm.method3("����", 87);		// �Ű������� ��ǲ�Ǵ� ������ Ÿ���� �� �� �ִ� ��� ���� ����
		
		ggm.<Integer, String>method3(500,"���� ����");
		ggm.method3(402, "������ ã�� �� �����ϴ�.");
		
		System.out.println("---------------");
		
		ggm.method4();
	}

}
