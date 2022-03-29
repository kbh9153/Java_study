package chap16.Ex04;

// Generic class : �Ű�����(Argument) : 2��

class KeyValue<K, V> {
	private K key;
	private V value;
	
	// getter, setter
	public K getKey() {
		return key;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
	
	public V getValue() {
		return value;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
	
	
}

public class TwoGenericArguments {

	public static void main(String[] args) {
		// KeyValue<String, Integer> kv1 = new KeyValue<String, Integer>();
		KeyValue<String, Integer> kv1 = new KeyValue();		// �����ڿ����� ���� ����
		
		kv1.setKey("���");
		kv1.setValue(1000);
		
		System.out.println(kv1.getKey());
		System.out.println(kv1.getValue());
		
		System.out.println("-------------------------------------");
		
		KeyValue<Integer, String> kv2 = new KeyValue();		// �����ڿ����� ���� ����
		
		kv2.setKey(403);
		kv2.setValue("Not Found (��û�� �������� ã�� �� �����ϴ�.)");
		
		System.out.println(kv2.getKey());
		System.out.println(kv2.getValue());

		System.out.println("-------------------------------------");
		
		KeyValue<String, Double> kv3 = new KeyValue();
		
		kv3.setKey("���밥");
		kv3.setValue(97.3);
		
		System.out.println(kv3.getKey());
		System.out.println(kv3.getValue());
		
		System.out.println("-------------------------------------");
		
		// Ư�� Ÿ���� ������� ���� ��� Void Ű�� ���
		KeyValue<String, Void> kv4 = new KeyValue();
		
		kv4.setKey("�������?");
		// kv4.setValue(137);		// Void�̱� ������ ��� �Ұ�
		
		System.out.println(kv4.getKey());
	}

}
