package java04.app02.Authentication;

import java.util.Scanner;

/* <�޼ҵ� �Ű�������  return �� ��� �����ϴ� ���>
 * �޼ҵ� ���� �� ����� main������ �Ѵ�.
 * return�� ȣ���� �������� ���� ������ ��� ����Ѵ�. 
 */

public class Ex02 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		// ����� �� �Է�
		int insertNum = in.nextInt();
		// ����� �Է°� ���
		System.out.println("�Է°� : " + insertNum);
		
		// ȣ��� �޼ҵ� getCertiNum���� �ٽ� ��ȯ�Ͽ� �� return ���� �޾��� ����  certiNum ����
		int certiNumber = getCertiNum(insertNum);
		

		// getCertiNum �޼ҵ� ȣ��� ó���Ǿ� �޾ƿ� return �� certiNumber ���
		System.out.println("������ȣ : " + certiNumber);

	}

	// return ��, �� ������ ��ȯ���� �����ϱ� ������ �޼ҵ��� void�� �ƴ� int�� ��
	static int getCertiNum(int n) {
		
		// main���� �Է¹��� insertNum�� �Ű����� n�� �޾� �� n���� 2�� ���� ��
		int certiNum = n * 2;
		
		// ȣ���� ������ ��ȯ
		return certiNum;
	}
}
