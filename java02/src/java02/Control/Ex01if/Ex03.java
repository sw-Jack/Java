package java02.Control.Ex01if;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("�湮 Ƚ���� �Է��ϼ��� : ");
	
		int visitCnt = in.nextInt();
		
		if(visitCnt<1) {
			System.out.println("ù �湮 �����մϴ�.");
		}		
		// else�� if�� ���ǽ��� ������ ��� �����Ѵ�.
		// ���� if(visitCnt<1)�� �ݴ�� if(visitCnt>=1)�� �̸�
		// else�� ����ϰ� �Ǹ� if(visitCnt>=1)�� ������ ������
		// �Ǵ��� �� �ִ�.
		// ���� if(���ǽ�){���� ���}else{���ǽ��� ������ ���}��
		// �����ϸ� �ȴ�.
		else {
			System.out.println("�� �湮 �����մϴ�.");
		}


	}

}
