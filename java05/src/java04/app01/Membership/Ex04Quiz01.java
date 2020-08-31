package java04.app01.Membership;

import java.util.Scanner;

public class Ex04Quiz01 {
	// �̸�, ���̵�, �н����带 �����ϱ� ���� ��� ���� ����
	static String [] names, ids, pws;
	// �迭�� ��ġ�� �����ϱ� ���� ��� ���� ����
	static int idx;
	
	// ����ڰ� ȸ���� ������ �Է¹��� ������ �����ϱ� ����
	// init�̶�� �޼ҵ带 ����� size�� �Է¹��� ȸ���� ���� �����ϸ�
	// ����� ȸ�� ����ŭ �̸�, ���̵�, �н����� �迭�� ������ �� �ִ�.
	// ���� ��� init(20)�̶�� �ϸ� 20���� ������ ������ �� �ִ� ������ �����ȴ�.
	static void init(int size) { 
		names = new String[size];
	    ids = new String[size];
	    pws = new String[size];
	    idx = 0;
	}
	 	
	// ����ڰ� �޴��� �����ϸ� ���õ� ��ȣ�� ������ ����� �����ϱ� ���� 
	// switch������ �����Ѵ�.
	// ȸ�������� case1�� break ���̿� �����ϸ� �ǰ�
	// �α����� cas2�� break ���̿�, ���������� ����� case3�� break ���̿� �����ϸ� �ȴ�.
	static void menu() {
		String menustr = "=================\n";
		menustr += "1.ȸ������\n";
		menustr += "2.�α���\n";
		menustr += "3.����\n";
		menustr += "=================\n";
		menustr += "�޴��� �����ϼ��� : ";
		System.out.print(menustr);
	}
	
	static void menuProc(int n) {
		switch(n) {
		case 1 :
			System.out.println("ȸ������ ����"); 
			break;
		case 2 :
			System.out.println("�α��� ����"); break;
		case 3 :
			System.out.println("���� ����"); break;
		default : 
			System.out.println("�߸��� ��ȣ�Դϴ�"); 
		}
		System.out.println(n + " �Էµ�");
	}
	
	static void membership(Scanner in) {
		// ���ڿ��� �Է¹ޱ� ���� in.next() �޼ҵ� Ȱ��
		// �̸�, ���̵�, �н������ �Ѹ��� �����̹Ƿ� 
		// names[idx++], ids[idx++]�� ���� ����ϸ� �ȵȴ�.
		// ���� ���� idx++ �ϰ� �Ǹ� names[0], ids[1], pws[2]
		// �������� ����Ǳ� ������ �� ����� ������� �� �� ����.
		// ���� ��� �����Ͱ� ����� �� �������� idx++�� ó���Ѵ�.
		System.out.print("�̸� �Է� : ");
		names[idx] = in.next();
		System.out.print("���̵� �Է� : ");
		ids[idx] = in.next();
		System.out.print("�н����� �Է� : ");
		pws[idx] = in.next();
		idx++;
		System.out.println("ȸ������ ���ϵ帳�ϴ�!");
	}
	
	public static void main(String[] args) {
		// �ʱⰪ ������ main �޼ҵ��� ù��° �ٿ� �����Ѵ�.
		init(20);
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		menu();
		int choice = in.nextInt();
		menuProc(choice);	
		// ������� �޼ҵ尡 ���������� ���۵Ǵ��� Ȯ���ϱ� ����
		// �� ��ġ���� ����
		// Scanner�� main�� ������� �����Ƿ� ���� �������� �ʰ�
		// ���ڷ� �����Ͽ� membership �޼ҵ忡�� Ȱ��
		membership(in);		
	}

}
