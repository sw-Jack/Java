package java07.classQuiz.Ex06;
import java.util.Scanner;

/*
 * �� ���� �Ӹ� �߰� version 1
 */

public class L2Main {
	public static void View(L2CharInit l2) {
		System.out.println("���� : " + l2.getJob());
		System.out.println("== ���� =================================");
		System.out.println(l2.getJobExplain());
		System.out.println("== �Ӹ� ��Ÿ�� =============================");
		System.out.println(l2.getHair());
	}

	public static void main(String[] args) {
		L2CharInit l2 = new L2CharInit();
		Scanner in = new Scanner(System.in);
		
		View(l2);
		
		// ���� ����
		System.out.println(L2CharMenu.JOB);
		System.out.print("���� ���� : ");
		// ���� �� ����
		l2.setJob(in.nextInt());
		
		// �Ӹ� ����
		System.out.println(L2CharMenu.HAIR);
		System.out.print("�Ӹ� ��Ÿ�� ���� : ");
		// ���� �� ����
		l2.setHair(in.nextInt());
		
		System.out.println();
		
		View(l2);
	}
}
