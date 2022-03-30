package chap16.Ex13;

// 두 점의 좌표 값을 사용해서 넓이를 구하는 프로그램을 작성하세요. Generic Class / Generic method를 사용

class Point<T, V> {
	T x;		// 한 점의 x 좌표
	V y;		// 한 점의 y 좌표
	
	Point(T x, V y) { 	// 생성자. Setter 대신 생성자를 통해 좌표값 할당
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public V getY() {
		return y;
	}

}

class GenericMethod {
	public static<T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
	// 코드 작성
	double width = (double)p2.getX() - (double)p1.getX();
	double height = (double)p2.getY() - (double)p1.getY();
		
	return width * height;		//  가로 * 세로 = 넓이값을 반환
	}
}

public class Ex_MakeRectangle {
	public static void main(String[] args) {
		Point<Double, Double>p1 = new Point<Double, Double>(1.0, 2.0);
		Point<Double, Double>p2 = new Point<Double, Double>(10.0, 50.0);
		
		double rect = GenericMethod.<Double, Double>makeRectangle(p1, p2);
		System.out.println("두 점의 넓이는 : " + rect + " cm^2입니다.");
	}
}
