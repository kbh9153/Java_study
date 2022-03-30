package chap16.Ex06.Ex01;

public class GenericPrinter<T extends Merterial> {
	// T : 타입 제한, Merterial 하위 클래스만 T 타입에 들어올 수 있음
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
