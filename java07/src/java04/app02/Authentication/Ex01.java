package java04.app02.Authentication;


import java.util.Scanner;

/* �޼ҵ� ���� �� ����� main������ �Ѵ�.
 * return�� ȣ���� �������� ���� ������ ��� ����Ѵ�. 
 */

public class Ex01 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		int insertNum = in.nextInt();
		// 1. getCertiNum�� �Է� ���� ���� ����
		// 4. �޼ҵ� ���� �� return���� ���� ���� ���� certiNum�� ����
		int certiNum = getCertiNum(insertNum);
		System.out.println("�Է°� : " + insertNum);
		System.out.println("������ȣ : " + certiNum);

	}

	static int getCertiNum(int n) {
		// 2. ���� ���� n�� 2�� ���Ͽ� ���� ��ȣ ����
		int certiNum = n * 2;
		// 3. getCertiNum�� ȣ���� main�� ���� ��ȣ ����
		return certiNum;
	}
}
