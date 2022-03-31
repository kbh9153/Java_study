package chap17.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// java.lang package�� class���� import�� �ʿ����� ����

/*
 * �÷��� : ������ �ڷ����� ����. ���� ũ�Ⱑ �������� ��ȭ��
 * �迭 : ������ �ڷ����� ����. ���� ũ�Ⱑ �����Ǿ����� => �迭 ������ ���� ũ�⸦ ����. ���� ũ��� ���� �Ұ�
 * 
 * List<E> : Interface, Generic Interface => �پ��� ������ Ÿ���� ��� ����
 * 	- Index(�� ��ȣ)�� ������ ����. ���� ũ��� �������� ��ȭ��
 * 
 * 	<< List<E>�� class ���� >>
 * 	1. ArrayList<E> : �̱� ������ ȯ�濡�� ���. �˻��� ������ ���� �߰��ϰų� ������ �� ����
 * 	2. Vector<E> : ��Ƽ ������ ȯ�濡�� ���. ��� �޼ҵ尡 ����ȭ �Ǿ��ִ�
 * 	3. LinkedList<E> : �˻��� ������ ���� �߰��ϰų� ������ �� ����
 */

public class ArrayList01 {

	public static void main(String[] args) {
		// 1. �迭
		String[] array = new String[] {"��", "��", "��", "��", "��", "��", "��"};
		System.out.println(array.length);		// �迭 ���� ũ��
		array[2] = null;
		array[4] = null;
		System.out.println(array.length);
		
		// 1. Arrays.toString(�迭����)
		System.out.println(Arrays.toString(array));		// Arrays.toString(�迭������)
		
		// 2. for���� ����ؼ� ���
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.println(array[i]);
			} else {
				System.out.print(array[i] + ", ");
			}
		}
		
		// 3. Enhanced For ���� ����ؼ� ���
		for (String k : array) {
			System.out.print(k + " ");
		}
		
		System.out.println();
		
		// 1. List : Interface, ��ü ������ �� �� ����. Ÿ���� ���� ����
		List<String> aList = new ArrayList<String>();
		List<String> aList2 = new ArrayList<>();
		List<String> aList3 = new ArrayList();
		
		// List���� ���� ���� ��� : aList.size(); => �迭�� length()
		System.out.println(aList.size());
		
		// List���� �� �Ҵ��ϱ� : aList.add("�� �Ҵ�") => ���� �������� ���� �߰���
		aList.add("��");
		aList.add("��");
		aList.add("��");
		aList.add("��");
		aList.add("��");
		aList.add("��");
		aList.add("��");
		
		System.out.println(aList);
		System.out.println(aList.size());
		
		// List���� �� �����ϱ� : aList.remove("������ ����")
		aList.remove("��");
		aList.remove("��");
		
		System.out.println(aList);
		System.out.println(aList.size());
		
		// List�� index�� ������ ����
		for (int i = 0; i < aList.size(); i++) {
			System.out.print(aList.get(i) + ", ");
		}
		
		System.out.println();
		
		// 2. Enhanced For ���� ����ؼ� ���
		for (String k : aList) {
			System.out.print(k + " ");
		}
		
		System.out.println();
		
		// 3. ��ü�� toString()�� ȣ���ؼ� ���
		System.out.println(aList);		// List�� toString method�� ������ �Ǿ�����
	}

}
