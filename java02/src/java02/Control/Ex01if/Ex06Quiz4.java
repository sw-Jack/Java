package java02.Control.Ex01if;

import java.util.Scanner;
/* Quiz
 * �� ���� �Է¹޾� ū ���� ����Ͻÿ�.
 * 1. �� ���� �Է¹޴´�.
 * 2. ù��° ���� �ι�° ���� ���ؼ� ù��° ���� ũ�� ù��° ���� ����Ѵ�.
 * 3. ù��° ���� �ι�° ���� ���ؼ� �ι�° ���� ũ�� �ι�° ���� ����Ѵ�.
 * 4. ù��° ���� �ι�° ���� ���ؼ� ������ ù��°�� ����Ѵ�.
 */

public class Ex06Quiz4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// ���ʿ� �Էµ� ���� �� ����� �����Ƿ� �ִ밪���� �����س���
		System.out.print("ù��° �� �Է� : ");
		int num1 = in.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		int num2 = in.nextInt();

		System.out.print("ū �� : ");
		int max;
		max = num1;
		// ������ ������ ���� �ִ밪�� ���Ѵ�.
		if(max < num2) {
		max = num2;
		}
		else {
			max = max;
			}
		System.out.println(max);
	}

}
