package java02.Control.Ex01if;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// Scanner��� ��ü�� in�̶�� �̸����� ����
		// new�� �̿��Ͽ� heap������ Scanner��ü�� �Է� ������ System.in�� ���ڷ� �޾� ���� �Ҵ��Ѵ�.
		Scanner in = new Scanner(System.in);
		
		System.out.print("�湮 Ƚ���� �Է��ϼ��� : ");
		// ������ ������ in�̶�� ��ü �ȿ� �ִ� nextInt�޼ҵ带 �̿��Ͽ� ������ �Է¹޾� visitCnt�� �����Ѵ�.
		int visitCnt = in.nextInt();
		// if�� ���ǹ����� ��ȣ�ȿ� ���ǽ��� �ְ� �ȴ�.
		// �ڹٿ����� �� ������ 'visitCnt<1'�� ����� True, False�� ��Ÿ���� True�� ��� {}���� ������ �����Ѵ�.
		// �湮�� �ѹ��� ���� ��찡 ù �湮�̹Ƿ� visitCnt�� 0���� �Ǵ��ϴ� �����̴�.
		// ���� if(visitCnt==0)�� ǥ���� ���� �ִ�.
		if(visitCnt<1) {
			System.out.println("ù �湮 �����մϴ�.");
		}

	}

}
