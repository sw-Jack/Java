package java07.classQuiz.Ex04;
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

	// ���� ���� �޼ҵ�
	public static int Choice(Scanner in) {
		System.out.println("===================");
		System.out.println("1.������\n2.�α�\n3.������");
		System.out.println("===================");
		System.out.print("���� ���� : ");
		int num = in.nextInt();
		// ������ ��ȣ ��ȯ
		return num;
	}
	
	// �Ű� ������ ���� ��(����� �Է� ���� ��ȣ)�� ���� ���� ����(setJob())
	public static void RealChoice(L2CharInit l2, int num) {
		if(num == 2) { l2.setJob(2); }
		else if (num == 3) { l2.setJob(3); }
	}
	
	public static void main(String[] args) {
		L2CharInit l2 = new L2CharInit();
		Scanner in = new Scanner(System.in);
		// �ʱ� ���� ���� ���� ��� ȭ�� ���
		View(l2);
		
		// Choice() �޼ҵ� ȣ��� ��ȯ���� �� val ������ ����
		int val = Choice(in);
		// ����� ���� �� RealChoice() �޼ҵ�� ���� ���� ����
		RealChoice(l2,val);
		// ���� ���� �� ��� ȭ�� ���
		View(l2);
	}
}

