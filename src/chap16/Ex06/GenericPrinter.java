package chap16.Ex06;

public class GenericPrinter<T> {		// 다양한 재료로 프린팅하는 프린터 (파우더, 플라스틱, 물)
	private T material;		// material : 참조변수, 객체, 인스턴스
	
	public T getMaterial() {	// 객체를 전송
		return material;
	}
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();		// 해당 객체의 toString() method 호출
	}
	
//	public void printin() {		// method만 정의
//		material.doPrinting();
//	}
	
	

}
