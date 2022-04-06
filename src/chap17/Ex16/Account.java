package chap17.Ex16;

import java.util.Objects;

public class Account {
	private String ano;		// ���¹�ȣ
	private String owner;		// ������ �̸�
	private int balance;		// ���� �ݾ�
	
	public Account(String ano, String owner, int balance) {		// ��ü ������ �ʵ��� ���� �޾Ƽ� �ʵ忡 �ε�
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() {
		return ano;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "���¹�ȣ: " + ano + "\n������: " + owner + "\n���� �ܰ�: " + balance + "\n"; 
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Account) {
			if (this.ano == ((Account)obj).ano) {
				return true;
			}
		}
		System.out.println("������ ���¹�ȣ�� �����Ͽ� ������ �Ұ����մϴ�.\n");
		return false;
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(ano);
	}
}
