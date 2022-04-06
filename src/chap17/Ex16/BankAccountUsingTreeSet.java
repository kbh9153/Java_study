package chap17.Ex16;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

// Account ��ü�� TreeSet�� ����. ano[���¹�ȣ], owner[�̸�], balance[�ܰ�]
// TreeSet�� �Ϲ� ��ü�� ���� �� � column�� ���������� �����������. Comparable<E>, Comparator<E>
// Account ��ü�� �������� �ʰ� balance ���� ū �ͺ��� ��µǵ��� ���� <��������>

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
		// �ڵ� �ۼ� : 1. ���� ���� : ��ĳ�ʷ� 1. ���¹�ȣ, 2. �̸�, 3. �ʱ����� �ݾ�
		System.out.println("����Ͻ� ���¹�ȣ�� �Է��ϼ���.");
		String ano = scanner.next();	// method �������� ����ϴ� ���� ����
		
		System.out.println("����Ͻ� �����ָ��� �Է��ϼ���.");
		String owner = scanner.next();
		
		System.out.println("�Ա��Ͻ� �ݾ��� �Է��ϼ���.");
		int balance = scanner.nextInt();
		
		// �� �ʵ��� ������ ����ڷκ��� �Ҵ� �޾Ƽ� ��ü�� ���� �� ��ü�� �ʵ��� ���� ����
		Account createAccount = new Account(ano, owner, balance);
		
		accountTreeSet.add(createAccount);
		System.out.println("���� ���� �Ϸ�\n");	
		
		
	}
	
	private static void accountList() {
		// �ڵ� �ۼ� : 2. ���� ��� ��� : ����� ��ü�� �����ͼ� ���¹�ȣ, ������, ���� �ݾ��� ���
		Iterator<Account> iterator = accountTreeSet.iterator();

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
			
			System.out.println(inputMoney + "�� �Ա��� �Ϸ�Ǿ����ϴ�.\n" + findAccount(ano).getOwner() + " ������ �Ա� �� �ܾ��� " + findAccount(ano).getBalance() + "���Դϴ�.\n");
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
			
			System.out.println(outputMoney + "���� ��ݵǾ����ϴ�.\n" + findAccount(ano).getOwner() + " ������ ��� �� �ܾ��� " + findAccount(ano).getBalance() + "���Դϴ�.\n");
		}
		
	}
	
	// Collection(ArrayList<E>)���� Account ��ü ���� ano[���¹�ȣ]�� ������ ���¸� ã�� �� ã�� ��ü�� return���� ������
	// ����, ����� �� �����ڵ� => ���� method���� �ߺ� ���� �� ������ method�� �����ؼ� �ߺ��ڵ带 �ۼ��� �ʿ䰡 ����
	private static Account findAccount(String ano) {
		Account account = null;		// �Ű������� �Էµ� ���� ������ ���� ������ Account class�� return account, ������ null ��ȯ
		Iterator<Account> iterator = accountTreeSet.iterator();
		
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
