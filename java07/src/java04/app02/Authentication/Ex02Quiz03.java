package java04.app02.Authentication;
import java.util.Random;
import java.util.Scanner;

public class Ex02Quiz03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		int num = in.nextInt();	
		int get = getnum(num);
		System.out.println("������ȣ : " + get);
	}

	static int getnum(int n) {
		// pow(a,b)�� a�� b���̶�� ��������
		// pow(10,n)�� 10�� n���� ǥ���� ���̴�.
		// �ִ밪 digit�� pow�� ����� �ʱ�ȭ
		// ��,����ڰ� �Է��� �ڸ����� ������ ���� �ִ밪  digit
		int digit = (int)Math.pow(10,n);
		// Random Ŭ���� ��ü random ����
		Random random = new Random();
		// ������ ������ ���� ������ �޾� ��ȯ���� �ʰ�
		// �ٷ� return ������ 
		// ����) 
		// return new Random().nextInt((int)Math.pow(10,n)); �ε� ǥ���� �� ����
		return random.nextInt(digit);
	}
}




/* Quiz
 * �Է��� ���� �ڸ��� ��ŭ�� ���� ������ ���� ���� �� �ֵ��� �ڵ��Ͻÿ�
 * ex) �ړS
 * ���� �Է��ϼ��� : 4
 * 1 ~ 10000 ������ ������ ���� ��ȯ
 * random �޼ҵ� Ȱ��
 */
