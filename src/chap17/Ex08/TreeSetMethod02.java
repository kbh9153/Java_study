package chap17.Ex08;

import java.util.TreeSet;

/*
 * TreeSet�� ����
 * 	1. ���� �ߺ� ������� ����
 * 	2. �������� ���ĵǾ� �Է�
 * 	3. �������� ���ĵǾ� ���
 * 	4. �˻���� ��� ����
 * 	5. Ư�� ������ ���� ����
 * 	6. asc(�������� ����), desc(�������� ����)
 * 
 * TreeSet�� �Ϲ� ��ü�� ������ ���, Ư�� �ʵ带 ũ�� �� ���� �ʵ尡 �����ؾ���
 * 	1. Comparable<E> interface�� compareTo() method : TreeSet�� �Ϲ� ��ü�� ������ �� �Ϲ� ��ü�� Ư�� �ʵ带 Comparable�� ������ �ؾ���
 * 	2. Comparable<E> interface�� compareTo() method ��������
 * 	3. �͸� ���� ��ü�� ����ؼ� ó���ϴ� ��� 
 */

class MyClass {		// CompareTo() �����ǵ��� �ʾ� TreeSet�� ��� �Ұ�
	int data1;
	int data2;
	
	public MyClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
}

// Comparable<E> interface�� ������ class ����
class MyComparableClass implements Comparable<MyComparableClass> {		// 
	int data1;		// �� �ʵ带 �� �������� ����. compareTo() ������
	int data2;
	
	public MyComparableClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	@Override
	public int compareTo(MyComparableClass o) {		// compareTo ������. ��ü�� ũ�� �� ������ �����ϴ� method => TreeSet���� ��� (����, 0, ���)
													// �������� ó�� ���
		if (this.data1 < o.data1) {		// this.data1 ���� ���� ���� ��� : -1 (����)
			return -1;
		} else if (this.data1 == o.data1) {		// this.data1 ���� ���� ���� ��� : -1 (����)
			return 0;
		} else {		// this.data1 ���� ���� ���� ��� : +1 (���)
			return 1;
		}
		
	}
	
	@Override
	public String toString() {
		return data1 + " " + data2;
	}
	
}

public class TreeSetMethod02 {

	public static void main(String[] args) {
		// wrapper class�� comparable<E>�� interface�� compareTO() method�� �̹� �����ǵǾ� ����
			// => wrapper class�� ���� TreeSet�� ������ ���ĵǾ ����
		
		// 1. Integer wrapper class�� ũ�� ��
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>();		// TreeSet�� �� Ÿ���� TreeSet���� �����ؾ���. Set�� �ȵ�
		Integer intValue1 = new Integer(20);		// ū��
		Integer intValue2 = new Integer(10);		// ������
		
		treeSet1.add(intValue1);
		treeSet1.add(intValue2);
		
		System.out.println(treeSet1);		// �������� ���ĵǾ� ���
		System.out.println(treeSet1.descendingSet());		// �������� ���ĵǾ� ���
		
		// 2. String wrapper class�� ũ�� ��
		TreeSet<String> treeSet2 = new TreeSet<String>();
		String str1 = new String("����");		// ������
		String str2 = new String("�ٶ�");		// ū��
		
		treeSet2.add(str1);		// treeSet2.add()�� ����ؼ� ��ü�� ������ ��� ���� ũ�⸦ ���ϴ� �ʵ尡 ���ǵǾ� �־�� ��
		treeSet2.add(str2);		// Comparable<E> interface�� compareTo() method�� ������ �Ǿ����
		System.out.println(treeSet2);
		System.out.println(treeSet2.descendingSet());
		
		// 3. MyClass�� TreeSet�� ������ �ɱ�? => Compareable<E> interface�� compareTo() method�� ������ �Ǿ�� TreeSet collection�� ���� ����
		/*
		 * TreeSet<MyClass> treeSet3 = new TreeSet<MyClass>(); MyClass myClass1 = new
		 * MyClass(2, 5); MyClass myClass2 = new MyClass(3, 3);
		 * 
		 * treeSet3.add(myClass1); // TreeSet���� comparable<E> interface�� compareTo()
		 * method�� �������� class�� ���� �� ���� treeSet3.add(myClass2); // ����� Runtime ���� �߻�
		 * System.out.println(treeSet3);
		 */
		
		// 4. MyComparableClass ��ü ũ�� ��
		TreeSet<MyComparableClass> treeSet4 = new TreeSet<MyComparableClass>();
		MyComparableClass mcc1 = new MyComparableClass(2, 5);
		MyComparableClass mcc2 = new MyComparableClass(5, 3);
		MyComparableClass mcc3 = new MyComparableClass(4, 3);
		
		treeSet4.add(mcc1);
		treeSet4.add(mcc2);
		treeSet4.add(mcc3);
		
		System.out.println(treeSet4);
		
		
		
	}

}
