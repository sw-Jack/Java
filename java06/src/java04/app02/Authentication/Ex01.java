package java04.app02.Authentication;

import java.util.Scanner;

/* <�޼ҵ� �Ű������� ������  return ���� ���� ���>
 * 1. ���� �Է¹޴´�.
 * 2. ������ȣ�� �����Ѵ�.
 * 3. �Է¹��� ���� ������ȣ�� ����Ѵ�.
 */
public class Ex01 {
	public static void main(String[] args) {
		// Scanner �̿� �� ��Ÿ���� ��� ����
		@SuppressWarnings("resource")
		// �Է� �ޱ� ���� Scanner ��ü ����
		Scanner in = new Scanner(System.in);
		// ȭ�鿡 "���� �Է��ϼ���" ���
		System.out.print("���� �Է��ϼ��� : ");
		// in.nextInt() �޼ҵ带 �̿��Ͽ� ������ �Է¹ް� insertNum�� ����
		int insertNum = in.nextInt();
		// �Է¹��� insertNum ���
		System.out.println("�Է°� : " + insertNum);
		// getCertiNum�� ���ڷ� �Է¹��� insertNum�� ���� ����
		getCertiNum(insertNum);

	}
	// static�� main���� static�� ���Ǿ� �ٰԵ�
	// void�� main���� ������ ���� ���� ��� ����
	// int n�� getCertiNum�� ȣ���� �������� ������ ���� ������ ��� �޴� ����
	// ��, main���� getCertiNum(insertNum);�� ȣ���ϸ鼭 
	// int n = insertNum�� ���� ���۵�
	static void getCertiNum(int n) {
		// �Է¹��� n�� 2�� ���� �� certiNum�� ����
		int certiNum = n * 2;
		// ����� certiNum�� ���
		System.out.println("������ȣ : " + certiNum);
	}
}
