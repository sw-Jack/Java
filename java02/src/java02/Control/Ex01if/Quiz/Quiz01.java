package java02.Control.Ex01if.Quiz;

import java.util.Scanner;
/* Quiz
 * �� ���� �Է¹޾� ū ���� ����Ͻÿ�.
 * �˰��� 1
 * ������ ���� �ִ밪�� ������ ��, ���� ������ ���� �ִ밪�� ���ϰ�
 * �ִ밪���� ū ���� ������ �ִ밪�� ū ���� �����Ѵ�.
 */

public class Quiz01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.print("ù��° �� �Է� : ");
		int max = in.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		int num2 = in.nextInt();
		System.out.print("����° �� �Է� : ");
		int num3 = in.nextInt();
		
		if(max<num2) {
			max = num2;
		}
		if(max<num3) {
			max = num3;
		}
		System.out.print("ū �� : " + max);


	}

}
