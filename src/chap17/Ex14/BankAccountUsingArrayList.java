package chap17.Ex14;

import java.util.ArrayList;
import java.util.Scanner;

class Account {		// 계좌정보를 저장하는 객체. 중요한 필드, private(캡슐화), 객체명 필드접근(X), 생성자, getter, setter  // DTO, VO => 각 계층으로 필드의 값을 저장하고 전달
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
}

public class BankAccountUsingArrayList {
	// Collection(ArrayList<E>)을 사용해서 Account 객체 등록
	// Collection의 방의 값을 넣을 경우 add() method 사용(제일 마지막 방에 값을 추가). Collection(ArrayList<E>) 방의 개수 : size()
	// 각 방의 값을 삭제할 떄는 remove() 사용
	// 배열은 방의 크기를 고정, 선언시 방의 크기를 지정, 방의 크기 수정 불가능
	// Collection은 방의 크기가 동적, 무한정 저장 가능
	// ArrayList는 null 값이 없음
	private static ArrayList<Account> accountArrayList = new ArrayList<Account>();		// Collection(ArrayList<E>)에 객체 저장
	private static Scanner scanner = new Scanner(System.in);
	
	private static void createAccount() {
		// 코드 작성 : 1. 계좌 생성 : 스캐너로 1. 계좌번호, 2. 이름, 3. 초기통장 금액
		// Collection(ArrayList<E>) 객체에 저장
		System.out.println("등록하실 계좌번호를 입력하세요.");
		String ano = scanner.next();	// method 내에서만 사용하는 지역 변수
		
		System.out.println("등록하실 예금주명을 입력하세요.");
		String owner = scanner.next();
		
		System.out.println("입금하실 금액을 입력하세요.");
		int balance = scanner.nextInt();
		
		// 각 필드의 정보를 사용자로부터 할당 받아서 객체를 생성 후 객체에 필드의 값을 저장
		// Account newAccount = new Account(ano, owner, balance);
		
		// Collection(ArrayList<E>) 선언은 method 외부에서 선언 => 전역변수임(모든 method에서 사용 가능)
		// 객체를 Collection(ArrayList<E>)에 저장(비어있는 방에 저장)
		
		Account createAccount = new Account(ano, owner, balance);
		accountArrayList.add(createAccount);
		
		
		System.out.println("계좌 생성 완료\n");
	}
	
	private static void accountList() {
		// 코드 작성 : 2. 계좌 목록 출력 : Collection(ArrayList<E>)에 저장된 객체를 가져와서 계좌번호, 예금주, 현재 금액을 출력
		// Collection(ArrayList<E>)의 각 방을 순회하면서 null이 아닌 경우 Collection(ArrayList<E>)에서 객체를 꺼내어 필드의 정보를 출력
		
		Object[] object = accountArrayList.toArray();
		for (int i = 0; i < object.length; i++) {
			System.out.println(object[i]);
		}
		
		//배열의 각방의 null아닌 경우 , 객체의 필드의 값을 출력. 
		for ( int i = 0 ; i <  accountArrayList.size(); i++) {
			//각 방의 객체를 담는 변수를 선언 
			Account account = accountArrayList.get(i);    // 0 ~ 99 방의 객체를 account 참조 변수에 담는다. 
			if (account != null) {    //각 방의 값이 null이 아닐 경우만 객체정보를 가져와서 출력. 
				System.out.print(account.getAno());  //계좌 정보. 
				System.out.print("    ");
				System.out.print(account.getOwner());   //이름
				System.out.print("    ");
				System.out.print(account.getBalance());  //금액
				System.out.println();   //라인 개행. 
			}
		}	
		
	}
	
	private static void deposit() {
		// 코드 작성 : 3. 예금 <== 계좌번호를 받아서 객체에서 해당 계좌번호를 찾고 입금금액을 인풋받아서 저장
		// 1. 사용자로부터 입금할 계좌를 받아야함
		// 2. 사용자로 받은 계좌 번호를 Collection(ArrayList<E>)에 저장된 객체 내의 계좌번호를 확인 후 해당 계좌에 입금해야여야함
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
			
			System.out.println(outputMoney + "원이 출금되었습니다.\n" + findAccount(ano).getOwner() + " 고객님의 출금 후 잔액은 " + findAccount(ano).getBalance() + "원입니다.\n");
		}
		
	}
	
	// Collection(ArrayList<E>)에서 Account 객체 내의 ano[계좌번호]와 동일한 계좌를 찾은 후 찾은 객체를 return으로 돌려줌
	// 예금, 출금할 때 공통코드 => 여러 method에서 중복 사용될 때 별도의 method를 생성해서 중복코드를 작성할 필요가 없음
	private static Account findAccount(String ano) {
		Account account = null;		// 매개변수로 입력된 값과 동일한 값이 있으면 Account class로 return account, 없으면 null 반환
		// 코드 작성
		for (int i = 0; i < accountArrayList.size(); i++) {
			if (accountArrayList.get(i) == null) {
				break;
			} else if (accountArrayList.get(i).getAno().equals(ano)) {
//				return accountArrayList.get(i);
				account = accountArrayList.get(i);		// account 참조변수는 객체의 주소정보를 담음
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
				createAccount();	// method 호출. 객체 생성없이 method명으로 호출(static)
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
