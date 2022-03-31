package chap17.Ex02;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/*
 * Vector : ArrayList�� ��� method�� �����ϰ� ��� ����
 * 	- ������ : Vector�� ��� method�� ����ȭ ó���Ǿ� ���� => ��Ƽ������ ȯ�濡 ���ǵ��� �Ǿ�����
 * 
 * �̱� ������ ȯ�� : ArrayList
 * ��Ƽ ������ ȯ�� : Vector
 */

public class VectorMethod01 {

	public static void main(String[] args) {
		List<Integer> vector1 = new Vector<Integer>();
		
		// 1. add(E element) : ������ index ���Ŀ� �� �߰��ϱ�
		vector1.add(3);
		vector1.add(6);
		vector1.add(9);
		
		System.out.println(vector1);		// �����
		System.out.println(vector1.size());		// ���� ����
		
		System.out.println("---------------");
		
		// 2. add(int index, E element)
		vector1.add(1, 6);		// index ��ȣ 1���� 6�� �߰��ϰ� ���� ������ ���� index�� �з���
		System.out.println(vector1);
		
		System.out.println("---------------");

		// 3. addAll : �� �ٸ� list�� ��ü�� �����ؼ� �߰�
		List<Integer> vector2 = new Vector<Integer>();
		vector2.add(1);
		vector2.add(2);
		
		vector2.addAll(vector1);		// vector1�� ����� ���� �����ؼ� vector2�� �߰�
		
		System.out.println(vector2);		// ���� �ִ� ���� �������� ������ vector1 ���� �߰�
		
		System.out.println("---------------");
		
		// 4. addAll(int index, �� �ٸ� ��ü)
		List<Integer> vector3 = new Vector<Integer>();
		vector3.add(1);
		vector3.add(2);
		
		vector3.addAll(1, vector3);		// �ڽ��� ���� �ٸ� ��ü�� �߰�(������ ���� index ������ ������ ��ü�� ������ ���������� �߰�) 
		System.out.println(vector3);
		
		System.out.println("---------------");
		
		// 5. set(int Index, E element) : Ư�� �� ��ȣ�� ���� ����
		vector3.set(1, 5);
		vector3.set(3, 6);
		// vector3.set(4, 7);		// ���� �߻�, IndexOutOfBoundsException
		
		System.out.println(vector3);
		
		System.out.println("---------------");
		
		// 6. remove(int index) : Ư�� ���ȣ�� ���� ����
		vector3.remove(1);		// ���ȣ 1�� �濡 �ִ� ���� ����
		System.out.println(vector3);
		
		System.out.println("---------------");
		
		// 7. remove(Object o) : ���� ����
		vector3.remove(new Integer(6));		// ������ ������ �� ����. Integer�� ǥ�õ� ���� ����ǥ�ð� �ƴ϶� ���� �� ������ �����ǰų� ����� �� ������ �˸�
		System.out.println(vector3);
		
		System.out.println("---------------");
		
		// 8. clear() : ��� ����
		vector3.clear();
		System.out.println(vector3);
		
		System.out.println("---------------");
		
		// 9. isEmpty() : ���� ��� ������ True, ������� ������ False
		System.out.println(vector3.isEmpty());
		
		System.out.println("---------------");
		
		// 10. size() : ���� ����, ���� ����
		System.out.println(vector3.size());
		vector3.add(1);
		vector3.add(2);
		vector3.add(3);
		System.out.println(vector3);
		System.out.println(vector3.size());
		
		System.out.println("---------------");
		
		// 11. get(int index) : �� ��ȣ�� ���� ���
		System.out.println(vector3.get(0));
		System.out.println(vector3.get(1));
		System.out.println(vector3.get(2));
		
		System.out.println(vector3);		// List�� �� ��ü�� ����ϸ� ��ü�� ���� ���
		
		System.out.println("---------------");
		
		// 12. toArray() : List -> Array. List�� �迭�� ��ȯ
		Object[] object = vector3.toArray();		// �⺻������ toArray() method�� Object Ÿ������ return�� �� => �ٿ� ĳ������ �ʿ�
		System.out.println(Arrays.toString(object));		// �迭�� ��ȯ�� ����. �迭�� ���� Arrays.toString() ���
		
		System.out.println("---------------");
		
		// 13-1 toArray(T[] t) => t[] : Integer�� �ٷ� ĳ����
		Integer[] integer1 = vector3.toArray(new Integer[0]);	
		// (new Integerp[0] => [0] : ���� ũ��. * 0 -> ���� ���� ����(���� 3)���� ���� ũ�⸦ �۰� �����ϸ� ���� ���� ����(���� 3)��ŭ ���
		System.out.println(Arrays.toString(integer1));
		
		// 13-2 toArray(T[] t) => t[] : Integer�� �ٷ� ĳ����
		Integer[] integer2 = vector3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
		
	}

}
