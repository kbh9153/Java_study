package chap13.Ex10.Ex02;

class abc {		/*
 				 * 1. ��ü ���� �� ��ü�� �ʵ忡 ���� ���� �Ҵ� (d1)
 				 * 2. �����ڸ� ���ؼ� �� �Ҵ� (d2)
 				 * 3. setter�� ���ؼ� �� �Ҵ� (d3)
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
				System.out.println("�޸��ϴ�");
			}
			
			@Override
			public void fly() {
				System.out.println("���� �ֽ��ϴ�");
			}
		};
		d1.ghi();
		
		System.out.println("------------");
	
		abc d2 = new abc(new abc.Def() {
			@Override
			public void run() {
				System.out.println("�޸��ϴ�");
			}
			
			@Override
			public void fly() {
				System.out.println("���� �ֽ��ϴ�");
			}
		}
		);
		d2.ghi();
		
		System.out.println("------------");
		
		abc d3 = new abc();
		d3.setD(new abc.Def() {
			
			@Override
			public void run() {
				System.out.println("�޸��ϴ�");
			}
			
			@Override
			public void fly() {
				System.out.println("���� �ֽ��ϴ�");
			}
		}
		);
		d3.ghi();
	}

}
