package chap17.Ex08;

import java.util.Comparator;
import java.util.TreeSet;

// �̸��� ���̸� �Է����� �� �̸��� ������������ ����ϵ��� �����ϼ���. TreeSet�� name column��
// 1. Comparable<E>�� compareTo() method �������ؼ� ����
	// ������ ��ü ������ �ʿ�
// 2. Comparator<E>�� compare() method �������ؼ� ����
	// ������ ��ü�� �������� ����

class Abc {
	String name;	// ���� column. �������� : �����ٶ�...��
					// ȫ�浿, �̼���, ������	=> ������, �̼���, ȫ�浿
	
	int age;		// ����
	
	public Abc(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "�̸�: " + name + " ����: " + age;
	}
	
}

class Abc_T implements Comparable<Abc_T> {
	String name;
	int age;
	
	public Abc_T(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "�̸�: " + name + " ����: " + age;
	}

	@Override
	public int compareTo(Abc_T o) {
		if (this.name.equals(o.name)) {
			return 0;
		} else if (this.name.compareTo(o.name) < 0){
			return -1;
		} else {
			return 1;
		}
	}

}



public class Ex_TreeSetMethod03 {

	public static void main(String[] args) {
		TreeSet<Abc_T> treeSet1 = new TreeSet<Abc_T>();
		Abc_T abc1 = new Abc_T("�̼���", 50);
		Abc_T abc2 = new Abc_T("������", 53);
		Abc_T abc3 = new Abc_T("ȫ�浿", 37);
		
		treeSet1.add(abc1);
		treeSet1.add(abc2);
		treeSet1.add(abc3);
		
		System.out.println(treeSet1);
		
		TreeSet<Abc> treeSet2 = new TreeSet<Abc>(new Comparator<Abc>() {
			@Override
			public int compare(Abc o1, Abc o2) {
				if (o1.equals(o2)) {
					return 0;
				} else if (o1.name.compareTo(o2.name) < 0) {
					return -1;
				} else {
					return 1;
				}
			}
		});
		Abc abc4 = new Abc("�̼���", 50);
		Abc abc5 = new Abc("������", 53);
		Abc abc6 = new Abc("ȫ�浿", 37);
		
		treeSet2.add(abc4);
		treeSet2.add(abc5);
		treeSet2.add(abc6);
		
		System.out.println(treeSet2);
	}

}
