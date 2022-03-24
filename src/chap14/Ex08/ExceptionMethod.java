package chap14.Ex08;

import javax.swing.SpinnerNumberModel;

/*
 * method�� throws�� ����, ����, ���� main ����
 * 	=> main method���� ���ܰ� ������ ��쿡�� ���� ���â�� ����ϰ� ���α׷� ����
 * 	=> main method�� ���� ó������ ����
 */

class AA {
	public void abc() throws NumberFormatException {
		bcd();
	}
	
	public void bcd() throws NumberFormatException {
		cde();
	}
	
	public void cde() throws NumberFormatException {
		int num = Integer.parseInt("10A");		// Exception(NumberFormatException) �߻�
	}
}

public class ExceptionMethod {

	public static void main(String[] args) throws NumberFormatException {
		// 1. ��ü ����
		AA aa = new AA();
		
		// 2. method ȣ��
		
		// aa.abc();
		
		try {
			aa.abc();		// ���� ���� (������ �ܰ迡���� ������ ����)
		} catch (NumberFormatException e) {
			System.out.println("���� �߻�\n<< Exception Info >>");
			e.printStackTrace();		// ������ �ڼ��� ������ ���
		}		
		
		System.out.println("���α׷� ����");
	}

}
