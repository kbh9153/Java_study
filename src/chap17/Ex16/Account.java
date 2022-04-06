package chap17.Ex16;

import java.util.Objects;

public class Account {
	private String ano;		// 계좌번호
	private String owner;		// 예금주 이름
	private int balance;		// 통장 금액
	
	public Account(String ano, String owner, int balance) {		// 객체 생성시 필드의 값을 받아서 필드에 로드
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
		return "계좌번호: " + ano + "\n예금주: " + owner + "\n현재 잔고: " + balance + "\n"; 
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Account) {
			if (this.ano == ((Account)obj).ano) {
				return true;
			}
		}
		System.out.println("동일한 계좌번호가 존재하여 개설이 불가능합니다.\n");
		return false;
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(ano);
	}
}
