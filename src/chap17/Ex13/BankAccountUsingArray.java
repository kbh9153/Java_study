package chap17.Ex13;

import java.util.Arrays;
import java.util.Scanner;

class Account {
	private String ano;		// 계좌번호
	private String owner;		// 예금주 이름
	private int balance;		// 통장 금액
	
	public Account(String ano, String owner, int balance) {
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
	
}

public class BankAccountUsingArray {
	// 배열을 사용해서 Account 객체 등록
	private static Account[] accountArray = new Account[100];		// 배열에 객체 저장
	private static Scanner scanner = new Scanner(System.in);
	
	private static void createAccount() {
		// 코드 작성 : 1. 계좌 생성 : 스캐너로 1. 계좌번호, 2. 이름, 3. 초기통장 금액
		// 배열 객체에 저장
		System.out.println("등록하실 계좌번호를 입력하세요.");
		String ano = scanner.next();
		
		System.out.println("등록하실 예금주명을 입력하세요.");
		String owner = scanner.next();
		
		System.out.println("입금하실 금액을 입력하세요.");
		int balance = scanner.nextInt();
		
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, balance);
	            System.out.println("계좌 생성 완료\n");
	            break;
	         }
		}
	}
	
	private static void accountList() {
		// 코드 작성 : 2. 계좌 목록 출력 : 배열에 저장된 객체를 가져와서 계좌번호, 예금주, 현재 금액을 출력
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				break;
			} else {
				System.out.println("계좌번호: " + accountArray[i].getAno() + "\n예금주: " + accountArray[i].getOwner() + "\n현재 잔고: " + accountArray[i].getBalance() + "\n");
			}
		}
	}
	
	private static void deposit() {
		// 코드 작성 : 3. 예금 <== 계좌번호를 받아서 객체에서 해당 계좌번호를 찾고 입금금액을 인풋받아서 저장
		System.out.println("예금하실 계좌번호를 입력해주세요.");
		String ano = scanner.next();
		
		if (findAccount(ano) == null)  {
			System.out.println("조회하신 계좌번호는 존재하지 않습니다. 다시 이용 부탁드립니다.\n");
		} else {
			System.out.println("입금하실 금액을 입력해주세요.");
			int inputMoney = scanner.nextInt();
			
			findAccount(ano).setBalance(findAccount(ano).getBalance() + inputMoney);
			
			System.out.println(inputMoney + "원 입금이 완료되었습니다.\n" + findAccount(ano).getOwner() + " 고객님의 입금 후 잔액은 " + findAccount(ano).getBalance() + "원입니다.\n");
		}
	}
	
	private static void withdraw() {
		// 코드 작성 : 4. 출금 <== 계좌 번호를 인풋 받아 해당 계좌를 객체에서 찾아서 출금
		System.out.println("출금하실 계좌번호를 입력해주세요.");
		String ano = scanner.next();
		
		if (findAccount(ano) == null) {
			System.out.println("조회하신 계좌번호는 존재하지 않습니다. 다시 이용 부탁드립니다.\n");
		} else {
			System.out.println("출금하실 금액을 입력해주세요");
			int outputMoney = scanner.nextInt();
			
			findAccount(ano).setBalance(findAccount(ano).getBalance() - outputMoney);
			
			System.out.println(outputMoney + "원이 출금되었습니다. " + findAccount(ano).getOwner() + " 고객님의 출금 후 잔액은 " + findAccount(ano).getBalance() + "원입니다.\n");
		}
	}
	
	// 배열에서 Account 객체 내의 ano[계좌번호]와 동일한 계좌를 찾은 후 찾은 객체를 return으로 돌려줌
	private static Account findAccount(String ano) {
		Account account = null;
		// 코드 작성
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				break;
			} else if (accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		
		return account;
	}
	
	public static void main(String[] args) {
		boolean run = true;
		
		while (run) {
			System.out.println("원하시는 서비스 번호를 입력하세요.");
			System.out.println("--------------------------------------------------");
			System.out.println("| 1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료 |");
			System.out.println("--------------------------------------------------");
			System.out.println("선택 >>");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				createAccount();	// method 호출
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
				// break;
			}
		}
		scanner.close();
		System.out.println("프로그램 종료");
	}
}
