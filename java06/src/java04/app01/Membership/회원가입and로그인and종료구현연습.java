package java04.app01.Membership;

import java.util.Scanner;

public class ȸ������and�α���and���ᱸ������ {
	// �̸�, ���̵�, ��й�ȣ ���� �迭 ����
	static String [] names, ids, pws;
	// ȸ�� �� �ǹ��ϴ� �ε��� idx
	static int idx;
	
	// �ʱ�ȭ �޼ҵ� ->  �ִ� ���� ȸ�� �� ����
	static void init(int size) {
		names = new String [size];
		ids = new String [size];
		pws = new String [size];
		idx = 0;
	}
	
	// �޴� ��� �޼ҵ�
	static void menu() {
		String menuStr = "=======================\n<�޴�>\n";
		menuStr += "1.ȸ������\n";
		menuStr += "2.�α���\n";
		menuStr += "3.ȸ������ ���\n";
		menuStr += "4.����\n";
		menuStr += "=======================\n�޴� ���� : ";
		System.out.print(menuStr);
		}
	
	// �޴� ���� �� ���� �޼ҵ�
	static void menuProc(Scanner in, String n) {
			if(n.equals("1")) {
				System.out.println("<ȸ������ ������>");
				membership(in);
				}
			else if(n.equals("2")) {
				System.out.println("<�α��� ������>");
				login(in);
				}
			else if(n.equals("3")) {
				System.out.println("<ȸ������ ���>");
				outmember();			
				}
			else if(n.equals("4")) {
				System.out.println("���α׷� ���� ...");
				System.exit(0);
				}
			else {
				System.out.println("�ش� �޴��� �������� �ʽ��ϴ�!! �ٽ� �����ϼ���...");
			
		}
	}
	
	// �α��� �޼ҵ� 
	static void login(Scanner in) {
		// ���̵�, ��й�ȣ �Է� �ޱ�
		System.out.print("���̵� : ");
		String id = in.next();
		System.out.print("��й�ȣ : ");
		String pw = in.next();
		
		// �Է� ���̵�, ��й�ȣ��  ids, pws �迭�� ����Ǿ� �ִ� ������ ��
		for(int i=0; i<idx; i++) {
			if(ids[i].equals(id)) {
				if(pws[i].equals(pw)) {
					System.out.println("�α��� ����! " + ids[i] + "�� �ȳ��ϼ���^^");
					return;
				}
				else {
					System.out.println("��й�ȣ�� Ʋ���ϴ�.");			
					return;
				}
			}
		}			
		System.out.println("�ش� ���̵� �������� �ʽ��ϴ�.");
	}
	
	// ȸ������ �޼ҵ�
	static void membership(Scanner in) {
		System.out.print("�̸� : ");
		names[idx]  = in.next();

		System.out.print("���̵� : ");
		ids[idx] =in.next();
		
		System.out.print("��й�ȣ : ");
		pws[idx] = in.next();
		
		idx++;
		System.out.println("ȸ�������� ���ϵ帳�ϴ�!!");
	}
	
	// ȸ������ ��� �޼ҵ�
	static void outmember() {
		System.out.println("<ȸ������>\n�̸�\t\t\t���̵�\t\t\t��й�ȣ");

		for(int i=0; i<idx; i++) {
			System.out.println(names[i] + "\t\t\t" + ids[i] + "\t\t\t" + pws[i]);
		}
	}
	/*
	static void addMember() {
		names[idx] = "�����";
		ids[idx] = "jaewoo";
		pws[idx++] = "1111";
		
		names[idx] = "ȫ�浿";
		ids[idx] = "gildong";
		pws[idx++] = "2222";
	}
	*/

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		// �ʱ�ȭ -> (�ִ�)ȸ�� ���� 20������ ����
		init(20);
		// addMember();
		// �޴� ���
		while(true) {
		menu();
		// in �� Scanner��ü�� �Ѱ��ذ�, in.nextInt() �� ��ȣ ���� ����
		menuProc(in, in.next());
		}
		// �޴� ����
		

	}

}
