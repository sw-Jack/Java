package java02.Control.Ex01if.Quiz;

import java.util.Scanner;
/* Quiz
 * �� ���� �Է¹޾� ū ���� ����Ͻÿ�.
 * �˰��� 2
 * ��ʸ�Ʈ ������� �ڵ�
 */

public class Quiz02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.print("ù��° �� �Է� : ");
		int num1 = in.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		int num2 = in.nextInt();
		System.out.print("����° �� �Է� : ");
		int num3 = in.nextInt();
		int max;
		
		if(num1 < num2) {
			max = num2;
		}
		else {
			max = num1;
		}
		// ���� �� ����� ������ num3�� ���Ͽ� �ִ밪 ���� �� ���
		if(max < num3) {
			max = num3;
		}
		System.out.print("ū �� : " + max);


	}

}
