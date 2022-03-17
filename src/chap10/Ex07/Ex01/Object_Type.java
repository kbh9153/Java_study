package chap10.Ex07.Ex01;

class AA {
	int a = 3;
	int b = 4;
	
	@Override
	public String toString() {
		return "a : " + a + ", b : " + b;
	}
}

class BB {
	int a = 5;
	int b = 6;
	
	@Override
	public String toString() {
		return "a : " + a + ", b : " + b;
	}
}

class CC {
	int a = 7;
	int b = 8;
	
	@Override
	public String toString() {
		return "a : " + a + ", b : " + b;
	}
}

public class Object_Type {

	public static void main(String[] args) {
		// Java�� ��� ��ü�� Object type���� �� ��ȯ�� ����
		
		Object aa = new AA();
		Object bb = new BB();
		Object cc = new CC();
		
		// Object �迭�� ��ü ����
		
		Object[] arr = {aa, bb, cc};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());		// Object�� toString�� ȣ���� ��� overriding�� ���� �ڽ� ��ü�� toString�� ȣ���
		}
		
		System.out.println("----------------------------");
		
		for (Object k : arr) {
			System.out.println(k);		// ��ü�� ����� ��� toString()�� ���
		}

	}

}
