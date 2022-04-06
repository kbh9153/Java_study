package chap17.Ex12;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * Map<K, V> ���� => K�� �ߺ��� �� ����
 * 	1. HashMap : �����ϰ� ����µ�. method�� ����ȭ�� �ȵ�. �̱۽����� ȯ�濡 ����
 * 	2. HashTable : ��� method�� ����ȭ�Ǿ� ����. ��Ƽ������ ȯ�濡 ����
 * 	3. LinkedHashMap : �Է� ������� ���
 * 	4. TreeMap : �������� ���ĵǾ� �Է� �� ���. Comparable<E>, Comparator<E> ������ �ʿ�
 */

public class MapSummary {

	public static void main(String[] args) {
		// 1. HashMap : �Է� ������ ��� ������ �ٸ�
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		
		hashMap.put("��", 30);
		hashMap.put("��", 40);
		hashMap.put("��", 50);
		hashMap.put("��", 60);
		
		System.out.println(hashMap);
		
		// 2. HashTable : �Է¼����� ��¼����� �ٸ� <����ȭ �Ǿ�����><��Ƽ������ ȯ�濡 ����>
		Map<String, Integer> hashTable = new Hashtable<String, Integer>();
		
		hashTable.put("��", 30);
		hashTable.put("��", 40);
		hashTable.put("��", 50);
		hashTable.put("��", 60);
		
		System.out.println(hashTable);
		
		// 3. LinkedHashMap : �Է¼����� ��¼����� ����
		Map<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
		
		linkedHashMap.put("��", 30);
		linkedHashMap.put("��", 40);
		linkedHashMap.put("��", 50);
		linkedHashMap.put("��", 60);
		
		System.out.println(linkedHashMap);
		
		// 4. TreeMap : ������������ ���ĵǾ� ����(Map<K, V> : Key�� �������� �������� ����)
		TreeMap<String, Integer> TreeMap = new TreeMap<String, Integer>();
		
		TreeMap.put("��", 30);
		TreeMap.put("��", 40);
		TreeMap.put("��", 50);
		TreeMap.put("��", 60);
		
		System.out.println(TreeMap);
	}

}
