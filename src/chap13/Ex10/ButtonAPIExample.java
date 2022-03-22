package chap13.Ex10;

class Button {
	OnClickListener ocl;		// OnClickListener : 객체타입, ocl : 참조 변수
	
	
	// setter를 통해서 OnClickListener의 참조 변수 ocl에 객체 주소를 담음
	void setOnClickListener(OnClickListener ocl) {		
		this.ocl = ocl;		// ocl 기본 값 null
	}
	
	// interface만 존재하고 구현한 자식 class가 존재하지 않음
	// 호출하는 곳에서 onClick() method를 재정의해서 호출
	interface OnClickListener {		// InnerInterface, static, button, onClickListener
									// method 선언만 되어있는 상태. 하위에서 Overriding해서 재정의
		void onClick();		// ocl : 참조변수 : null => setOnClickListener	
	}
	
	void click() {		// 실행했을 때 ocl에 onCLick()를 호출
		ocl.onClick();
		// System.out.println(ocl);
	}
}

public class ButtonAPIExample {

	public static void main(String[] args) {
		// 개발자 1 : 클릭시 음악재생
		Button btn1 = new Button();		// botton 객체 생성
		
		// A.B ab = new A.B() {innerinterface B의 method를 구현한 코드}
		
		btn1.setOnClickListener(new Button.OnClickListener() {		// OnClickListener 객체타입으로 객체 생성하여 매개변수로 전달
			@Override
			public void onClick() {
				System.out.println("개발자 1. 음악 재생");
			}
		}
	); 		
		btn1.click();
		
		System.out.println("----------------");
		
		// 개발자 2 : 클릭시 네이버 접속
		Button btn2 = new Button();
		
		// setOnClickListener method에 매개변수로 OnClickListener의 하위 익명객체를 생성 후 OnClickListener
		btn2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("개발자 2. 네이버 접속");
			}
		}
	);
		
		btn2.click();
	}

}
