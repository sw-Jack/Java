package java02.Control.Ex01if.Quiz;

import java.util.Scanner;
/* Quiz
 * 1. ���ڸ� �Ǻ��Ͽ� ������ ���� ��µǵ��� �ڵ��Ͻÿ�.
 * - �Ǻ��� �� : 5
 * - ��� : 5
 * - �Ǻ��� �� : -7
 * - ���� : 7
 */

public class Quiz03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�Ǻ��� �� : ");
		int num = in.nextInt();
		// ���ڿ� ���� ����ؼ�  
		String output;
		if(num > 0) {
			output = "���";
		}
		else {
			output = "����";
			num *= -1;
		}
		// ��¹��� �ѹ���
		System.out.println(output + " : " + num);
	}

}
