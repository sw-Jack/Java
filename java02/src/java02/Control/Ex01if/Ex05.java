package java02.Control.Ex01if;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);		
		System.out.print("�湮 Ƚ���� �Է��ϼ��� : ");
		int visitCnt = in.nextInt();
		
		String visitStr = null;
		// �޼ҵ�(�Լ�)�� �ּ������� ����ϴ� ���� ����.
		// ������ ���ǹ��ȿ��� ��¹��� ����ϴ� �ͺ��ٴ�
		// ������ �̿��Ͽ� ���ڿ��� �����ϰ� �� ���� ����ϴ� ���� ����.
		if(visitCnt<1) {
			// System.out.print("ù ");
			visitStr = "ù ";
		}		
		else {
			// System.out.print("�� ");
			visitStr = "�� ";
		}
		System.out.println(visitStr + "�湮 �����մϴ�.");


	}

}
