package java02.Control.Ex01if.Quiz;

import java.util.Scanner;
/* Quiz
 * 1. ���ڸ� �Ǻ��Ͽ� ������ ���� ��µǵ��� �ڵ��Ͻÿ�.
 * - �Ǻ��� �� : 5
 * - ��� : 5
 * - �Ǻ��� �� : -7
 * - ���� : 7
 */

public class Quiz04 {

	public static void main(String[] args) {
		// @SuppressWarnings�� ��� ������ ��� ����
		// @SuppressWarnings("resource")
		// resource ��, �ڿ��� �����ϰڴٴ� �ǹ���.
		Scanner in = new Scanner(System.in);
		
		System.out.print("�Ǻ��� �� : ");
		int num = in.nextInt();

		String output = "���";
		
		if(num < 0) {
			output = "����";
			num *= -1;
		}
		System.out.println(output + " : " + num);
	}

}
