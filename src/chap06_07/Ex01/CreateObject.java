package chap06_07.Ex01;

class AA {		// ��� : �ʵ�, �޼ҵ� => AA Ŭ������ �����
	String name;		// �ʵ�(���) : ��üȭ(=�ν��Ͻ�ȭ)�� �Ǿ�� ��� ���� => �ʵ�� heap �޸𸮿� ����
	int age;
	String email;
	
	public String getName() {		// �޼ҵ�(���) : ��üȭ �ʼ�
		return name;				// �޼ҵ� : heap ������ �ּҸ� ����, �������� ���� Ŭ���� �޸� �������� �޼ҵ� ������ ����
									// return : method�� ȣ���ϴ� ��. ������ ���� ������ 
	}
	public void setName(String name) {
		this.name = name;		// this.name : String name(�ʵ�)�� ����Ŵ
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}

public class CreateObject {

	public static void main(String[] args) {
		AA aa = new AA();		// AA class aa(��ü) ���� => ��üȭ
		
		// ��ü�� method ȣ��		
		System.out.println(aa.getName());
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());

		System.out.println("============================");
		
		// ��ü�� �ʵ� ȣ��
		System.out.println(aa.name);
		System.out.println(aa.age);
		System.out.println(aa.email);
		
		System.out.println("============================");
		
		// method ȣ��
		// setters : ��ü�� �޸𸮿� ���� �Ҵ��� ��
		aa.setName("ȫ�浿");		// ��ü�� ������ ���� �Ҵ�
		aa.setAge(30);
		aa.setEmail("abc@gmail.com");
		
		// getters : ��ü�� �޸��� ���� ������ �� ��
		System.out.println(aa.getName());
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		
		System.out.println("===========================");
		
		AA bb = new AA();
		bb.setName("������");
		bb.setAge(50);
		bb.setEmail("bb@gmail.com");
		
		System.out.println(bb.getName());
		System.out.println(bb.getAge());
		System.out.println(bb.getEmail());
		System.out.println("===========================");
		
		AA cc = new AA();
		cc.setName("�Ż��Ӵ�");
		cc.setAge(40);
		cc.setEmail("jentleman@gmail.com");
		
		System.out.println(cc.getName());
		System.out.println(cc.getAge());
		System.out.println(cc.getEmail());
	}

}
