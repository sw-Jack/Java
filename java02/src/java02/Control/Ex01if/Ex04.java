package java02.Control.Ex01if;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("�湮 Ƚ���� �Է��ϼ��� : ");
		int visitCnt = in.nextInt();
		
		// if���� else���� ��� ��� �� "�湮 �����մϴ�."��� ������ 
		// if�������� ���Ǹ� else�������� ���ȴ�.
		// ��, ���� ���� ��� �������� �׻� ���ȴٰ� �Ǵ��� �� �ִ�.
		// ���� ���ǹ��� ������ ������ �� ���� ����Ͽ� ����� �� �ִ�.
		if(visitCnt<1) {
			// System.out.println("ù �湮 �����մϴ�.");
			System.out.print("ù ");
		}		
		else {
			// System.out.println("�� �湮 �����մϴ�.");
			System.out.print("�� ");
		}
		System.out.println("�湮 �����մϴ�.");


	}

}
