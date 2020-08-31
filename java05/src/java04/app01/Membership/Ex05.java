package java04.app01.Membership;

import java.util.Scanner;

/* Quiz
 * ȸ�������� ���� �ű� ȸ���� ����ϰ�
 * ���ݱ��� ��ϵ� ��� ȸ�� ������ ����ϴ� �޼ҵ带 ����ÿ�.
 */

public class Ex05 {
	static String [] names, ids, pws;
	static int idx;
	
	static void init(int size) { 
		names = new String[size];
	    ids = new String[size];
	    pws = new String[size];
	    idx = 0;
	}
	 	
	static void menu() {
		String menustr = "=================\n";
		menustr += "1.ȸ������\n";
		menustr += "2.�α���\n";
		menustr += "3.����\n";
		menustr += "=================\n";
		menustr += "�޴��� �����ϼ��� : ";
		System.out.print(menustr);
	}
	
	static void menuProc(int n, Scanner in) {
		switch(n) {
		case 1 :
			System.out.println("ȸ������ ����"); 
			membership(in);
			break;
		case 2 :
			System.out.println("�α��� ����"); break;
		case 3 :
			System.out.println("���� ����"); break;
		default : 
			System.out.println("�߸��� ��ȣ�Դϴ�"); 
		}
	}
	
	static void membership(Scanner in) {
		System.out.print("�̸� �Է� : ");
		names[idx] = in.next();
		System.out.print("���̵� �Է� : ");
		ids[idx] = in.next();
		System.out.print("�н����� �Է� : ");
		pws[idx] = in.next();
		idx++; // �߿�!! ���⼭ �ϳ��� �÷������ν� ���� �ε����� ���� ȸ���� ä�� �� ����
		System.out.println("ȸ������ ���ϵ帳�ϴ�!");
	}
	
	static void addMember() {
		names[idx] = "�����";
		ids[idx] = "jaewoo";
		pws[idx++] = "1111";
		
		names[idx] = "ȫ�浿";
		ids[idx] = "gildong";
		pws[idx++] = "2222";
	}
	public static void main(String[] args) {
	    init(20);
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		menu();
		menuProc(in.nextInt(), in);
		// addMember();
		for(int i=0;i<idx;i++)
		{
			System.out.println(names[i]);
			System.out.println(ids[i]);
			System.out.println(pws[i]);
		}
	}
}
