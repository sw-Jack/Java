package java02.Control.Ex01if;

import java.util.Scanner;
/* Quiz
 * �� ���� �Է¹޾� ū ���� ����Ͻÿ�.
 * 1. �� ���� �Է¹޴´�.
 * 2. ù��° ���� �ι�° ���� ���ؼ� ù��° ���� ũ�� ù��° ���� ����Ѵ�.
 * 3. ù��° ���� �ι�° ���� ���ؼ� �ι�° ���� ũ�� �ι�° ���� ����Ѵ�.
 * 4. ù��° ���� �ι�° ���� ���ؼ� ������ ù��°�� ����Ѵ�.
 */

public class Ex06Quiz1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("ù��° �� �Է� : ");
		int num1 = in.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		int num2 = in.nextInt();
		if(num1 > num2) {
			System.out.println("ū �� : " + num1);
		}
		if(num1 < num2) {
			System.out.println("ū �� : " + num2);
		}
		if(num1 == num2) {
			System.out.println("ū �� : " + num1);
		}
	}

}
