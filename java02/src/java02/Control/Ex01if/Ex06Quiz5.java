package java02.Control.Ex01if;

import java.util.Scanner;
/* Quiz
 * �� ���� �Է¹޾� ū ���� ����Ͻÿ�.
 * 1. �� ���� �Է¹޴´�.
 * 2. ù��° ���� �ι�° ���� ���ؼ� ù��° ���� ũ�� ù��° ���� ����Ѵ�.
 * 3. ù��° ���� �ι�° ���� ���ؼ� �ι�° ���� ũ�� �ι�° ���� ����Ѵ�.
 * 4. ù��° ���� �ι�° ���� ���ؼ� ������ ù��°�� ����Ѵ�.
 */

public class Ex06Quiz5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// ���ʿ� �Էµ� ���� �� ����� �����Ƿ� �ִ밪���� �����س���
		System.out.print("ù��° �� �Է� : ");
		int max = in.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		int num = in.nextInt();

		System.out.print("ū �� : ");
		
		// �ι�° �Էµ� ���� max���� ũ�ٸ� max�� �ι�° �Էµ� ���� �����Ѵ�.
		if(max < num) {
		max = num;
		}
		// else�� max�� max�� �����ϴ� ������ �ǹ̰� ���� ������ �����Ѵ�.
//		else {max = max;}
		System.out.println(max);
	}

}
