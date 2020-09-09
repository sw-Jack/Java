package java07.classQuiz.Ex08;
import java.util.Scanner;

import java07.classQuiz.Ex07.L2CharInit;
import java07.classQuiz.Ex07.L2CharMenu;

/*
 * �� ���� �Ӹ� �߰� version 2
 */

public class L2Main {
	public static void View(L2CharInit l2) {
		System.out.println("���� : " + l2.getJob());
		System.out.println("== ���� =================================");
		System.out.println(l2.getJobExplain());
		System.out.println("== �Ӹ� ��Ÿ�� =============================");
		System.out.println(l2.getHair());
	}

	// �޴� ���� �޼ҵ� ���� : boolean �� ��ȯ �̿�
	public static boolean MenuProc(L2CharInit l2) {
		Scanner in = new Scanner(System.in);
		switch(in.nextInt()) {
		case 1 : 
			// 1�� �Է½� ���� ����â ���
			System.out.println(L2Menu.getMenu(L2Menu.JOB));
			// ���� ���� ��ȣ �Է�
			System.out.print("���� ���� : ");
			l2.setJob(in.nextInt());
			// true ��ȯ
			return true;
		case 2 : 
			// 2�� �Է½� �Ӹ� ��Ÿ�� ����â ���
			System.out.println(L2Menu.getMenu(L2Menu.HAIR));
			// �Ӹ� ��Ÿ�� ��ȣ �Է�
			System.out.print("�Ӹ� ��Ÿ�� ���� : ");
			l2.setHair(in.nextInt());
			// true ��ȯ��
			return true;
		case 3 : 
			// 3�� �Է½� �̸� �Է�â ���
			System.out.print("�̸� �Է� : ");
			// �̸� �Է�
			l2.setNickName(in.next());
			// true ��ȯ
			return true;
		}
		// �̿��� ���� false�� ��ȯ
		return false;
	}
	
	public static void main(String[] args) {
		L2CharInit l2 = new L2CharInit();
		Scanner in = new Scanner(System.in);
		
		boolean isComplete = true;
		// isComplete ���� ���� �ݺ��� ����
		// isComplete ���� false�� �Ǹ� Ż��
		while(isComplete) {
			View(l2);
			
			// ��ü �޴�â ���
		    System.out.println(L2Menu.getMenu(L2Menu.MENU));
		    System.out.print("�޴� ���� : ");
		    // ���� �� �޴� ���� �޼ҵ� MenuProc() ���� �� ��ȯ �� isComplete�� ����
		    // ��ȯ ��, �� isComplete�� true�� �ݺ��� ��� ����
		    // false�̸� �ݺ��� ����(ĳ���� ���� �Ϸ�)
		    isComplete = MenuProc(l2);
		}
		// �ݺ��� ����(ĳ���� ���� �Ϸ�) �� ��� ȭ�� ���
		View(l2);
		// �г��� + ĳ���� ���� �Ϸ� ���� ���
		System.out.println(l2.getNickName() + "ĳ���� ������ �Ϸ�Ǿ����ϴ�.");
	
	}
}




