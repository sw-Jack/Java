package java07.classQuiz.Ex05;
import java.util.Scanner;

/*
 * �� ��
 */

public class L2Main {
	// ��� ȭ�� ��� �޼ҵ�
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
		
		// �ʱ� ȭ�� ���
		View(l2);
		
		// ���� ������ L2CharMenu Ŭ������ ��� ���� ȣ��, �� �޴� ���� ȭ�� ���
		System.out.println(L2CharMenu.JOB);
		
		// ����ڷκ��� ��ȣ�� �Է¹޾� �� ��ȣ�� �ٷ� setJob()�� �����Ͽ� �� ����
		System.out.print("���� ���� : ");
		l2.setJob(in.nextInt());
		
		// ���� ���� ��� ���
		View(l2);
	}

}
