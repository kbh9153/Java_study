package chap17.Ex12;

import java.util.Comparator;
import java.util.TreeMap;

/*
 * TreeMap<K, V> : Key�� ���ĵǾ ó�� <�������� ����>
 * 	- Key : �Ϲ� ��ü�� ����� ���, Comparable compareTo(), Comparator<E> compare() ������ �ʿ�
 */

// �Ϲ� class
class MyClass {
	int data1;
	int data2;
	
	public MyClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	@Override
	public String toString() {
		return data1 + ", " + data2;
	}
}

// Comparable<E> interface�� compareTo() method ������
class MyCompareableClass implements Comparable<MyCompareableClass> {
	int data1;
	int data2;
	
	public MyCompareableClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	@Override
	public String toString() {
		return data1 + ", " + data2;
	}
	
	@Override
	public int compareTo(MyCompareableClass o) {
		if (this.data1 < o.data1) {
			return -1;
		} else if (this.data1 == o.data1) {
			return 0;
		} else {
			return 1;
		}
		
	}
}

public class TreeMapMethod02 {
	public static void main(String[] args) {
		// 1. MyClass�� TreeMap�� Key�� ��ǲ�� ��� : ����� ����
		/*
		TreeMap<MyClass, String> treeMap1 = new TreeMap<MyClass, String>();
		MyClass m1 = new MyClass(2, 5);
		MyClass m2 = new MyClass(3, 3);
		
		treeMap1.put(m1, "ù��°");		// Comparable, Comparator �������� �ʾҴµ�, TreeMap�� Key�� ���
		treeMap1.put(m2, "�ι�°");
		*/
		
		// 2. Comparable�� ������ class�� ��� => ��ü ����
		TreeMap<MyCompareableClass, String> treeMap2 = new TreeMap<MyCompareableClass, String>();
		MyCompareableClass mc1 = new MyCompareableClass(2, 5);
		MyCompareableClass mc2 = new MyCompareableClass(10, 5);
		MyCompareableClass mc3 = new MyCompareableClass(3, 3);
		
		treeMap2.put(mc1, "ù��°");
		treeMap2.put(mc2, "�ι�°");
		treeMap2.put(mc3, "����°");
		
		System.out.println(treeMap2);
		System.out.println(treeMap2.size());
		
		System.out.println();
		
		// 3. Comparator<E>�� ���� : ������ ��ü�� ���. ��ü ������ ���ʿ�
		TreeMap<MyClass, String> treeMap3 = new TreeMap<MyClass, String>(new Comparator<MyClass>() {
			@Override
			public int compare(MyClass o1, MyClass o2) {
				if (o1.data1 < o2.data1) {
					return -1;
				} else if (o1.data1 == o2.data1) {
					return 0;
				} else {
					return 1;
				}
				
			}
		});
		
		MyClass my1 = new MyClass(2, 5);
		MyClass my2 = new MyClass(10, 5);
		MyClass my3 = new MyClass(3, 3);
		
		treeMap3.put(my1, "ù��°");
		treeMap3.put(my2, "�ι�°");
		treeMap3.put(my3, "����°");
		
		System.out.println(treeMap3);
		System.out.println(treeMap3.size());
	}
}
