package java02.Control.Ex01if.Quiz;

import java.util.Scanner;
/* Quiz
 * 2. �¾ �⵵ 2�ڸ��� �Է¹޾� ������ ���� ����Ͻÿ�
 * ���) xx�⿡ �¾ ��� 00���Դϴ�.
 */

public class Quiz06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("�¾ �⵵ 2�ڸ� �Է� : ");
		int year = in.nextInt();
		System.out.print("���� �⵵ �Է� : ");
		int currentyear = in.nextInt();
		
		// ���� ���ϴ� ���� ���� : (���� �⵵ - �¾ �⵵ + 1)
		int age = currentyear - year + 1 + 100;
		//if(age < 0) { age = age + 100;}
		age = age % 100;
		System.out.println("����� " + age + "�� �̱���");
	}

}