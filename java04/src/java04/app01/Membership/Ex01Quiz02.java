package java04.app01.Membership;

import java.util.Scanner;

public class Ex01Quiz02 {
	// �޴� ����â ��� �޼ҵ�
	static void menu() {
		String menustr = "=================\n";
		menustr += "1.ȸ������\n";
		menustr += "2.�α���\n";
		menustr += "3.����\n";
		menustr += "=================\n";
		menustr += "�޴��� �����ϼ��� : ";
		System.out.print(menustr);
	}
	// �Է¹��� ���� ��� �޼ҵ�
	static void mainMenuExec(int n) {
		System.out.println(n + " �Էµ�");
	}
	public static void main(String[] args) {	
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		menu();
		int choice = in.nextInt();
		mainMenuExec(choice);
		
	}

}
