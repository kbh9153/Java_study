package chap17.Ex16;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

// Account 객체를 TreeSet에 저장. ano[계좌번호], owner[이름], balance[잔고]
// TreeSet에 일반 객체를 넣을 때 어떤 column을 정렬할지를 지정해줘야함. Comparable<E>, Comparator<E>
// Account 객체를 수정하지 않고 balance 값이 큰 것부터 출력되도록 구성 <내림차순>

public class BankAccountUsingTreeSet {
	private static TreeSet<Account> accountTreeSet = new TreeSet<Account>(new Comparator<Account>() {
		@Override
		public int compare(Account o1, Account o2) {
			if (o1.getBalance() < o2.getBalance()) {
				return 1;
			} else if (o1.getBalance() == o2.getBalance()) {
				return 0;
			} else {
				return -1;
			}
			
		}
	});
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static void createAccount() {
		// 코드 작성 : 1. 계좌 생성 : 스캐너로 1. 계좌번호, 2. 이름, 3. 초기통장 금액
		System.out.println("등록하실 계좌번호를 입력하세요.");
		String ano = scanner.next();	// method 내에서만 사용하는 지역 변수
		
		System.out.println("등록하실 예금주명을 입력하세요.");
		String owner = scanner.next();
		
		System.out.println("입금하실 금액을 입력하세요.");
		int balance = scanner.nextInt();
		
		// 각 필드의 정보를 사용자로부터 할당 받아서 객체를 생성 후 객체에 필드의 값을 저장
		Account createAccount = new Account(ano, owner, balance);
		
		accountTreeSet.add(createAccount);
		System.out.println("계좌 생성 완료\n");	
		
		
	}
	
	private static void accountList() {
		// 코드 작성 : 2. 계좌 목록 출력 : 저장된 객체를 가져와서 계좌번호, 예금주, 현재 금액을 출력
		Iterator<Account> iterator = accountTreeSet.iterator();

		while(iterator.hasNext()) {
			Account account = iterator.next();
			if (account != null) {
				System.out.println("계좌번호: " + account.getAno());
				System.out.println("예금주: " + account.getOwner());
				System.out.println("현재 잔고: " + account.getBalance() + "원\n");
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
			return;
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
			return;
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
		Iterator<Account> iterator = accountTreeSet.iterator();
		
		// 코드 작성
		while (iterator.hasNext()) {
			Account searchAccount = iterator.next();
			String searchAno = searchAccount.getAno();
			
			if (searchAno.equals(ano)) {
				account = searchAccount;
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
