package chap06_07.Ex05;

public class C {		// 다른 package에서 import 가능
	// 필드에 부여되는 접근 제어자
	
	private String company = "HYUNDAI";		// 회사명 =>  private로 인해 외부에서 변경 불가 
	String model;		// 모델 => 접근 제어자 : default
	protected String color;		// 색깔
	public int maxspeed;		// 최대 속력
	
	public void set(String model, String color) {
		this.model = model;
		this.color = color;
	}

//	public void setModel(String model) {		// public 외부 package의 class에서 접근 가능
//		this.model = model;
//	}
//
//	public void setColor(String color) {
//		this.color = color;
//	}

	public void print() {
		System.out.println("Company : " + company + "\n" + "Model : " + model + "\n" + "Color : " + color + "\n" + "Maxspeed : " + maxspeed);
	}
}
