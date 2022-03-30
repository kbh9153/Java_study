package chap16.Ex03;

/*
 * Object : ��� ��ü�� ������ �� ������ �ٿ�ĳ������ �ʿ���. ĳ���ý� ���ܰ� �߻��� �� ����(���� Ÿ�� üũ)
 * Generic class : �ϳ��� class���� �پ��� ������ Ÿ���� ó�� ����
 * 	- Generic Type Variable : T (Ÿ��), K (Key), V (Value), N (Number), E (Element)
 * 		1) A ~ Z ���Ƿ� ���� �� ����
 * 		2) wrapper class : �⺻ Ÿ���� ��üȭ ���� ���� class
 * 			�� int(�⺻Ÿ��) -> Integer(��ü�� Ÿ��), boolean -> Boolean, Char -> Character, double -> Double, float -> Float
 * 			�� byte -> Byte, short -> Short, long -> Long
 * 			�� Ư�� Ÿ���� ������� ���� ��� Void ���
 */
	

// Generic class
class MyClass<T> {
	private T t;
	
	public T get() {		// getter. �ʵ��� ���� ��������
		return t;
	}
	
	public void set(T t) {		// setter. �ʵ尪�� �Ҵ�
		this.t = t;
	}
}

public class SingleGenericArgument {

	public static void main(String[] args) {
		// 1. Generic class ��ü ���� <String>�� �Է�
		MyClass<String> mc1 = new MyClass<String>();
		mc1.set("�ȳ�");
		System.out.println(mc1.get());
		
		// 2. Generic class ��ü ���� <Integer>�� �Է�
		MyClass<Integer> mc2 = new MyClass<Integer>();		// <Integer> : wrapper class
		mc2.set(37);
		System.out.println(mc2.get());
		
		// 3. Generic class ��ü ���� <Double> �Է�
		MyClass<Double> mc3 = new MyClass();		// �������� �ڷ����� ���� ����
		mc3.set(73.4);
		System.out.println(mc3.get());
		
		// 4. ���� Ÿ�� üũ (������ �ܰ迡�� ������ ��� ����)
		MyClass<Boolean> mc4 = new MyClass<Boolean>();
		mc4.set(true);
		mc4.set(false);
		// mc4.set("�ȳ�");		// ���� Ÿ�� üũ, ����ÿ� ������ ���� ������
	}

}
