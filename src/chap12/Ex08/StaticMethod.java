package chap12.Ex08;

// 정적 method : Java 1.8 이상부터 신규 추가 기능
// Interface 내부에 static이 들어간 method : 하위 class에서 구현없이 호출 가능

/* Interface 내부 구성 요소 ([] 안의 키워드들은 생략 가능)
 * 	1. 필드 : [public, static, final]
 * 	2. method
 * 	 - [public abstract(추상 method)] : 구현부가 없는 method => 생략 가능
 *   - [public] default : 구현부가 있는 method => Java 1.8 이상에서 사용 가능
 *   - [public] static : 구현부가 있고 객채 생성없이 호출이 가능한 method => Java 1.8 이상에서 사용 가능
 */

interface A {
	static void abc() {
		System.out.println("A Interface의 정적 method abc()");
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		// 1. 정적(static) method 호출
		A.abc();		// implements 없이 Interface 이름으로 바로 호출 가능 
	}

}
