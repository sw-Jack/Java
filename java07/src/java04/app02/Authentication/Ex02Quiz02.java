package java04.app02.Authentication;
import java.util.Random;
import java.util.Scanner;

public class Ex02Quiz02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		int num = in.nextInt();	
		int get = getnum(num);
		System.out.println("������ȣ : " + get);
	}

	static int getnum(int n) {
		// outputnum : ������ȣ ����
		int outputnum;
		// digit : ���� ��ȣ�� �ִ밪 ����
		// �Է¹޴� n�� ���� 10�� ���� �¼��� ���ϴ� �����̹Ƿ� 
		// digit�� �ʱⰪ�� 1�� �Ͽ� 10�� n�� ���ϵ��� �ڵ�
		int digit = 1;
		// ������ ����ϴ� Math.random()�� ���� �ڵ� ������� 
		// ������ �Ʒ��� ���� Random ��ü�� �����Ͽ� ������ ���� ����.
		Random random = new Random();
		// 10�� �¼��� ǥ���ϱ� ���� 10�� n��(n�� �Է¹��� �ڸ���) ���ϵ��� ����
		for(int i=0;i<n;i++) {
			digit = digit * 10;
		}
		// Random Ŭ���� ���� nextInt�� �̿��Ͽ� ������ ���� ��ȯ
		// ���ڴ� ���� ������ �ִ밪���� ���� : 0 �̻� digit �̸��� ����
		outputnum = random.nextInt(digit);
		return outputnum;
	}
}




/* Quiz
 * �Է��� ���� �ڸ��� ��ŭ�� ���� ������ ���� ���� �� �ֵ��� �ڵ��Ͻÿ�
 * ex) 
 * ���� �Է��ϼ��� : 4
 * 1 ~ 10000 ������ ������ ���� ��ȯ
 * random �޼ҵ� Ȱ��
 */
