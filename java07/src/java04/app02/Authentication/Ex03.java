package java04.app02.Authentication;
import java.util.Random;
import java.util.Scanner;
/* �ڸ��� Ȯ�� �� ���
 * �ڸ��� ���� ������ �տ� 0 �ٿ� ���
 * �ڸ��� ���� ������ ���� �״��
 */

public class Ex03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ��� : ");
		int num = in.nextInt();	
		
		// format�� Ư�� ���ڿ��� ���� ��� ���ȴ�.
		// ù��° ������ ������� �ι�° �Է��� �����͸� ����� �ִ� ������
		// ù��° ������ %04d���� d�� digit�� �ǹ��ϴ� ������ ������ ���ϸ�
		// 4�� 4�ڸ����� �ǹ��ϰ� 0�� 4�ڸ����� ���������� ������ \
		// �� �ڸ��� 0���� ä��ٴ� �ǹ��̴�.
		// ���� ��� �Էµ� ���� 12�� ��� 2�ڸ����̹Ƿ� ������ 2�ڸ��� 0���� ä����
		// 0012��� ���ڿ��� ��ȯ�ϰ� �ȴ�.
		String str = String.format("%04d", num);
		System.out.println("������ȣ : " + str);
	}


}
