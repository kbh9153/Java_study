package chap16.Ex06.Ex01;

// GenericPrinter에 사용될 객체[재료]

public class Plastic extends Merterial {
	public void doPrinting() {
		System.out.println("플라스틱 재료로 출력합니다.");
	}
	
	@Override
	public String toString() {
		return "재료는 플라스틱 입니다.";
	}
}
