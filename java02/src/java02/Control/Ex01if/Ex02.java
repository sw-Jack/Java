package java02.Control.Ex01if;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("�湮 Ƚ���� �Է��ϼ��� : ");
	
		int visitCnt = in.nextInt();
		
		if(visitCnt<1) {
			System.out.println("ù �湮 �����մϴ�.");
		}
		// if�� ���� ���ǽ��� ���� �Ǵ� ��찡
		// visitCnt�� 1�̻��� ����̹Ƿ� ��湮���� ǥ���ߴ�.
		if(visitCnt>=1) {
			System.out.println("�� �湮 �����մϴ�.");
		}


	}

}
