package chap17.Ex15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;



class Account {		// ���������� �����ϴ� ��ü. �߿��� �ʵ�, private(ĸ��ȭ), ��ü�� �ʵ�����(X), ������, getter, setter  // DTO, VO => �� �������� �ʵ��� ���� �����ϰ� ����
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

public class BankAccountUsingHashSet {
	// Collection(ArrayList<E>)�� ����ؼ� Account ��ü ���
	// Collection�� ���� ���� ���� ��� add() method ���(���� ������ �濡 ���� �߰�). Collection(ArrayList<E>) ���� ���� : size()
	// �� ���� ���� ������ ���� remove() ���
	// �迭�� ���� ũ�⸦ ����, ����� ���� ũ�⸦ ����, ���� ũ�� ���� �Ұ���
	// Collection�� ���� ũ�Ⱑ ����, ������ ���� ����
	private static Set<Account> accountHashSet = new HashSet<Account>();		// Collection(ArrayList<E>)�� ��ü ����
	private static Scanner scanner = new Scanner(System.in);
	
	private static void createAccount() {
		// �ڵ� �ۼ� : 1. ���� ���� : ��ĳ�ʷ� 1. ���¹�ȣ, 2. �̸�, 3. �ʱ����� �ݾ�
		// Collection(ArrayList<E>) ��ü�� ����
		System.out.println("����Ͻ� ���¹�ȣ�� �Է��ϼ���.");
		String ano = scanner.next();	// method �������� ����ϴ� ���� ����
		
		System.out.println("����Ͻ� �����ָ��� �Է��ϼ���.");
		String owner = scanner.next();
		
		System.out.println("�Ա��Ͻ� �ݾ��� �Է��ϼ���.");
		int balance = scanner.nextInt();
		
		// �� �ʵ��� ������ ����ڷκ��� �Ҵ� �޾Ƽ� ��ü�� ���� �� ��ü�� �ʵ��� ���� ����
		// Account newAccount = new Account(ano, owner, balance);
		
		// Collection(ArrayList<E>) ������ method �ܺο��� ���� => ����������(��� method���� ��� ����)
		// ��ü�� Collection(ArrayList<E>)�� ����(����ִ� �濡 ����)
		
		Account createAccount = new Account(ano, owner, balance);
		
		accountHashSet.add(createAccount);
		System.out.println("���� ���� �Ϸ�\n");	
		
		
	}
	
	private static void accountList() {
		// �ڵ� �ۼ� : 2. ���� ��� ��� : Collection(ArrayList<E>)�� ����� ��ü�� �����ͼ� ���¹�ȣ, ������, ���� �ݾ��� ���
		// Collection(ArrayList<E>)�� �� ���� ��ȸ�ϸ鼭 null�� �ƴ� ��� Collection(ArrayList<E>)���� ��ü�� ������ �ʵ��� ������ ���
		
		Iterator<Account> iterator = accountHashSet.iterator();
		
		while(iterator.hasNext()) {
			Account account = iterator.next();
			if (account != null) {
				System.out.println("���¹�ȣ: " + account.getAno());
				System.out.println("������: " + account.getOwner());
				System.out.println("���� �ܰ�: " + account.getBalance() + "��\n");
			}
		}
	}
	
	private static void deposit() {
		// �ڵ� �ۼ� : 3. ���� <== ���¹�ȣ�� �޾Ƽ� ��ü���� �ش� ���¹�ȣ�� ã�� �Աݱݾ��� ��ǲ�޾Ƽ� ����
		// 1. ����ڷκ��� �Ա��� ���¸� �޾ƾ���
		// 2. ����ڷ� ���� ���� ��ȣ�� Collection(ArrayList<E>)�� ����� ��ü ���� ���¹�ȣ�� Ȯ�� �� �ش� ���¿� �Ա��ؾ߿�����
		System.out.println("�����Ͻ� ���¹�ȣ�� �Է����ּ���.");
		String ano = scanner.next();
		
		if (findAccount(ano) == null)  {
			System.out.println("��ȸ�Ͻ� ���¹�ȣ�� �������� �ʽ��ϴ�. �ٽ� �̿� ��Ź�帳�ϴ�.\n");
			return;
		} else {
			System.out.println("�Ա��Ͻ� �ݾ��� �Է����ּ���.");
			int inputMoney = scanner.nextInt();
			
			findAccount(ano).setBalance(findAccount(ano).getBalance() + inputMoney);
			
			System.out.println(inputMoney + "�� �Ա��� �Ϸ�Ǿ����ϴ�.\n" + findAccount(ano).getOwner() + " �������� �Ա� �� �ܾ��� " + findAccount(ano).getBalance() + "���Դϴ�.\n");
		}
		
	}
	
	private static void withdraw() {
		// �ڵ� �ۼ� : 4. ��� <== ���� ��ȣ�� ��ǲ �޾� �ش� ���¸� ��ü���� ã�Ƽ� ���
		System.out.println("����Ͻ� ���¹�ȣ�� �Է����ּ���.");
		String ano = scanner.next();
		
		if (findAccount(ano) == null) {
			System.out.println("��ȸ�Ͻ� ���¹�ȣ�� �������� �ʽ��ϴ�. �ٽ� �̿� ��Ź�帳�ϴ�.\n");
			return;
		} else {
			System.out.println("����Ͻ� �ݾ��� �Է����ּ���");
			int outputMoney = scanner.nextInt();
			
			findAccount(ano).setBalance(findAccount(ano).getBalance() - outputMoney);
			
			System.out.println(outputMoney + "���� ��ݵǾ����ϴ�.\n" + findAccount(ano).getOwner() + " �������� ��� �� �ܾ��� " + findAccount(ano).getBalance() + "���Դϴ�.\n");
		}
		
	}
	
	// Collection(ArrayList<E>)���� Account ��ü ���� ano[���¹�ȣ]�� ������ ���¸� ã�� �� ã�� ��ü�� return���� ������
	// ����, ����� �� �����ڵ� => ���� method���� �ߺ� ���� �� ������ method�� �����ؼ� �ߺ��ڵ带 �ۼ��� �ʿ䰡 ����
	private static Account findAccount(String ano) {
		Account account = null;		// �Ű������� �Էµ� ���� ������ ���� ������ Account class�� return account, ������ null ��ȯ
		Iterator<Account> iterator = accountHashSet.iterator();
		
		// �ڵ� �ۼ�
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
			System.out.println("���Ͻô� ���� ��ȣ�� �Է��ϼ���.");
			System.out.println("--------------------------------------------------");
			System.out.println("| 1. ���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ���� |");
			System.out.println("--------------------------------------------------");
			System.out.println("���� >>");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				createAccount();	// method ȣ��. ��ü �������� method������ ȣ��(static)
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
		System.out.println("���α׷� ����");
	}
}