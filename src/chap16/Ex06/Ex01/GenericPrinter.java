package chap16.Ex06.Ex01;

public class GenericPrinter<T extends Merterial> {
	// T : Ÿ�� ����, Merterial ���� Ŭ������ T Ÿ�Կ� ���� �� ����
	private T material;		// material : ��������, ��ü, �ν��Ͻ�
	
	public T getMaterial() {	// ��ü�� ����
		return material;
	}
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();		// �ش� ��ü�� toString() method ȣ��
	}
	
//	public void printin() {		// method�� ����
//		material.doPrinting();
//	}
	
	

}
