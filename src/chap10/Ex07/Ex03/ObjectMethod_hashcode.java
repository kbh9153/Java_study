package chap10.Ex07.Ex03;

import java.util.HashMap;
// HashMap : key = ������ ����Ǵ� �ڷᱸ��.
	// => key�� �ߺ��� �� ����
	// HashMap�� key�� ��ü�� ������ ���, key�� ����Ǵ� ��ü�� �ߺ����� �ʴ� ������ ������ �����ؾ� ��
	// (��ü�� �ߺ����� �ʴ� ������ ����) => Object class�� hashcode()�� ����ؼ� ��ü�� �ߺ����� �ʵ��� ����

class A {
	String name;
	A (String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.name == ((A)obj).name) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return name;
	}
}

class B {
	String name;
	B (String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {		// hashCode() + equals() ������ => �� ������ ������ ������ ��ü�� �ν�
		if (this.name == ((B)obj).name) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public int hashCode() {			// hashCode() ������
		return name.hashCode();
	}
	
	@Override
	public String toString() {		// toString() ������
		return name;
	}
}

public class ObjectMethod_hashcode {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap01 = new HashMap<>();		// <Integer => key, String => value>
		hashMap01.put(1, "������01");
		hashMap01.put(1, "������03");		// �ϳ��� key���� �ߺ��� value�� ���� �� ���� => "������01" -> "������03"
		hashMap01.put(2, "������07");
		
		System.out.println(hashMap01);		// 1=������03, 2=������07 ���

		System.out.println("-------------------------");
		
		HashMap<A, String> hashMap02 = new HashMap<>();		// hashCode() + equals() ������ ���� �Ҹ���
		hashMap02.put(new A("ù��°"), "������01");
		hashMap02.put(new A("ù��°"), "������02");
		hashMap02.put(new A("�ι�°"), "������03");
		
		System.out.println(hashMap02);		// HashMap�� �߸� ������ ���
		
		System.out.println("-------------------------");
		
		HashMap<B, String> hashMap03 = new HashMap<>();		// hashCode() + equals() ������ ���� ����
		hashMap03.put(new B("ù��°"), "������01");
		hashMap03.put(new B("ù��°"), "������02");
		hashMap03.put(new B("�ι�°"), "������03");
		
		System.out.println(hashMap03);		// HashMap ������ ����� ������ ��� : Key�� �ߺ��Ǹ� �ȵ�
											// hashMap3�� toString() method�� ������
		
		System.out.println("ù��°".hashCode());
		System.out.println("ù��°".hashCode());
		System.out.println("�ι�°".hashCode());
		
	}

}
