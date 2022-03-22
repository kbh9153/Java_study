package chap13.Ex10.Ex02;

class abc {		/*
 				 * 1. 객체 생성 후 객체에 필드에 직접 값을 할당 (d1)
 				 * 2. 생성자를 통해서 값 할당 (d2)
 				 * 3. setter를 통해서 값 할당 (d3)
				 */
	Def d;
	
	abc() {};
	
	abc(Def d) {
		this.d = d;
	}
	
	public void setD(Def d) {
		this.d = d;
	}

	interface Def {
		void run();
		void fly();
	}
	
	void ghi() {
		d.run();
		d.fly();
	}
}

public class InnerInterface01_02 {

	public static void main(String[] args) {
		abc d1 = new abc();
		d1.d = (abc.Def) new abc.Def() {
			@Override
			public void run() {
				System.out.println("달립니다");
			}
			
			@Override
			public void fly() {
				System.out.println("날고 있습니다");
			}
		};
		d1.ghi();
		
		System.out.println("------------");
	
		abc d2 = new abc(new abc.Def() {
			@Override
			public void run() {
				System.out.println("달립니다");
			}
			
			@Override
			public void fly() {
				System.out.println("날고 있습니다");
			}
		}
		);
		d2.ghi();
		
		System.out.println("------------");
		
		abc d3 = new abc();
		d3.setD(new abc.Def() {
			
			@Override
			public void run() {
				System.out.println("달립니다");
			}
			
			@Override
			public void fly() {
				System.out.println("날고 있습니다");
			}
		}
		);
		d3.ghi();
	}

}
