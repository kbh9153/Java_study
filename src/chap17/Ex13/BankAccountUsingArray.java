package chap17.Ex13;

import java.util.Arrays;
import java.util.Scanner;

class Account {
	private String ano;		// ���¹�ȣ
	private String owner;		// ������ �̸�
	private int balance;		// ���� �ݾ�
	
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
	// �迭�� ����ؼ� Account ��ü ���
	private static Account[] accountArray = new Account[100];		// �迭�� ��ü ����
	private static Scanner scanner = new Scanner(System.in);
	
	private static void createAccount() {
		// �ڵ� �ۼ� : 1. ���� ���� : ��ĳ�ʷ� 1. ���¹�ȣ, 2. �̸�, 3. �ʱ����� �ݾ�
		// �迭 ��ü�� ����
		System.out.println("����Ͻ� ���¹�ȣ�� �Է��ϼ���.");
		String ano = scanner.next();
		
		System.out.println("����Ͻ� �����ָ��� �Է��ϼ���.");
		String owner = scanner.next();
		
		System.out.println("�Ա��Ͻ� �ݾ��� �Է��ϼ���.");
		int balance = scanner.nextInt();
		
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, balance);
	            System.out.println("���� ���� �Ϸ�\n");
	            break;
	         }
		}
	}
	
	private static void accountList() {
		// �ڵ� �ۼ� : 2. ���� ��� ��� : �迭�� ����� ��ü�� �����ͼ� ���¹�ȣ, ������, ���� �ݾ��� ���
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				break;
			} else {
				System.out.println("���¹�ȣ: " + accountArray[i].getAno() + "\n������: " + accountArray[i].getOwner() + "\n���� �ܰ�: " + accountArray[i].getBalance() + "\n");
			}
		}
	}
	
	private static void deposit() {
		// �ڵ� �ۼ� : 3. ���� <== ���¹�ȣ�� �޾Ƽ� ��ü���� �ش� ���¹�ȣ�� ã�� �Աݱݾ��� ��ǲ�޾Ƽ� ����
		System.out.println("�����Ͻ� ���¹�ȣ�� �Է����ּ���.");
		String ano = scanner.next();
		
		if (findAccount(ano) == null)  {
			System.out.println("��ȸ�Ͻ� ���¹�ȣ�� �������� �ʽ��ϴ�. �ٽ� �̿� ��Ź�帳�ϴ�.\n");
		} else {
			System.out.println("�Ա��Ͻ� �ݾ��� �Է����ּ���.");
			int inputMoney = scanner.nextInt();
			
			findAccount(ano).setBalance(findAccount(ano).getBalance() + inputMoney);
			
			System.out.println(inputMoney + "�� �Ա��� �Ϸ�Ǿ����ϴ�.\n" + findAccount(ano).getOwner() + " ������ �Ա� �� �ܾ��� " + findAccount(ano).getBalance() + "���Դϴ�.\n");
		}
	}
	
	private static void withdraw() {
		// �ڵ� �ۼ� : 4. ��� <== ���� ��ȣ�� ��ǲ �޾� �ش� ���¸� ��ü���� ã�Ƽ� ���
		System.out.println("����Ͻ� ���¹�ȣ�� �Է����ּ���.");
		String ano = scanner.next();
		
		if (findAccount(ano) == null) {
			System.out.println("��ȸ�Ͻ� ���¹�ȣ�� �������� �ʽ��ϴ�. �ٽ� �̿� ��Ź�帳�ϴ�.\n");
		} else {
			System.out.println("����Ͻ� �ݾ��� �Է����ּ���");
			int outputMoney = scanner.nextInt();
			
			findAccount(ano).setBalance(findAccount(ano).getBalance() - outputMoney);
			
			System.out.println(outputMoney + "���� ��ݵǾ����ϴ�. " + findAccount(ano).getOwner() + " ������ ��� �� �ܾ��� " + findAccount(ano).getBalance() + "���Դϴ�.\n");
		}
	}
	
	// �迭���� Account ��ü ���� ano[���¹�ȣ]�� ������ ���¸� ã�� �� ã�� ��ü�� return���� ������
	private static Account findAccount(String ano) {
		Account account = null;
		// �ڵ� �ۼ�
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
			System.out.println("���Ͻô� ���� ��ȣ�� �Է��ϼ���.");
			System.out.println("--------------------------------------------------");
			System.out.println("| 1. ���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ���� |");
			System.out.println("--------------------------------------------------");
			System.out.println("���� >>");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				createAccount();	// method ȣ��
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
